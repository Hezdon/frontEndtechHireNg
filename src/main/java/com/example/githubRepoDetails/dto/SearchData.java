package com.example.githubRepoDetails.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonIgnoreProperties
@NoArgsConstructor
public class SearchData {
    String data;

    List<SearchRepoResponse> repoList;
}
