import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;

public class Main2 {
    public static void sortName(User[] userList) {
        User temp;
        for (int i = 0; i < userList.length; i++) {
            for (int j = 0; j < userList.length; j++) {
                if (userList[i].name.compareTo(userList[j].name) < 0) {
                    temp = userList[i]; 
                    userList[i] = userList[j];
                    userList[j] = temp;
                }
            }
        }
    }

    public static void sortAge(User[] userList) {
        LocalDate currentDate = LocalDate.now();
        User temp1;
        for (int i = 0; i < userList.length; i++) {
            for (int j = 0; j < userList.length; j++) {
                if (userList[j].birthday.compareTo(userList[i].birthday) > 0) {
                    temp1 = userList[i]; 
                    userList[i] = userList[j];
                    userList[j] = temp1;
                }
            }
        }
    }
    public static void main(String[] arg) {
        User[] userList = new User[8];
        userList[0] = new Teacher("TC01", "Jiraiya", Gender.MALE, LocalDate.of(1990, 11,11), "jiraiya@gmail.com", "0912345678", 10, "front-end JS");
        userList[1] = new Teacher("TC02", "Tsunade", Gender.FEMALE, LocalDate.of(1993, 8,2), "tsunade@gmail.com", "0987654321", 8, "back-end Java");
        userList[2] = new Student("ST01", "Naruto", Gender.MALE, LocalDate.of(1999, 10,10), "naruto@gmail.com", "0912354734", true, "Student");
        userList[3] = new Student("ST02", "Sasuke", Gender.MALE, LocalDate.of(1999, 7,23), "sasuke@gmail.com", "0949948170", true, "Student");
        userList[4] = new Student("ST03", "Sakura", Gender.FEMALE, LocalDate.of(1999, 3,28), "sakura@gmail.com", "0914342225", true, "Student");
        userList[5] = new Student("ST04", "Kakashi", Gender.MALE, LocalDate.of(1995, 9,15), "kakashi@gmail.com", "0932165487", false, "Hokage");
        userList[6] = new Student("ST05", "Obito", Gender.MALE, LocalDate.of(1995, 2,10), "obito@gmail.com", "0987612354", false, "Antagonist");
        userList[7] = new Student("ST06", "Hinata", Gender.FEMALE, LocalDate.of(1999, 12,27), "hinata@gmail.com", "0975386421", true, "Student");

        //Duyệt mảng và in ra thông tin học sinh, bao giáo viên
        for (User user : userList) {
            if (user != null) {
                if (user instanceof Teacher) {
                    Teacher teacher = (Teacher)user;
                    teacher.printInfo();
                } else if (user instanceof Student) {
                    Student student = (Student)user;
                    student.printInfo();
                } else {
                    System.out.println("Loai doi tuong nay ko xac dinh");
                }
            }
        }

        //Tìm kiếm theo keyword bất kỳ nếu xuất hiện trong tên hoặc email hoặc số điện thoại thì in a thông tin người đó
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Nhap tu khoa");
        // String keyword = scanner.nextLine();
        // for (User user : userList) {
        //     if (user != null) {
        //         if (user instanceof Teacher) {
        //             Teacher teacher = (Teacher)user;
        //             if (teacher.hasKeyword(keyword)) {
        //                 teacher.printInfo();
        //             }
        //         } else if (user instanceof Student) {
        //             Student student = (Student)user;
        //             if (student.hasKeyword(keyword)) {
        //                 student.printInfo();
        //             }
        //         } else {
        //             System.out.println("Loai doi tuong nay ko xac dinh");
        //         }
        //     }
        // }
        // scanner.close();

        //Sắp xếp theo tên tăng dần ( theo từ điển a-z,A-Z,0-1-2)
        sortName(userList);
        System.out.println("Ten sau khi duoc sap xep");
        for (int i = 0; i < userList.length; i++) {
			System.out.println(userList[i].name);
		}

        //Sắp xếp theo tuổi giảm dần
        sortAge(userList);
        System.out.println("Tuoi sau khi duoc sap xep");
        for (int i = 0; i < userList.length; i++) {
			System.out.println(userList[i].birthday);
		}
    }
}
