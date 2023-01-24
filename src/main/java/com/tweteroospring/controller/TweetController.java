package com.tweteroospring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroospring.dto.TweetReqDTO;
import com.tweteroospring.model.Tweet;
import com.tweteroospring.service.TweetService;

@RestController
@RequestMapping("/tweets")
public class TweetController {

  @Autowired
  private TweetService service;

  @PostMapping
  public String postTweet(@RequestBody TweetReqDTO reqTweetDTO) {
    service.save(reqTweetDTO);
    return "OK";
  }

  @GetMapping
  public List<Tweet> findAll() {
    return service.findAll();
  }
}
