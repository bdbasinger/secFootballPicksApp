package com.basinger.secFootballPicksApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer weekNumber;
    private String homeTeam;
    private String awayTeam;

    @Override
    public String toString() {
        return "Game{" +
                "GAME ID:" + id +
                ", week: " + weekNumber +
                ", homeTeam:'" + homeTeam + '\'' +
                ", awayTeam:'" + awayTeam + '\'' +
                '}';
    }


}
