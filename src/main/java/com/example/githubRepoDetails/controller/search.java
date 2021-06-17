package com.example.githubRepoDetails.controller;

import com.example.githubRepoDetails.dto.*;
import com.example.githubRepoDetails.webClient.GithubWebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping(value = "/repository")
public class search {

    @Autowired
    GithubWebClient githubWebClient;

    @GetMapping(value ="/search")
    public String searchRepo(Model model){

        SearchData searchParam = new SearchData();
        model.addAttribute("searchParam",searchParam);
        return "search";
    }

    @PostMapping(value ="/search")
    public String searchRepo(@ModelAttribute(value="searchParam") SearchData data){
        SearchRepoResp repoList;
        repoList = githubWebClient.getRepoList(data.getData());

        data.setRepoList(repoList.getItems());

        return "search";
    }

    @GetMapping(value ="/details/{owner}/{repo}")
    public String repoDetails(Model model, @PathVariable String owner, @PathVariable String repo){

        RepoDetails searchParam = new RepoDetails();
        List<Contributor> contributors = githubWebClient.getContributorsList(owner, repo);
        CommitProjectionDetails commitProjectionDetails = githubWebClient.getProjectionByCommit(owner, repo);
        searchParam.setContributors(contributors);
        searchParam.setCommitProjectionDetails(commitProjectionDetails);

        searchParam.setName(repo);

        model.addAttribute("searchParam",searchParam);
        return "repo-details";
    }
}
