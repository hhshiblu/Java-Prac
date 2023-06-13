import java.util.ArrayList;

// Concrete class representing a task list
class TaskList {
    private String name;
    private ArrayList<Task> tasks;

    public TaskList(String name) {
        this.name = name;
        this.tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void display() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            System.out.println("Task List: " + name);
            for (Task task : tasks) {
                task.display();
            }
        }
    }
}