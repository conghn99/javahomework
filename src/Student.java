import java.time.LocalDate;

public class Student extends User {
    protected boolean isOnline;
    protected String background;

    public Student(String id, String name, Gender gender, LocalDate birthday, String email, String phoneNumber, boolean isOnline, String background) {
        super(id, name, gender, birthday, email, phoneNumber);
        this.isOnline = isOnline;
        this.background = background;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(this.isOnline);
        System.out.println(this.background);
    }
}
