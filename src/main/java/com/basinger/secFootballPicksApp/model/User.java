package com.basinger.secFootballPicksApp.model;

import jakarta.persistence.*;
import lombok.*;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
// @Data annotation: Equivalent to @Getter, @Setter,
// @RequiredArgsConstructor, @ToString, @EqualsAndHashcode
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String cell;
}


