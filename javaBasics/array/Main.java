package array;

public class Main {

    public static void main(String[] args) {
        //1st way
        int arr[] = {1, 2, 3, 'a'};
        System.out.println(arr[3]);

        //2nd way
        int arr2[] = new int[6];
        arr2[0] = 2;
        arr2[1] = 3;
        arr2[2] = 4;
        arr2[3] = 5;
        arr2[5] = 6;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

}
