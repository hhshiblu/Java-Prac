abstract class Task {
    protected String description;
    private boolean isComplete;

    public Task(String description) {
        this.description = description;
        this.isComplete = false;
    }

    public abstract void display();

    public void markComplete() {
        isComplete = true;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public String getDescription() {
        return description;
    }

    public abstract void setDescription(String description);

    public abstract void setPriority(int priority);
}