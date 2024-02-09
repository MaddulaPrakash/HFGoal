package com.example.goalservice.controller;

import com.example.goalservice.model.Goal;
import com.example.goalservice.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/goals")
public class GoalController {

    private final GoalService goalService;

    @Autowired
    public GoalController(GoalService goalService) {
        this.goalService = goalService;
    }

    @GetMapping
    public List<Goal> getAllGoals() {
        return goalService.getAllGoals();
    }

    @PostMapping
    public Goal addGoal(@RequestBody Goal goal) {
        return goalService.addGoal(goal);
    }

    @PostMapping("/custom")
    public Goal addCustomGoal(@RequestBody String goalName) {
        Goal goal = new Goal();
        goal.setName(goalName);
        return goalService.addGoal(goal);
    }

    @PostMapping("/submit")
    public ResponseEntity<String> submitSelectedGoals(@RequestBody List<Long> goalIds) {
    // logic here
    }

    @Autowired
    public UserGoalController(UserGoalService userGoalService) {
        this.userGoalService = userGoalService;
    }

    @PostMapping("/save")
    public UserGoal saveUserGoals(@RequestBody UserGoal userGoal) {
        return userGoalService.saveUserGoals(userGoal);
    }

    @GetMapping("/{userId}")
    public List<UserGoal> getUserGoalsByUserId(@PathVariable Long userId) {
        return userGoalService.getUserGoalsByUserId(userId);
    }    
    
    return ResponseEntity.ok("Selected goals submitted successfully");
}


    // Implement other endpoints as needed
}
