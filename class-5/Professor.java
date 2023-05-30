public class Professor extends Employee {
    private String subjectOfExpertise;

    public Professor(int empID, String name, double salary, String subjectOfExpertise) {
        super(empID, name, salary);
        this.subjectOfExpertise = subjectOfExpertise;
    }

    public String getSubjectOfExpertise() {
        return subjectOfExpertise;
    }

    public String toString() {
        return super.toString() + ", Professor in        " + subjectOfExpertise;
    }
}