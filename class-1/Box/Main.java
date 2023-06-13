
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a new TaskList object
        TaskList taskList = new TaskList("Work Tasks");

        // Create a new Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        // Loop until the user wants to exit
        while (!exit) {

            // Print out the menu options
            System.out.println("Enter your choice:");
            System.out.println("1. Add a task");
            System.out.println("2. Read a task");
            System.out.println("3. update task");
            System.out.println("4. delete task");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                // Add a new task
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

                // Read a task
                case 2:
                    System.out.println("Enter the index of the task to read:");
                    int readIndex = scanner.nextInt();
                    scanner.nextLine();

                    ArrayList<Task> taskListTasks = taskList.getTasks();

                    if (readIndex >= 0 && readIndex < taskListTasks.size()) {
                        Task taskToRead = taskListTasks.get(readIndex);
                        System.out.println("Task at index " + readIndex + ":");
                        taskToRead.display();
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                // update
                case 3:
                    System.out.println("Enter the index of the task to update:");
                    int updateIndex = scanner.nextInt();
                    scanner.nextLine();

                    ArrayList<Task> taskListTasksToUpdate = taskList.getTasks();

                    if (updateIndex >= 0 && updateIndex < taskListTasksToUpdate.size()) {
                        Task taskToUpdate = taskListTasksToUpdate.get(updateIndex);
                        System.out.println("Enter new task description:");
                        String newDescription = scanner.nextLine();
                        System.out.println("Enter new task priority:");
                        int newPriority = scanner.nextInt();
                        scanner.nextLine();

                        taskToUpdate.setDescription(newDescription);
                        taskToUpdate.setPriority(newPriority);
                        System.out.println("Task updated successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                // Delete a task
                case 4:
                    System.out.println("Enter the index of the task to delete:");
                    int deleteIndex = scanner.nextInt();
                    scanner.nextLine();

                    ArrayList<Task> taskListTasksToDelete = taskList.getTasks();

                    if (deleteIndex >= 0 && deleteIndex < taskListTasksToDelete.size()) {
                        Task taskToDelete = taskListTasksToDelete.get(deleteIndex);
                        taskList.removeTask(taskToDelete);
                        System.out.println("Task deleted successfully!");
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                // Exit the program
                case 5:
                    exit = true;
                    break;

                // If the user enters an invalid choice, print out an error message
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        // Close the scanner object
        scanner.close();

        System.out.println("Goodbye!");
    }
}
