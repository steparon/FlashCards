package com.example.flashcards.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Table(name = "topics")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;

    @OneToMany(mappedBy = "topic", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Card> cards;
}
