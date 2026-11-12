package constructorexample;

class Student {

String name= "Amulya" ;
int age=22;


Student() {
System.out.println("hello constructor");
}
Student(String name, int age) {
this.name = name;
this.age = age;
}
}
public class Example2 {

public static void main(String[] args) {

Student ref1 = new Student();
System.out.println("Student name is: " + ref1.name);
System.out.println("Student age is: " + ref1.age);



Student ref2 = new Student("Rajesh", 21);
System.out.println("Student name is: " + ref2.name);
System.out.println("Student age is: " + ref2.age);
}
}