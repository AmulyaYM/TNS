package constructorexample;

//constructor is a special member of class which is used to initialize the variables or data members of class    
//rules:
//constructor name should be same as class name
//constructor will not have any return type
//constructor will be called automatically when we create the object of class
//constructor can be overloaded
//we cannot classify constructor as static, final, abstract or synchronized


class Employee{
    int Id=1;
    String name="Ravi";

     Employee(int Id, String name) {
        this.Id = Id;
        this.name = name;
    }
    Employee() {
        System.out.println("HELLO CONSTRUCTOR");
}
public class Example1 {
    public static void main(String[] args){
        Employee employee = new Employee(1, "Ravi");
        System.out.println("Employee name is: " + employee.name);

        Employee employee1 = new Employee();
        System.out.println("Employee name is: " + employee1.name);

        Employee employee2 = new Employee();
        System.out.println("Employee name is: " + employee2.name);


    }

}
}
