package javaProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskList taskList = new TaskList("Work Tasks");

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter your choice:");
            System.out.println("1. Add a task");
            System.out.println("2. Delete a task");
            System.out.println("3. Display tasks");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter task description:");
                    String description = scanner.nextLine();
                    System.out.println("Enter task priority:");
                    int priority = scanner.nextInt();
                    scanner.nextLine();

                    BasicTask newTask = new BasicTask(description, priority);
                    taskList.addTask(newTask);
                    System.out.println("Task added successfully!");
                    break;

                case 2:
                    System.out.println("Enter the index of the task to delete:");
                    int index = scanner.nextInt();
                    scanner.nextLine();

                    ArrayList<Task> taskListTasks = taskList.getTasks();

                    if (index >= 0 && index < taskListTasks.size()) {
                        Task taskToDelete = taskListTasks.get(index);
                        taskList.removeTask(taskToDelete);
                        System.out.println("Task deleted successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 3:
                    taskList.display();
                    break;

                case 4:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close(); // Closing the Scanner object

        System.out.println("Goodbye!");
    }
}
