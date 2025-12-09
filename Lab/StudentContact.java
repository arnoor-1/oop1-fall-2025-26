package Lab;

// -------------------- CONTACT --------------------
class Contact {
    private String phone;
    private String email;

    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "Phone: " + phone + ", Email: " + email;
    }
}

// -------------------- STUDENT --------------------
class Student {
    private String name;
    private Contact contact; // Student HAS a Contact

    public Student(String name, Contact contact) {
        this.name = name;
        this.contact = contact;
    }

    public void showStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Contact: " + contact);
    }
}

// -------------------- SCHOOL --------------------
class School {
    private String schoolName;
    private Student[] students;
    private int count = 0;

    public School(String schoolName, int numberOfStudents) {
        this.schoolName = schoolName;
        this.students = new Student[numberOfStudents]; // fixed-size array
    }

    public void addStudent(Student s) {
        if (count < students.length) {
            students[count] = s;
            count++;
        } else {
            System.out.println("Cannot add more students to " + schoolName);
        }
    }

    public void showStudents() {
        System.out.println("School: " + schoolName);
        System.out.println("Students:");
        for (int i = 0; i < count; i++) {
            students[i].showStudentInfo();
            System.out.println();
        }
    }
}

// -------------------- MAIN --------------------
public class SchoolRelationship {
    public static void main(String[] args) {

        // ---------- Relationship 1: School has many Students ----------
        School school = new School("Green Valley School", 3);

        school.addStudent(new Student("Alice",
                new Contact("01711111111", "alice@email.com")));

        school.addStudent(new Student("Bob",
                new Contact("01822222222", "bob@email.com")));

        school.addStudent(new Student("Charlie",
                new Contact("01933333333", "charlie@email.com")));

        school.showStudents();
    }
}

    
}
