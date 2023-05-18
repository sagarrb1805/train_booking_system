package com.example.train.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Train {
    @Id
    @GeneratedValue
    private int train_id;
    private String source;
    private String destination;
    private String class_type;
}
