class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name : " + name +
               "\nAge : " + age;
    }
}

class Student extends Person {

    final String studentId;
    double gpa;

    Student(String name, int age, String studentId, double gpa) {
        super(name, age);      // Calls Person constructor
        this.studentId = studentId;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nStudent ID : " + studentId +
               "\nGPA : " + gpa;
    }
}

class GradStudent extends Student {

    String thesis;

    GradStudent(String name, int age, String studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);    // Calls Student constructor
        this.thesis = thesis;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nThesis : " + thesis;
    }
}

public class UniversitySystem {

    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Mayank Saraswat",
                22,
                "GLA2026001",
                9.1,
                "Artificial Intelligence in Healthcare"
        );

        System.out.println("Graduate Student Details");
        System.out.println(gs);

        System.out.println("\nIS-A Relationship Demonstration");

        Person p = gs;
        Student s = gs;
        GradStudent g = gs;

        System.out.println("GradStudent IS-A Student : " + (g instanceof Student));
        System.out.println("Student IS-A Person      : " + (s instanceof Person));
        System.out.println("GradStudent IS-A Person  : " + (g instanceof Person));

        System.out.println("\nDynamic Method Dispatch");

        System.out.println("\nPerson Reference:");
        System.out.println(p);

        System.out.println("\nStudent Reference:");
        System.out.println(s);

        System.out.println("\nGradStudent Reference:");
        System.out.println(g);
    }
}