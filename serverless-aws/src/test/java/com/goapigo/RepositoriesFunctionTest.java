package com.goapigo;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class RepositoriesFunctionTest {
  @Test
  public void userWithRepositories() throws IOException {
    String payload = "{\"version\":\"2.0\",\"routeKey\":\"GET /repositories\",\"rawPath\":\"/repositories\",\"rawQueryString\":\"user=epiresdasilva\",\"headers\":{\"accept\":\"text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7\",\"accept-encoding\":\"gzip, deflate, br\",\"accept-language\":\"en,pt-BR;q=0.9,pt;q=0.8,en-US;q=0.7\",\"content-length\":\"0\",\"host\":\"i01crox7r7.execute-api.us-east-1.amazonaws.com\",\"sec-ch-ua\":\"Google Chrome\"},\"queryStringParameters\":{\"user\":\"epiresdasilva\"},\"requestContext\":{\"accountId\":\"363223992648\",\"apiId\":\"i01crox7r7\",\"domainName\":\"i01crox7r7.execute-api.us-east-1.amazonaws.com\",\"domainPrefix\":\"i01crox7r7\",\"http\":{\"method\":\"GET\",\"path\":\"/repositories\",\"protocol\":\"HTTP/1.1\",\"sourceIp\":\"191.240.218.164\",\"userAgent\":\"Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36\"},\"requestId\":\"OdDMxiX3IAMEJLQ=\",\"routeKey\":\"GET /repositories\",\"stage\":\"$default\",\"time\":\"15/Nov/2023:19:15:03 +0000\",\"timeEpoch\":1700075703870},\"isBase64Encoded\":false}";
    Gson gson = new Gson();
    Type type = new TypeToken<HashMap<String, Object>>(){}.getType();
    HashMap<String, Object> request = gson.fromJson(payload, type);

    ApiGatewayResponse response = new Handler().handleRequest(request, null);
    assertThat(response).isNotNull();
    assertThat(response.getStatusCode()).isEqualTo(200);
    assertThat(response.getBody()).contains("clipper-function");
  }
}
