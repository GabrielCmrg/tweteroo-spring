package com.tweteroospring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroospring.dto.UserDTO;
import com.tweteroospring.model.User;
import com.tweteroospring.repository.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository repository;

  public void save(UserDTO reqUserDTO) {
    repository.save(new User(reqUserDTO));
  }
}
