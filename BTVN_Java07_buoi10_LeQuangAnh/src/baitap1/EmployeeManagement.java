package baitap1;

import java.util.Scanner;

public class EmployeeManagement {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            // Hiển thị menu
        	System.out.println();
        	System.out.println("==========================");
            System.out.println("Employee Management System");
            System.out.println("1. Add Full-Time Employee");
            System.out.println("2. Add Part-Time Employee");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1, 2, 3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    // Nhập thông tin cho Nhân viên toàn thời gian
                    System.out.println("\nEnter Full-Time Employee Information:");
                    System.out.print("Name: ");
                    String fullTimeName = scanner.nextLine();
                    System.out.print("Age: ");
                    int fullTimeAge = scanner.nextInt();
                    System.out.print("Salary: ");
                    double fullTimeSalary = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline left-over
                    FullTimeEmployee fullTimeEmp = new FullTimeEmployee(fullTimeName, fullTimeAge, fullTimeSalary);

                    // Hiển thị thông tin và lương của nhân viên toàn thời gian
                    System.out.println("\nFull-Time Employee Info:");
                    fullTimeEmp.display_info();
                    System.out.println("Full-Time Employee Calculated Salary: $" + fullTimeEmp.calculate_salary());
                    break;

                case 2:
                    // Nhập thông tin cho Nhân viên bán thời gian
                    System.out.println("\nEnter Part-Time Employee Information:");
                    System.out.print("Name: ");
                    String partTimeName = scanner.nextLine();
                    System.out.print("Age: ");
                    int partTimeAge = scanner.nextInt();
                    System.out.print("Hours Worked: ");
                    int partTimeHoursWorked = scanner.nextInt();
                    System.out.print("Hourly Rate: ");
                    double partTimeHourlyRate = scanner.nextDouble();

                    PartTimeEmployee partTimeEmp = new PartTimeEmployee(partTimeName, partTimeAge, partTimeHoursWorked, partTimeHourlyRate);

                    // Hiển thị thông tin và lương của nhân viên bán thời gian
                    System.out.println("\nPart-Time Employee Info:");
                    partTimeEmp.display_info();
                    System.out.println("Part-Time Employee Calculated Salary: $" + partTimeEmp.calculate_salary());
                    break;

                case 3:
                    // Thoát chương trình
                    System.out.println("Exiting...");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
                    break;
            }
        }

        scanner.close();
    }
}
