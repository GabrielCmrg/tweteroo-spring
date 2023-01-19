package com.tweteroospring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroospring.dto.UserDTO;
import com.tweteroospring.model.User;
import com.tweteroospring.repository.UserRepository;

@RestController
@RequestMapping("/sign-up")
public class UserController {

  @Autowired
  private UserRepository repository;

  @PostMapping
  public String signup(@RequestBody UserDTO reqUserDTO) {
    repository.save(new User(reqUserDTO));
    return "OK";
  }
}
