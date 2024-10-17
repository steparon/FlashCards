package com.example.flashcards.repository;

import com.example.flashcards.model.Topic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicRepository extends JpaRepository<Topic, Integer> {
}
