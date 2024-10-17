package com.example.flashcards.model.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CardDto {

    @NotBlank(message = "Card's side cannot be empty")
    private String front;

    @NotBlank(message = "Card's cannot be empty")
    private String back;

    @NotNull(message = "Topic ID is required")
    private int topicId;
}
