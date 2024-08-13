package baitap3;

public class Courses {
	    private String course_name;
	    private String course_code;
	    private Teacher teacher;

	    public Courses(String course_name, String course_code) {
	        this.course_name = course_name;
	        this.course_code = course_code;
	    }
	    

	    public String getCourse_name() {
			return course_name;
		}


		public void setCourse_name(String course_name) {
			this.course_name = course_name;
		}


		public String getCourse_code() {
			return course_code;
		}


		public void setCourse_code(String course_code) {
			this.course_code = course_code;
		}


		public Teacher getTeacher() {
			return teacher;
		}


		public void setTeacher(Teacher teacher) {
			this.teacher = teacher;
		}


		public void assign_teacher(Teacher teacher) {
	        this.teacher = teacher;
	    }
	    

	    public void display_info() {
	        System.out.println("Course Name: " + course_name);
	        System.out.println("Course Code: " + course_code);
	        if (teacher != null) {
	            System.out.println("Assigned Teacher: " + teacher.name);
	        } else {
	            System.out.println("No teacher assigned yet.");
	        }
	    }
	
}
