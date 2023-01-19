package com.tweteroospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroospring.dto.TweetDTO;
import com.tweteroospring.model.Tweet;
import com.tweteroospring.repository.TweetRepository;

@RestController
@RequestMapping("/tweets")
public class TweetController {

  @Autowired
  private TweetRepository repository;

  @PostMapping
  public String postTweet(@RequestBody TweetDTO reqTweetDTO) {
    repository.save(new Tweet(reqTweetDTO));
    return "OK";
  }
}
