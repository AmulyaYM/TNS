package string;
class Employee{
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "id="+id+"\n"+"name="+name;
    }
    public int hashCode(){
        return 123;
    }
}
public class StringExamples {
public static void main(String[] args){
    Employee emp= new Employee(1,"abc");
    System.out.println(emp);
    System.out.println(emp.hashCode());
}
}

