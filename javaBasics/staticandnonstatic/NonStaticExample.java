package staticandnonstatic;
//non static-- any member will not declare as static is called non static 
//non static members  can be acessed by the refrence name.member class
//non- sttatic also associated by reference name or object
// non static is multiple copy

class Employee1{
    int empId;
    String empName;
    static String companyName="TNS";
}

class Bank{
    int bal=2000;
    static int empId=2;
    public void showbal(){
        System.out.println("Employee balance is: " + bal);    
    }
    void showId(){
            System.out.println("Employee id is: " + empId);
        }
}

public class NonStaticExample {
    public static void main(String[] args) {
        Bank b = new Bank();
        b.showbal();
        b.showId();
        Bank b1 = new Bank();
        b1.bal=3000;
        b1.empId=3;
        b1.showbal();       
        b1.showId();
        Bank b2 = new Bank();
        b2.showbal();
        b2.showId();
        Employee1 employee = new Employee1();
        System.out.println("Employee id is: " + employee.empId);
        System.out.println("Employee name is: " + employee.empName);

    }

}
