public class Operators {
    public static void main(String[] bindu) {
        //arithmetic = + - / *
        //conditional = == , !=, <= , >=, <, >
        //relational = ==, !=
        //logical = &&, ||, !
        //bitwise = &, |, ~, ^
        //ternary = 

        System.out.println("Conditional Operators");
        System.out.println(10 == 10);
        System.out.println(10 <= 10);
        System.out.println(10 >= 10);
        System.out.println(10 != 10);
        System.out.println();

        System.out.println("Bitwise Operators");
        System.out.println(10 & 10);
        System.out.println(2 & 3);
        System.out.println(3 & 3);
        //010
        //101
        //000

        System.out.println(5 & 6);
        System.out.println(2 & 5);
        System.out.println(10 | 10);
        System.out.println(10 ^ 10);
        System.out.println(~10);
        System.out.println();

        System.out.println("Logical Operators");
        System.out.println(10 == 10 && 10 != 10);
        System.out.println(10 == 10 || 10 != 10);
        System.out.println(!true);
        System.out.println();

        System.out.println("Relational Operators");
        System.out.println(10 == 10);
        System.out.println(10 != 10);
        System.out.println();

        System.out.println("Ternary Operators");
        int a = 10;
        int b = 20;
        int c = (a > b) ? a : b;
        System.out.println(c);
        System.out.println();


        System.out.println("Arithmetic Operators");
        System.out.println(10 + 10);   
        System.out.println(10 - 10);
        System.out.println(10 * 10);
        System.out.println(10 / 10);

        System.out.println(10>>3); //1010 
         System.out.println(8>>2);
        System.out.println(50>>5);


    }
}
