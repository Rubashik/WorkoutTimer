package com.example.lab8;

public class Workout {
    private String name;
    private String description;

    private int workoutId;

    public Workout(int workoutId, String name, String description) {
        this.workoutId = workoutId;
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public int getWorkoutId() {
        return workoutId;
    }

    public String getDescription() {
        return description;
    }

    // Static array of sample workouts
    public static Workout[] workouts = {
            new Workout(0, "The Limb Loosener", "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout(1, "Core Agony", "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new Workout(2, "The Wimp Special", "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout(3, "Strength and Length", "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };
}

