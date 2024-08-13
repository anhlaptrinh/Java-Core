package baitap3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SchoolManagement {
	 private static List<Student> students = new ArrayList<>();
	    private static List<Teacher> teachers = new ArrayList<>();
	    private static List<Courses> courses = new ArrayList<>();

	    public static void main(String[] args) {
	        createSampleData(); // Tạo dữ liệu giả

	        Scanner scanner = new Scanner(System.in);
	        boolean running = true;

	        while (running) {
	            // Hiển thị menu
	        	System.out.println();
	        	System.out.println("========================");
	            System.out.println("School Management System");
	            System.out.println("1. Add Student");
	            System.out.println("2. Add Teacher");
	            System.out.println("3. Enroll Student in Course");
	            System.out.println("4. Display Course Info");
	            System.out.println("5. Display Student Info");
	            System.out.println("6. Exit");
	            System.out.print("Choose an option (1, 2, 3, 4, 5, 6): ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Consume newline left-over

	            switch (choice) {
	                case 1:
	                    // Nhập thông tin cho học sinh
	                    System.out.println("\nEnter Student Information:");
	                    System.out.print("Name: ");
	                    String studentName = scanner.nextLine();
	                    System.out.print("Age: ");
	                    int studentAge = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline left-over
	                    System.out.print("Address: ");
	                    String studentAddress = scanner.nextLine();
	                    System.out.print("Student ID: ");
	                    String studentId = scanner.nextLine();

	                    Student student = new Student(studentName, studentAge, studentAddress, studentId);
	                    students.add(student);
	                    System.out.println("\nStudent Added:");
	                    student.display_info();
	                    break;

	                case 2:
	                    // Nhập thông tin cho giáo viên
	                    System.out.println("\nEnter Teacher Information:");
	                    System.out.print("Name: ");
	                    String teacherName = scanner.nextLine();
	                    System.out.print("Age: ");
	                    int teacherAge = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline left-over
	                    System.out.print("Address: ");
	                    String teacherAddress = scanner.nextLine();
	                    System.out.print("Employee ID: ");
	                    String employeeId = scanner.nextLine();

	                    // Nhập thông tin khóa học mới
	                    String courseName;
	                    String courseCode;
	                    
	                    while (true) {
	                        System.out.print("Course Name: ");
	                        courseName = scanner.nextLine();
	                        System.out.print("Course Code: ");
	                        courseCode = scanner.nextLine();

	                        // Kiểm tra xem mã khóa học đã tồn tại chưa
	                        if (findCourseByCode(courseCode) == null || findCourseByName(courseName)==null) {
	                            break; // Thoát vòng lặp nếu mã khóa học chưa tồn tại
	                        } else {
	                            System.out.println("Course code already exists. Please enter a new course code.");
	                        }
	                    }

	                    // Tạo đối tượng giáo viên mới
	                    Teacher teacher = new Teacher(teacherName, teacherAge, teacherAddress, employeeId);

	                    // Tạo đối tượng khóa học mới
	                    Courses course = new Courses(courseName, courseCode);
	                    course.assign_teacher(teacher); // Gán giáo viên cho khóa học

	                    // Thêm khóa học vào danh sách khóa học
	                    courses.add(course);
	                    teacher.assign(course.getCourse_name());
	                    // Thêm giáo viên vào danh sách giáo viên
	                    teachers.add(teacher);

	                    System.out.println("\nTeacher Added:");
	                    teacher.display_info();
	                    
	                    break;

	                case 3:
	                    // Nhập thông tin cho học sinh và khóa học để đăng ký
	                    System.out.println("\nEnroll Student in Course:");
	                    System.out.print("Student ID: ");
	                    String courseNameForEnroll=null;
	                    String studentIdForEnroll = scanner.nextLine();
	                    while(courseNameForEnroll==null) {
	                    	System.out.print("Course Name: ");
	                    	courseNameForEnroll = scanner.nextLine();
	                    	for(Student stud:students) {
	                    		if(stud.getStudent_id().equalsIgnoreCase(studentIdForEnroll))
	                    		{
	                    			if(stud.getCourses().contains(courseNameForEnroll))
		                    		{
		                    			courseNameForEnroll=null;
		                    			System.out.println("This course is already assign");
		                    		}
	                    		}
	                    		 
	                    	}
	                    	
	                    }

	                    Student studentToEnroll = findStudentById(studentIdForEnroll);
	                    Courses courseToEnroll = findCourseByName(courseNameForEnroll);

	                    if (studentToEnroll != null && courseToEnroll != null) {
	                        studentToEnroll.enroll(courseNameForEnroll);
	                        System.out.println("Student " + studentIdForEnroll + " enrolled in course " + courseNameForEnroll);
	                    } else {
	                        if (studentToEnroll == null) {
	                            System.out.println("Student with ID " + studentIdForEnroll + " does not exist.");
	                        }
	                        if (courseToEnroll == null) {
	                            System.out.println("Course " + courseNameForEnroll + " does not exist.");
	                        }
	                    }
	                    break;

	                case 4:
	                    // Hiển thị thông tin khóa học
	                    System.out.println("\nCourse Information:");
	                    for (Courses course2 : courses) {
	                        course2.display_info();
	                        System.out.println("--------------------");
	                    }
	                    break;

	                case 5:
	                    // Hiển thị thông tin học sinh
	                    System.out.println("\nStudent Information:");
	                    for (Student stud : students) {
	                        stud.display_info();
	                        System.out.println("--------------------");
	                    }
	                    break;

	                case 6:
	                    // Thoát chương trình
	                    System.out.println("Exiting...");
	                    running = false;
	                    break;

	                default:
	                    System.out.println("Invalid choice. Please select 1, 2, 3, 4, 5, or 6.");
	                    break;
	            }
	        }

	        scanner.close();
	    }

	    private static void createSampleData() {
	        // Tạo dữ liệu giả cho giáo viên
	        Teacher teacher1 = new Teacher("John Doe", 35, "123 Elm Street", "T001");
	        Teacher teacher2 = new Teacher("Jane Smith", 42, "456 Oak Avenue", "T002");
	        Teacher teacher3 = new Teacher("Alice Johnson", 29, "789 Pine Road", "T003");

	        // Thêm các giáo viên vào danh sách giáo viên
	        teachers.add(teacher1);
	        teachers.add(teacher2);
	        teachers.add(teacher3);

	        // Tạo dữ liệu giả cho khóa học
	        Courses course1 = new Courses("Mathematics", "C101");
	        Courses course2 = new Courses("Physics", "C102");
	        Courses course3 = new Courses("Chemistry", "C103");

	        // Gán giáo viên cho khóa học
	        course1.assign_teacher(teacher1);
	        course2.assign_teacher(teacher2);
	        course3.assign_teacher(teacher3);

	        // Thêm các khóa học vào danh sách khóa học
	        courses.add(course1);
	        courses.add(course2);
	        courses.add(course3);

	        // Tạo dữ liệu giả cho học sinh
	        Student student1 = new Student("Emily Davis", 20, "321 Maple Lane", "S001");
	        Student student2 = new Student("Michael Brown", 22, "654 Oak Street", "S002");
	        Student student3 = new Student("Sophia Wilson", 19, "987 Birch Blvd", "S003");

	        // Đăng ký học sinh vào các khóa học
	        student1.enroll("Mathematics");
	        student1.enroll("Physics");

	        student2.enroll("Physics");
	        student2.enroll("Chemistry");

	        student3.enroll("Mathematics");
	        student3.enroll("Chemistry");

	        // Thêm các học sinh vào danh sách học sinh
	        students.add(student1);
	        students.add(student2);
	        students.add(student3);
	    }

	    private static Student findStudentById(String studentId) {
	        for (Student student : students) {
	            if (student.getStudent_id().equals(studentId)) {
	                return student;
	            }
	        }
	        return null;
	    }

	    private static Courses findCourseByName(String courseName) {
	        for (Courses course : courses) {
	            if (course.getCourse_name().equalsIgnoreCase(courseName)) {
	                return course;
	            }
	        }
	        return null;
	    }
	    private static Courses findCourseByCode(String courseCode) {
	        for (Courses course : courses) {
	            if (course.getCourse_code().equalsIgnoreCase(courseCode)) {
	                return course;
	            }
	        }
	        return null;
	    }

	     
}
