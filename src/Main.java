import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n===== SmartDesk System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> viewStudents();
                case 3 -> searchStudent();
                case 4 -> deleteStudent();
                case 5 -> System.out.println("Exiting... Thank You!");
            }
        } while (choice != 5);
    }

    static void addStudent() {
        System.out.print("Enter Id: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        Student student = new Student(id, name, age);
        students.add(student);
        System.out.println("✅ Student added successfully!");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No records found!");
        } else {
            for (Student student : students) {
                student.displayStudent();
            }
        }
    }

    static void searchStudent() {
        if (students.isEmpty()) {
            System.out.println("No records found!");
        } else {
            System.out.print("Enter Id to search: ");
            int id = sc.nextInt();
            boolean found = false;

            for (Student student: students) {
                if (student.getId() == id) {
                    System.out.println("✅ Student Found:");
                    student.displayStudent();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("❌ No student found with ID: " + id);
            }
        }
    }

    static void deleteStudent() {
        System.out.print("Enter Id to delete: ");
        int id = sc.nextInt();
        boolean removed = students.removeIf( s -> s.getId() == id);
        if (removed) {
            System.out.println("✅ Student deleted successfully!");
        } else {
            System.out.println("❌ Student not found!");
        }
    }
}