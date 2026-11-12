package OOPS.Polymorphism;

public class CalculateMarks {

    public void marks(int a) {
        System.out.println("Marks of student is " + a);
    }

    public void marks(int a, int b) {
        System.out.println("Marks of student is " + (a + b));
    }

    public void marks(int a, int b, int c) {
        System.out.println("Marks of student is " + (a + b + c));
    }

    public static void main(String[] args) {

        CalculateMarks marks = new CalculateMarks();

        marks.marks(90);
        marks.marks(90, 80);
        marks.marks(90, 80, 70);
    }
}