package com.tweteroospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroospring.repository.TweetRepository;

@RestController
@RequestMapping("/tweets")
public class TweetController {

  @Autowired
  private TweetRepository repository;
}
