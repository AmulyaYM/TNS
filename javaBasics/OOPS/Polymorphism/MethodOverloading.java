package OOPS.Polymorphism;

//method overloading
//Method overloading is a feature that allows a class to have more than one method with the same name, but different parameters.
//complie time polymorphism
//static polymorphism
//early binding

//a method declaration get bindide to its definition get compile time only so it is called compile time polymorphism
class Calculator {
    public static void add(int a, int b) {
        System.out.println(a + b);
    }
     public static void add(int a, int b,int c) {
        System.out.println(a + b + c);
    }
    public static void add(int a, float b) {
        System.out.println(a + b);
    }

  
}

public class MethodOverloading {
    public static void main(String[] args){
        Calculator.add(10, 20);

        Calculator.add(10, 20, 30);

        Calculator.add(10, 5.5f);
    }
}
