import java.util.ArrayList;

// Concrete class representing a task list
public class TaskList extends Task {
    private ArrayList<Task> tasks;

    public TaskList(String description) {
        super(description);
        tasks = new ArrayList<>();
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

    @Override
    public void display() {
        System.out.println("----- " + getDescription() + " -----");
        for (Task task : tasks) {
            task.display();
        }
        System.out.println("-------------------------------");
    }
}

