package exceptionhandling;

public class ThrowandThrows {

    public static void checkeven(int num) {
        if (num % 2 == 0) {
            System.out.println("even numbver");
        } else {
            throw new ArithmeticException("not even");
        }

    }

    public static void main(String[] args) {
        System.out.println("hello");
        try {
            checkeven(7);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
