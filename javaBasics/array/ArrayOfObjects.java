package array;
class Employee{
    int id;
    String name;

    Employee(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
    return "id= "+id+"\n"+"name ="+name;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args){
        Employee arr[]={new Employee(1,"xyz")};
        System.out.println(arr[0]);
    }

}
