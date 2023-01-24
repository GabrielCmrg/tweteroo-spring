package com.tweteroospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroospring.dto.TweetDTO;
import com.tweteroospring.model.Tweet;
import com.tweteroospring.repository.TweetRepository;

@Service
public class TweetService {

  @Autowired
  private TweetRepository repository;

  public void save(TweetDTO reqTweetDTO) {
    repository.save(new Tweet(reqTweetDTO));
  }

  public List<Tweet> findAll() {
    return repository.findAll();
  }
}
