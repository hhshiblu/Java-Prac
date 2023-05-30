import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("nahid");
        Student s2 = new Student("sakib");
        Student s3 = new Student("rifat");
        ArrayList<Student> lists = new ArrayList<Student>();
        lists.add(s1);
        lists.add(s2);
        lists.add(s3);

        for (Student s : lists) {
            System.out.println(s.getName());
        }
    }
}