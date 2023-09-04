package com.basinger.secFootballPicksApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity(name = "_UserPicks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pick {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String team;
    private String opponent;
    private Integer week;
    private String result;

}
