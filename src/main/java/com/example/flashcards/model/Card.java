package com.example.flashcards.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String front;

    private String back;

    @ManyToOne
    @JoinColumn(name = "topic_id", nullable = false)
    private Topic topic;
}
