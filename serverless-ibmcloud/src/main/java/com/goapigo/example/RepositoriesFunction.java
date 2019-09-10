package com.goapigo.example;

import com.goapigo.core.GoApiGoProcessor;
import com.goapigo.example.dto.RepositoryListDTO;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class RepositoriesFunction {
  public static JsonObject main(JsonObject request) throws IOException {
    String user = request.get("user").getAsString();
    Document document = Jsoup.connect("https://github.com/" + user + "?tab=repositories").get();
    RepositoryListDTO repositories =
        new GoApiGoProcessor().go(document.html(), RepositoryListDTO.class);
    return new Gson().toJsonTree(repositories).getAsJsonObject();
  }
}
