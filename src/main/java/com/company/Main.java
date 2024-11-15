package com.company;
import com.company.Employee;
import com.company.Task;
import com.company.TaskManager;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();

        Employee employee1 = new Employee("Ali", "Developer");
        Employee employee2 = new Employee("Zuhra", "Manager");

        Task task1 = new Task("Code Review", "Review the new feature implementation", LocalDate.of(2024, 11, 20));
        Task task2 = new Task("Team Meeting", "Attend the weekly team meeting", LocalDate.of(2024, 11, 15));
        Task task3 = new Task("Write Documentation", "Document the API changes", LocalDate.of(2024, 11, 18));

        taskManager.addEmployee(employee1);
        taskManager.addEmployee(employee2);

        taskManager.addTask(task1);
        taskManager.addTask(task2);
        taskManager.addTask(task3);

        taskManager.assignTaskToEmployee(0, task1);
        taskManager.assignTaskToEmployee(0, task3);
        taskManager.assignTaskToEmployee(1, task2);

        System.out.println("All Employees and their Tasks");
        taskManager.displayAllEmployees();

        System.out.println("Overdue Tasks");
        taskManager.getOverdueTasks().forEach(task -> {
            System.out.println(task.getTitle() + " " + task.getDueDate() + "");
        });



        System.out.println("Marking Task as Completed");
        task1.markAsComplete();

    }
}

