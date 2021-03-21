package com.example.starbucksapi;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.Index;
import javax.persistence.Table;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor

class StarbucksOrder {
  private @Id @GeneratedValue Long id;
  
  private String regid;
  @Column(nullable=false) private String Drink;
  @Column(nullable=false) private String Milk;
  @Column(nullable=false) private String Size;
  @Column(nullable=false) private String Status;
  @Column(nullable=false) private double Total;
}
