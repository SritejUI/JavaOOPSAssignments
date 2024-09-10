import java.util.Scanner;

public class qs2_10 {

    public static class Member {
        String name;
        int age;
        String phoneNumber;
        String address;
        double salary;

        public void printSalary() {
            System.out.println("Salary: " + salary);
        }
    }

    public static class Hostel {
        String hostelName;
        int numberOfRooms;

        public Hostel(String hostelName, int numberOfRooms) {
            this.hostelName = hostelName;
            this.numberOfRooms = numberOfRooms;
        }

        public void printHostelDetails() {
            System.out.println("Hostel Name: " + hostelName);
            System.out.println("Number of Rooms: " + numberOfRooms);
        }
    }

    public static interface Department {
        String departmentName = "";
        int numberOfFaculty = 0;

        void printDepartmentDetails();
    }

    public static class Student extends Hostel implements Department {
        String studentName;
        String rollNumber;
        int yearOfStudy;
        String homeTown;

        public Student(String hostelName, int numberOfRooms, String studentName, String rollNumber, int yearOfStudy, String homeTown) {
            super(hostelName, numberOfRooms);
            this.studentName = studentName;
            this.rollNumber = rollNumber;
            this.yearOfStudy = yearOfStudy;
            this.homeTown = homeTown;
        }

        @Override
        public void printDepartmentDetails() {
            System.out.println("Department Name: " + departmentName);
            System.out.println("Number of Faculty: " + numberOfFaculty);
        }

        public void printStudentInfo() {
            System.out.println("Student Name: " + studentName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Year of Study: " + yearOfStudy);
            System.out.println("Home Town: " + homeTown);
            printHostelDetails();
            printDepartmentDetails();
        }
    }

    public static void main(String[] args) {
        final int MAX_STUDENTS = 100;
        Student[] students = new Student[MAX_STUDENTS];
        int studentCount = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Admit the new student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display student information");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    if (studentCount < MAX_STUDENTS) {
                        admitNewStudent(students, studentCount);
                        studentCount++;
                    } else {
                        System.out.println("Cannot admit more students. Array is full.");
                    }
                    break;
                case 2:
                    migrateStudent(students, studentCount);
                    break;
                case 3:
                    displayStudentInfo(students, studentCount);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    private static void admitNewStudent(Student[] students, int studentCount) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hostel name: ");
        String hostelName = scanner.nextLine();
        System.out.print("Enter number of rooms: ");
        int numberOfRooms = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter roll number: ");
        String rollNumber = scanner.nextLine();
        System.out.print("Enter year of study: ");
        int yearOfStudy = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter home town: ");
        String homeTown = scanner.nextLine();

        students[studentCount] = new Student(hostelName, numberOfRooms, studentName, rollNumber, yearOfStudy, homeTown);
        System.out.println("Student admitted successfully.");
    }

    private static void migrateStudent(Student[] students, int studentCount) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter roll number of the student to migrate: ");
        String rollNumber = scanner.nextLine();
       
        for (int i = 0; i < studentCount; i++) {
            if (students[i].rollNumber.equals(rollNumber)) {
                System.out.print("Enter new hostel name: ");
                String newHostelName = scanner.nextLine();
                System.out.print("Enter new number of rooms: ");
                int newNumberOfRooms = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                students[i].hostelName = newHostelName;
                students[i].numberOfRooms = newNumberOfRooms;
                System.out.println("Student migrated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    private static void displayStudentInfo(Student[] students, int studentCount) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter roll number to display information: ");
        String rollNumber = scanner.nextLine();

        for (int i = 0; i < studentCount; i++) {
            if (students[i].rollNumber.equals(rollNumber)) {
                students[i].printStudentInfo();
                return;
            }
        }
        System.out.println("Student not found.");
    }
}