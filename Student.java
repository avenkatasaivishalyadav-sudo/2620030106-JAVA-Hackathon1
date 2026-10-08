import java.util.Scanner;

public class Student {
    // Data members
    private String studentName;
    private int rollNumber;
    private double marks;
    private String courseName;
    private int courseCredits;

    // Parameterized constructor
    public Student(String studentName, int rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }

    // Calculate fee (Rs. 1500 per credit)
    public double calculateFee() {
        return courseCredits * 1500.0;
    }

    // Check eligibility (marks >= 50)
    public boolean checkEligibility() {
        return marks >= 50;
    }

    // Calculate scholarship based on marks
    public double calculateScholarship() {
        double fee = calculateFee();
        if (marks >= 85) {
            return fee * 0.20; // 20%
        } else if (marks >= 70 && marks <= 84) {
            return fee * 0.10; // 10%
        } else {
            return 0.0;        // No scholarship
        }
    }

    // Calculate final fee after deducting scholarship
    public double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }

    // Display all details
    public void displayDetails() {
        System.out.println("\n-------------------------------------------");
        System.out.println("Student Name       : " + studentName);
        System.out.println("Roll Number        : " + rollNumber);
        System.out.println("Marks              : " + marks);
        System.out.println("Course Name        : " + courseName);
        System.out.println("Course Credits     : " + courseCredits);
        System.out.println("Eligibility Status : " + (checkEligibility() ? "Eligible" : "Not Eligible"));
        System.out.println("Total Course Fee   : Rs. " + calculateFee());
        System.out.println("Scholarship Amount : Rs. " + calculateScholarship());
        System.out.println("Final Fee to Pay   : Rs. " + calculateFinalFee());
        System.out.println("-------------------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = sc.nextInt();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine(); // Clear newline buffer

        System.out.print("Enter Course Name: ");
        String courseName = sc.nextLine();

        System.out.print("Enter Course Credits: ");
        int courseCredits = sc.nextInt();

        // Object instantiation
        Student student = new Student(studentName, rollNumber, marks, courseName, courseCredits);

        // Check eligibility and process
        if (student.checkEligibility()) {
            student.displayDetails();
        } else {
            System.out.println("\nRegistration Failed: Student is not eligible for registration (Marks < 50).");
        }

        sc.close();
    }
}