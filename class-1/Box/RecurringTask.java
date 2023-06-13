
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

    @Override
    public void setDescription(String description) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDescription'");
    }

    @Override
    public void setPriority(int priority) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPriority'");
    }
}

