package com.goapigo;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.goapigo.core.GoApiGoProcessor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

public class Handler implements RequestHandler<Map<String, Object>, ApiGatewayResponse> {

	private static final Logger LOG = LogManager.getLogger(Handler.class);

	@Override
	public ApiGatewayResponse handleRequest(Map<String, Object> input, Context context) {
		LOG.info("received: {}", input);

		Map<String, String> queryStringParameters = (Map<String, String>) input.get("queryStringParameters");
		String user = queryStringParameters.getOrDefault("user", "");
		try {
			Document document = Jsoup.connect("https://github.com/" + user + "?tab=repositories").get();
			com.goapigo.example.dto.RepositoryListDTO repositories =
					new GoApiGoProcessor().go(document.html(), com.goapigo.example.dto.RepositoryListDTO.class);
			return ApiGatewayResponse.builder()
					.setStatusCode(200)
					.setObjectBody(repositories)
					.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & serverless"))
					.build();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
