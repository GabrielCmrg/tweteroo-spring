package com.tweteroospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroospring.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

}
