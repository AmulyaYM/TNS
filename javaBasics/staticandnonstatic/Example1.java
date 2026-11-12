package staticandnonstatic;
//STATIC IS A KEYWORD
//any method or variable which is declared as static belongs to the class rather than an instance of the class. It can be accessed without creating an object of the class. Static methods can only access static variables and call other static methods directly. They cannot access instance variables or instance methods directly because they do not belong to any specific instance of the class.
//static is a single copy
//whenever you want to access static member of the class we need to use class name.,membername
//static iis always associated with class not with object

class Employee{
    static int salary=10000; 
    public static void details(){
        System.out.println("Employee details");
    }
}

public class Example1 {
    public static void main(String[] args) {
        Employee.details();
        int sal =Employee.salary;
        System.out.println("Salary is: " + Employee.salary);
    }

}
