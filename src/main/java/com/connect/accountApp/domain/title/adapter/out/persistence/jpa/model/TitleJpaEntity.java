package com.connect.accountApp.domain.title.adapter.out.persistence.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "title")
@Getter
public class TitleJpaEntity {

  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long titleId;
  private String titleName;
  private String titleImg;

  @Builder
  public TitleJpaEntity(Long titleId, String titleName, String titleImg) {
    this.titleId = titleId;
    this.titleName = titleName;
    this.titleImg = titleImg;
  }
}
