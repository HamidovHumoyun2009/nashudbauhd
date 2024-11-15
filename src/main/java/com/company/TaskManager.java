package com.company;

import com.company.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskManager {
    private List<Employee> employees;
    private List<Task> tasks;

    public TaskManager() {
        this.employees = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void assignTaskToEmployee(int employeeId, org.example.Task task) {
        Employee employee = employees.get(employeeId);
        employee.assignTask(task);
    }

    public List<Task> getOverdueTasks() {
        return tasks.stream()
                .filter(Task::isOverdue)
                .collect(Collectors.toList());
    }

    public void displayAllEmployees() {
        employees.forEach(Employee::displayInfo);
    }
}

