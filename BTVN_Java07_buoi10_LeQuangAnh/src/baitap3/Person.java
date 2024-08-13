package baitap3;

import java.util.ArrayList;
import java.util.List;

public class Person {
	protected String name;
    protected int age;
    protected String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display_info() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
class Student extends Person {
    private String student_id;
    private List<String> courses;

    public Student(String name, int age, String address, String student_id) {
        super(name, age, address);
        this.student_id = student_id;
        this.courses = new ArrayList<>();
    }
    

    public String getStudent_id() {
		return student_id;
	}


	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}


	public List<String> getCourses() {
		return courses;
	}


	public void setCourses(List<String> courses) {
		this.courses = courses;
	}


	@Override
    public void display_info() {
        super.display_info();
        System.out.println("Student ID: " + student_id);
        System.out.println("Courses Enrolled: " + courses);
    }

    public void enroll(String course) {
        courses.add(course);
    }
}
class Teacher extends Person {
    private String employee_id;
    private List<String> subjects;

    public Teacher(String name, int age, String address, String employee_id) {
        super(name, age, address);
        this.employee_id = employee_id;
        this.subjects = new ArrayList<>();
    }
    

    public String getEmployee_id() {
		return employee_id;
	}


	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}


	public List<String> getSubjects() {
		return subjects;
	}


	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}


	@Override
    public void display_info() {
        super.display_info();
        System.out.println("Employee ID: " + employee_id);
        System.out.println("Subjects Taught: " + subjects);
    }

    public void assign(String subject) {
        subjects.add(subject);
    }
}
