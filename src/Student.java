public class Student {
    private int id;
    private String name;
    private int age;

    // Constructor
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters
    int getId() { return id; }
    String getName() { return name; }
    int getAge() { return age; }

    // Display details
    public void displayStudent() {
        System.out.println("ID: " + id + " | Name: " + name + " | Age: " + age);
    }
}
