class RecurringTask extends Task {
    private String recurringFrequency;

    public RecurringTask( String description, String recurringFrequency) {
        super( description);
        this.recurringFrequency = recurringFrequency;
    }

    @Override
    public void display() {
        String status = isComplete() ? "[X]" : "[ ]";
        System.out.println(status + " Recurring (" + recurringFrequency + "): " + " - " + getDescription());
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public void setPriority(int priority) {
        // No priority for recurring tasks
        throw new UnsupportedOperationException("Recurring tasks do not have priority.");
    }
}
