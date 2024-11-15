package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private String role;
    private List<org.example.Task> tasks;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
        this.tasks = new ArrayList<>();
    }

    public void assignTask(org.example.Task task) {
        tasks.add(task);
    }

    public List<org.example.Task> getPendingTasks() {
        return tasks.stream()
                .filter(task -> !task.isCompleted())
                .collect(Collectors.toList());
    }

    public void displayInfo() {
        System.out.println("Employee: " + name);
        System.out.println("Role: " + role);
        System.out.println("Assigned : ");
        tasks.forEach(task -> {
            System.out.println("" + task.getTitle() + "  " + task.getDueDate());
        });
    }
}

