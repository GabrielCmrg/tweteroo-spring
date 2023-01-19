package com.tweteroospring.model;

import com.tweteroospring.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweet {

  public Tweet(TweetDTO data) {
    this.username = data.username();
    this.avatar = data.avatar();
    this.text = data.text();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column
  private String username;

  @Column
  private String avatar;

  @Column
  private String text;
}
