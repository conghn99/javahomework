import java.time.LocalDate;

public class Employee {
    public enum Gender {
        MALE("M"),
        FEMALE("F");
    
        String code;
    
        Gender(String code) {
            this.code = code;      
        }
    
        public static Gender genderByCode(String code) {
            for (Gender gender : Gender.values()) {
                if (gender.code.equals(code)) {
                    return gender;
                }
            }
            return null;
        }
    }
    public String id;
    public String name;
    public LocalDate birthDate;
    public Gender gender;
    public double salaryMonth;

    public Employee(String id, String name, LocalDate birthDate, Gender gender, double salaryMonth) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.salaryMonth = salaryMonth;
    }

    public boolean hasKeyword(String keyword) {
        boolean result = this.name.contains(keyword);
        return result;
    }
    
}
