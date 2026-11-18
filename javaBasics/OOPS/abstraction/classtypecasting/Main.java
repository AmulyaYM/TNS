package OOPS.abstraction.classtypecasting;

class A{
    void disp(){
        System.out.println("display ");
    }
}
class B extends A{
    void show(){
        System.out.println("show");
    }
 }
public class Main {
    public static void main(String[] args){
        //upcasting 
        //done by both implicit and explicit 
         B b = new B();
         A  a = new B();
         a.disp(); 
         //downcasting
         //without upcasting we cant perform down casting
         A a2= new B();
         B b2 =(B) a2;
         b2.show();
         b2.disp();
    }
}
