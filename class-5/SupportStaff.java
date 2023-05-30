public class SupportStaff extends Employee {
    private String jobTitle;

    public SupportStaff(int empID, String name, double salary, String jobTitle) {
        super(empID, name, salary);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String toString() {
        return super.toString() + ", job post is " + jobTitle;
    }
}
