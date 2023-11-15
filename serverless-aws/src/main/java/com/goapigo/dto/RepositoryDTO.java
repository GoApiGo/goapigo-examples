package com.goapigo.example.dto;

import com.goapigo.core.annotations.GoApiGo;
import com.goapigo.core.annotations.TextBy;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@GoApiGo
public class RepositoryDTO {

  @TextBy("div.col-10.col-lg-9.d-inline-block > div.d-inline-block.mb-1 > h3 > a")
  private String name;

  @TextBy("div.col-10.col-lg-9.d-inline-block > div:nth-child(2) > p")
  private String description;

  @TextBy("div.col-10.col-lg-9.d-inline-block > div.f6.text-gray.mt-2 > a")
  private Integer numberOfForks;
}