package com.goapigo.example;

import com.google.gson.JsonObject;
import org.junit.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class RepositoriesFunctionTest {
  @Test
  public void userWithRepositories() throws IOException {
    JsonObject request = new JsonObject();
    request.addProperty("user", "epiresdasilva");
    JsonObject response = RepositoriesFunction.main(request);
    assertThat(response).isNotNull();
    assertThat(response.getAsJsonArray("repositories")).isNotNull().isNotEmpty();
  }
}
