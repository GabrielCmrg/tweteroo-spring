package com.tweteroospring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroospring.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

  public List<Tweet> findByUsername(String username);
}
