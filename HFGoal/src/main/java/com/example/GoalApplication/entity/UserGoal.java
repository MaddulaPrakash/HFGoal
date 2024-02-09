package com.example.goalservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class UserGoal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // User identifier, e.g., user ID or username
    private Long userId;

    // Selected goal IDs
    @ElementCollection
    private List<Long> selectedGoalIds;

    // Custom goal entered by the user
    private String customGoal;
    
}
