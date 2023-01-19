package com.tweteroospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroospring.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
