package com.example.githubRepoDetails.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@JsonIgnoreProperties
@NoArgsConstructor
public class RepoDetails {
    List<Contributor> contributors;

    @JsonProperty(value ="avatar_url")
    String avatarUrl;

    String name;

    CommitProjectionDetails commitProjectionDetails;
}
