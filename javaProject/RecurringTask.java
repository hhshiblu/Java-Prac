package javaProject;

// Concrete class representing a recurring task
class RecurringTask extends Task {
    private String recurringFrequency;

    public RecurringTask(String description, String recurringFrequency) {
        super(description);
        this.recurringFrequency = recurringFrequency;
    }

    @Override
    public void display() {
        String status = isComplete() ? "[X]" : "[ ]";
        System.out.println(status + " Recurring (" + recurringFrequency + "): " + getDescription());
    }
}
