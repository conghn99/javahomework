import java.time.LocalDate;

public class Teacher extends User {
    protected int yearOfExperiences;
    protected String speciality;

    public Teacher(String id, String name, Gender gender, LocalDate birthday, String email, String phoneNumber, int yearOfExperiences, String speciality) {
        super(id, name, gender, birthday, email, phoneNumber);
        this.yearOfExperiences = yearOfExperiences;
        this.speciality = speciality;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(this.yearOfExperiences);
        System.out.println(this.speciality);
    }
}
