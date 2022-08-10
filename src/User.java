import java.time.LocalDate;

enum Gender {
    MALE,
    FEMALE
}

public class User {
    protected String id;
    protected String name;
    protected Gender gender;
    protected LocalDate birthday;
    protected String email;
    protected String phoneNumber;

    public User(String id, String name, Gender gender, LocalDate birthday, String email, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void printInfo() {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.gender);
        System.out.println(this.birthday);
        System.out.println(this.email);
        System.out.println(this.phoneNumber);
    }

    public boolean hasKeyword(String keyword) {
        boolean result = this.name.contains(keyword) || this.email.contains(keyword) || this.phoneNumber.contains(keyword);
        return result;
    }
}
