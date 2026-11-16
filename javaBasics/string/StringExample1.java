package string;

public class StringExample1 {
    public static void main(String[] args){
        //string
        //heap 1.const pool area 2.non const pool area
        //1 way to create string
        String name = "abc";
        System.out.println(name);
        //2 waay to create string 
        String name2= new String("abc");
        String name4 = new String("abc");
        System.out.println(name2);
        String name3="abc";

        System.out.println(name==name2);
        System.out.println(name.equals(name2));
        System.out.println(name==name3);
        System.out.println(name.equals(name3));
        System.out.println(name2==name4);
    }

}
