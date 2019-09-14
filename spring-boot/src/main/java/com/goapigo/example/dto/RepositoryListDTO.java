package com.goapigo.example.dto;

import com.goapigo.core.annotations.GoApiGo;
import com.goapigo.core.annotations.ListBy;
import java.util.List;
import lombok.Getter;

@Getter
@GoApiGo
public class RepositoryListDTO {

  @ListBy("#user-repositories-list > ul > li")
  private List<RepositoryDTO> repositories;
}
