// Concrete class representing a basic task
class BasicTask extends Task implements Prioritizable {
    private int priority;

    public BasicTask(String description, int priority) {
        super(description);
        this.priority = priority;
    }

    @Override
    public void display() {
        String status = isComplete() ? "[X]" : "[ ]";
        System.out.println(status + " " + getPriority() + ": " + getDescription());
    }

    @Override
    public int getPriority() {
        return priority;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }
}