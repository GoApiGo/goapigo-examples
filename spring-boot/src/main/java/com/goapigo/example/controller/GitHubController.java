package com.goapigo.example.controller;

import com.goapigo.core.GoApiGoProcessor;
import com.goapigo.example.dto.RepositoryListDTO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController("/api/github")
public class GitHubController {

  @GetMapping
  public ResponseEntity<RepositoryListDTO> getRepositories(@RequestParam String user)
      throws IOException {
    Document document = Jsoup.connect("https://github.com/" + user + "?tab=repositories").get();
    return ResponseEntity.ok(new GoApiGoProcessor().go(document.html(), RepositoryListDTO.class));
  }
}
