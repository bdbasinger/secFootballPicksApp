package com.basinger.secFootballPicksApp.model;

import jakarta.persistence.*;
import lombok.*;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Data
@Table(name="picks")
@NoArgsConstructor
@AllArgsConstructor
public class Pick {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    private String prediction; // "W" or "L"

}
