package baitap1;

public class Employee {
	protected String name;
	protected int age;
	protected double salary;
	protected Employee(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	public void display_info() {
		System.out.println("Name: "+name+" | Age: "+age+" | Salary: "+salary);
	}
	public double calculate_salary() {
		return salary;
	}
	
}
class FullTimeEmployee extends Employee{
	private String benefits="Travel after finish job";
	
	protected FullTimeEmployee(String name, int age, double salary) {
		super(name, age, salary);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void display_info() {
		// TODO Auto-generated method stub
		super.display_info();
		System.out.println("Benefit: "+benefits);
	}

	@Override
	public double calculate_salary() {
		// TODO Auto-generated method stub
		return super.calculate_salary();
	}
	
}
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    protected PartTimeEmployee(String name, int age, int hoursWorked, double hourlyRate) {
        super(name, age, 0); // Set salary to 0 as it's not used
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public void display_info() {
        super.display_info();
        System.out.println("Hours Worked: " + hoursWorked + " | Hourly Rate: " + hourlyRate);
    }

    @Override
    public double calculate_salary() {
        return hoursWorked * hourlyRate;
    }
}