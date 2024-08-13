package baitap2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManager {
    private List<Student> students;

    public StudentManager() {
        students = new ArrayList<>();
        generateDummyData();
    }

    // Thêm sinh viên vào danh sách
    public void addStudent(Student student) {
        students.add(student);
    }

    // Tìm sinh viên theo mã
    public Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equalsIgnoreCase(id)) {
                return student;
            }
        }
        return null;
    }

    // Tìm sinh viên theo tên
    public List<Student> findStudentsByName(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().contains(name)) {
                result.add(student);
            }
        }
        return result;
    }

    // Xóa sinh viên theo mã
    public boolean removeStudentById(String id) {
        return students.removeIf(student -> student.getId().equalsIgnoreCase(id));
    }

    public List<Student> getTopStudent() {
        if (students.isEmpty()) return null;
        
        List<Student> topStudents = new ArrayList<>();
        double highestScore = Double.NEGATIVE_INFINITY;

        for (Student student : students) {
            double currentScore = student.getAverageScore();
            if (currentScore > highestScore) {
                highestScore = currentScore;
                topStudents.clear(); // Clear the list as we found a new highest score
                topStudents.add(student);
            } else if (currentScore == highestScore) {
                topStudents.add(student); // Add student with the same highest score
            }
        }
        return topStudents;
    }

    // Lấy danh sách sinh viên yếu
    public List<Student> getWeakStudents() {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getClassification().equalsIgnoreCase("Yếu")) {
                result.add(student);
            }
        }
        return result;
    }

    // In danh sách sinh viên
    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    // In điểm trung bình của tất cả sinh viên
    public void printAverageScores() {
        for (Student student : students) {
            System.out.println("Mã SV: " + student.getId() +
                               ", Tên: " + student.getName() +
                               ", Điểm Trung Bình: " + student.getAverageScore());
        }
    }

    // Hàm tạo dữ liệu giả
    private void generateDummyData() {
        students.add(new Student("Nguyen Van A", "SV001", 9.0, 8.5, 9.5));
        students.add(new Student("Tran Thi B", "SV002", 5.5, 6.0, 6.5));
        students.add(new Student("Le Van C", "SV003", 7.0, 8.0, 7.5));
        students.add(new Student("Pham Thi D", "SV004", 4.0, 4.5, 5.0));
        students.add(new Student("Hoang Van F", "SV005", 4.0, 7.0, 5.5));
        students.add(new Student("Phan Van D", "SV005", 7.5, 5.0, 2.5));
        students.add(new Student("Le Van E", "SV005", 6.5, 7.0, 7.5));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. In danh sách sinh viên");
            System.out.println("3. In sinh viên có ĐTB cao nhất");
            System.out.println("4. In sinh viên yếu");
            System.out.println("5. Tìm sinh viên theo tên");
            System.out.println("6. Tìm sinh viên theo mã");
            System.out.println("7. Xóa sinh viên theo mã");
            System.out.println("8. In điểm trung bình của tất cả sinh viên"); // Thêm chức năng tính điểm trung bình
            System.out.println("0. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc ký tự xuống dòng sau khi nhập số

            switch (choice) {
                case 1:
                    System.out.print("Nhập số lượng sinh viên muốn thêm: ");
                    int numberOfStudents = scanner.nextInt();
                    scanner.nextLine(); // Đọc ký tự xuống dòng sau số lượng

                    for (int i = 0; i < numberOfStudents; i++) {
                        System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
                        System.out.print("Tên: ");
                        String name = scanner.nextLine();
                        System.out.print("Mã SV: ");
                        String id = scanner.nextLine();
                        System.out.print("Điểm Toán: ");
                        double math = scanner.nextDouble();
                        System.out.print("Điểm Lý: ");
                        double physics = scanner.nextDouble();
                        System.out.print("Điểm Hóa: ");
                        double chemistry = scanner.nextDouble();
                        scanner.nextLine(); // Đọc ký tự xuống dòng sau khi nhập điểm

                        Student student = new Student(name, id, math, physics, chemistry);
                        manager.addStudent(student);
                    }
                    System.out.println("Đã thêm sinh viên.");
                    break;

                case 2:
                    System.out.println("\nDanh sách sinh viên:");
                    manager.printAllStudents();
                    break;

                case 3:
                    List<Student> topStudent = manager.getTopStudent();
                    if (!topStudent.isEmpty()) {
                        System.out.println("\nSinh viên có ĐTB cao nhất:");
                        for (Student goodStudent : topStudent) {
                            System.out.println(goodStudent);
                        }
                    } else {
                        System.out.println("Không có sinh viên.");
                    }
                    break;

                case 4:
                    List<Student> weakStudents = manager.getWeakStudents();
                    if (!weakStudents.isEmpty()) {
                        System.out.println("\nDanh sách sinh viên yếu:");
                        for (Student weakStudent : weakStudents) {
                            System.out.println(weakStudent);
                        }
                    } else {
                        System.out.println("Không có sinh viên yếu.");
                    }
                    break;

                case 5:
                    System.out.print("Nhập tên sinh viên cần tìm: ");
                    String searchName = scanner.nextLine();
                    List<Student> foundByName = manager.findStudentsByName(searchName);
                    if (!foundByName.isEmpty()) {
                        System.out.println("Kết quả tìm kiếm theo tên:");
                        for (Student foundStudent : foundByName) {
                            System.out.println(foundStudent);
                        }
                    } else {
                        System.out.println("Không tìm thấy sinh viên có tên " + searchName);
                    }
                    break;

                case 6:
                    System.out.print("Nhập mã sinh viên cần tìm: ");
                    String searchId = scanner.nextLine();
                    Student foundById = manager.findStudentById(searchId);
                    if (foundById != null) {
                        System.out.println("Kết quả tìm kiếm theo mã:");
                        System.out.println(foundById);
                    } else {
                        System.out.println("Không tìm thấy sinh viên có mã " + searchId);
                    }
                    break;

                case 7:
                    System.out.print("Nhập mã sinh viên cần xóa: ");
                    String deleteId = scanner.nextLine();
                    boolean deleted=manager.removeStudentById(deleteId);
                    
                    if (deleted) {
                        System.out.println("Đã xóa mã: "+deleteId);
                        
                    } else {
                        System.out.println("Không tìm thấy sinh viên có mã " + deleteId);
                    }
                    break;

                case 8: // Chức năng tính điểm trung bình
                    System.out.println("\nĐiểm trung bình của tất cả sinh viên:");
                    manager.printAverageScores();
                    break;

                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}
