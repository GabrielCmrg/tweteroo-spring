package com.tweteroospring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.tweteroospring.dto.TweetReqDTO;
import com.tweteroospring.dto.TweetSaveDTO;
import com.tweteroospring.model.Tweet;
import com.tweteroospring.model.User;
import com.tweteroospring.repository.TweetRepository;
import com.tweteroospring.repository.UserRepository;

@Service
public class TweetService {

  @Autowired
  private TweetRepository tweetRepository;

  @Autowired
  private UserRepository userRepository;

  public void save(TweetReqDTO reqTweetDTO) {
    User author = userRepository.findByUsername(reqTweetDTO.username());
    TweetSaveDTO tweetSaveDTO = new TweetSaveDTO(author.getUsername(), author.getAvatar(), reqTweetDTO.tweet());
    tweetRepository.save(new Tweet(tweetSaveDTO));
  }

  public Page<Tweet> findAll(int page) {
    final int ITEMS_PER_PAGE = 5;
    Pageable pageSpecs = PageRequest.of(page, ITEMS_PER_PAGE, Sort.by("id").descending());
    return tweetRepository.findAll(pageSpecs);
  }

  public List<Tweet> findByUsername(String username) {
    return tweetRepository.findByUsername(username);
  }
}
