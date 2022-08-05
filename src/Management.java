import java.time.LocalDate;
import java.util.Scanner;

public class Management {
    public static void main(String[] args) {
        Employee[] employeesList = new Employee[5];
        employeesList[0] = new Employee("NV01", "Itachi", LocalDate.of(1990, 6,9), Employee.Gender.genderByCode("M"), 15000.12);
        employeesList[1] = new Employee("NV02", "Nagato", LocalDate.of(1991, 8,19), Employee.Gender.genderByCode("M"), 17000.34);
        employeesList[2] = new Employee("NV03", "Konan", LocalDate.of(1994, 2,20), Employee.Gender.genderByCode("F"), 16000.56);
        employeesList[3] = new Employee("NV04", "Sasori", LocalDate.of(1998, 11,8), Employee.Gender.genderByCode("M"), 11000.78);
        employeesList[4] = new Employee("NV05", "Deidara", LocalDate.of(1999, 5,5), Employee.Gender.genderByCode("F"), 13000.91);

        // Tìm nhân viên theo id ( tìm chính xác)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ID");
        String iD = scanner.nextLine();
        
        for (int i = 0; i < employeesList.length; i++) {
            Employee employee = employeesList[i];
            if (iD == employee.id) {
                System.out.println("Tim thay ID: " + employee.id + " cua " + employee.name);
            }
        }

        // Tìm nhân viên theo tên ( tìm theo từ khoá, ví dụ: Nguyễn Văn A -> nhập A hoặc Văn => đều tìm ra được)
        System.out.println("Nhap ten");
        String keyword = scanner.nextLine();
        for (int i = 0; i < employeesList.length; i++) {
            Employee employee = employeesList[i];
            if (employee.hasKeyword(keyword)) {
                System.out.println("Tim thay ten: " + employee.name);
            }
        }

        // Đếm số nhân viên nam, nữ
        int countMale = 0;
        int countFemale = 0;
        for (int i = 0; i < employeesList.length; i++) {
            Employee employee = employeesList[i];
            if (employee.gender == Employee.Gender.genderByCode("M")) {
                countMale++;
            } else if (employee.gender == Employee.Gender.genderByCode("F")) {
                countFemale++;
            }
        }
        System.out.println("So nhan vien nam la: " + countMale);
        System.out.println("So nhan vien nu la: " + countFemale);

        // Liệt kê các nhân viên trên 30 tuổi
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        System.out.println("Cac nhan vien tren 30 tuoi la");
        for (int i = 0; i < employeesList.length; i++) {
            Employee employee = employeesList[i];
            int birthdayYear = employee.birthDate.getYear();
            int age = currentYear - birthdayYear;
            if (age > 30) {
                System.out.println(employee.name);
            }
        }

        // Nhập từ bàn phím tháng bất kỳ trong năm; kiểm tra xem trong tháng đó có những nhân viên nào có ngày sinh nhật
        System.out.println("Nhap 1 thang bat ky");
        int month = scanner.nextInt();
        for (int i = 0; i < employeesList.length; i++) {
            Employee employee = employeesList[i];
            int birthdayMonth = employee.birthDate.getMonthValue();
            if (month == birthdayMonth) {
                System.out.println("Thang " + month + " co " + employee.name + " sinh nhat vao ngay " + employee.birthDate.getDayOfMonth());
            }
        }
        scanner.close();

        // In ra top 3 người có lương tháng cao nhất
        for (int i = 0; i < employeesList.length - 1; i++) {
            for (int j = 0; j < employeesList.length - i - 1; j++) {
                if (employeesList[j].salaryMonth < employeesList[j + 1].salaryMonth) {
                    double temp = employeesList[j].salaryMonth;
                    employeesList[j].salaryMonth = employeesList[j + 1].salaryMonth;
                    employeesList[j + 1].salaryMonth = temp;
                }
            }
        }
        for (int i = 1; i < 4; i++) {
            System.out.println("Nhan vien co luong thang cao top " + i + " la " + employeesList[i].salaryMonth + " thuoc ve " + employeesList[i].name);
        }
    }
}
