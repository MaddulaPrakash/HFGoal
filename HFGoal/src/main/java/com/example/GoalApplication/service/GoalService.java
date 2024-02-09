package com.example.goalservice.service;

import com.example.goalservice.model.UserGoal;
import com.example.goalservice.repository.UserGoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGoalService {

    private final UserGoalRepository userGoalRepository;

    @Autowired
    public UserGoalService(UserGoalRepository userGoalRepository) {
        this.userGoalRepository = userGoalRepository;
    }

    public UserGoal saveUserGoals(UserGoal userGoal) {
        return userGoalRepository.save(userGoal);
    }

    public List<UserGoal> getUserGoalsByUserId(Long userId) {
        return userGoalRepository.findByUserId(userId);
    }
}
