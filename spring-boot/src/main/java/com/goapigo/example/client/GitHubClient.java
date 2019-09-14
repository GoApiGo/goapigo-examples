package com.goapigo.example.client;

import com.goapigo.core.client.annotations.GoClient;
import com.goapigo.core.client.annotations.GoGet;
import com.goapigo.core.client.annotations.GoPath;
import com.goapigo.core.client.annotations.GoPathParam;
import com.goapigo.example.dto.RepositoryListDTO;

@GoClient(url = "https://github.com")
public interface GitHubClient {

  @GoGet
  @GoPath("/{user}?tab=repositories")
  RepositoryListDTO repositories(@GoPathParam("user") String user);
}
