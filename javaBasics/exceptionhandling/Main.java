package exceptionhandling;

public class Main {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4};

        try {
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handle");
        } catch (Exception e) {
            System.out.println("hello from exception");
        } finally {
            System.out.println("hello from finally");
        }

    }
}
