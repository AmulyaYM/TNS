package methodExample;

public class StaticNonstaticAccess {
     int a = 10;
    static int b = 5;
    public static void add(){
        System.out.println(b);
    }
     
    public void sum(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        add();

        new StaticNonstaticAccess().sum();

    }

}
