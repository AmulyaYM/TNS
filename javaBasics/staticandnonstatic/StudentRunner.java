package staticandnonstatic;

class Students {
    int id;
    String name;
    double marks;
    String subject;

    static String collegeName = "TNS";

    void showStudentDetails() {
        System.out.println("Student id is: " + id);
        System.out.println("Student name is: " + name);
        System.out.println("Student marks is: " + marks);
        System.out.println("Student subject is: " + subject);
    }

    void showCollegeName() {
        System.out.println("College name is: " + collegeName);
    }
}

public class StudentRunner {
    public static void main(String[] args) {

        Students s1 = new Students();

        s1.id = 1;
        s1.name = "Amulya";
        s1.marks = 90.5;
        s1.subject = "Java";

        s1.showStudentDetails();
        s1.showCollegeName();
    }
}