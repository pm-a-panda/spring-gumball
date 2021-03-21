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
@Table()
@Data
@RequiredArgsConstructor

class StarbucksOrder {
  private @Id @GeneratedValue Long id;
  
  private String regid;
  private String Drink;
  private String Milk;
  private String Size;
  private String Status;
  private double Total;
}
