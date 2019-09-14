package com.goapigo.example.controller;

import static com.goapigo.core.client.GoHttpClient.go;

import com.goapigo.example.client.GitHubClient;
import com.goapigo.example.dto.RepositoryListDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/api/github")
public class GitHubController {

  private GitHubClient client = go(GitHubClient.class);

  @GetMapping("/repositories")
  public ResponseEntity<RepositoryListDTO> getRepositories(@RequestParam String user) {
    return ResponseEntity.ok(client.repositories(user));
  }
}
