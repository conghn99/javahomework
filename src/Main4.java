import java.util.ArrayList;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Student student1 = new Student("ST1", "Sasuke", "A", 18);
        Student student2 = new Student("ST2", "Naruto", "A", 18);
        Student student3 = new Student("ST3", "Sakura", "B", 18);
        Student student4 = new Student("ST4", "Itachi", "S", 20);
        Student student5 = new Student("ST5", "Kakashi", "S", 20);

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        Class classJava = new Class("java", studentList);

        TechMaster techMaster = new TechMaster();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Xin hay nhap ten quan ly lop hoc:");
        techMaster.setClassManagerName(scanner.nextLine());
        System.out.println("Xin hay nhap ten giao vien:");
        techMaster.setTeacherName(scanner.nextLine());
        techMaster.setClasses(classJava);

        //Hiển thị thông tin chi tiết của trung tâm
        System.out.println(techMaster.toString());

        //Thực hiện thêm học viên vào lớp hiện tại
        System.out.println("Nhap so hoc vien ban muon them");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Nhap ID, ten, hoc luc, tuoi cua hoc vien moi:");
            Student studentX = new Student(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextInt());
            studentList.add(studentX);
        }
        System.out.println(techMaster.toString());

        //Thực hiện cập nhật thông tin học lực của 1b học viên dựa vào Id
        System.out.println("Nhap ID");
        String keyword = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.hasKeyword(keyword)) {
                System.out.println("Xin hay nhap hoc luc moi cho ID " + student.getId());
                student.setAcademicRank(scanner.nextLine());
                studentList.set(i, student);
                break;
            }
        }
        System.out.println(techMaster.toString());

        //Có 1 bạn xin nghỉ học, hãy giúp thầy xóa bạn đó khỏi lớp học
        System.out.println("Xin nhay nhap id cua ban nghi hoc");
        String keyword1 = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.hasKeyword(keyword1)) {
                studentList.remove(student);
            }
        }
        scanner.close();
        System.out.println(techMaster.toString());
    }
}
