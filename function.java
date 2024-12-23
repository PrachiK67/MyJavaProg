import java.util.*;

public class function {
    public static void Myname(String name){
        System.out.println(name);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name= sc.next();

        Myname(name);
    }
}
