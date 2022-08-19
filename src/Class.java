import java.util.ArrayList;

public class Class {
    private String subject;
    private ArrayList<Student> student;

    public Class(String subject, ArrayList<Student> student) {
        this.subject = subject;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Class{" +
                "Subject=" + subject +
                ", Student List=" + student +
                '}';
    }
}
