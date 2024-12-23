//Write a function which takes in 2 numbers and returns the greater of those two
import java.util.*;

public class GreaterNum {
    public static void Calculation(int a,int b){
        if(a>b){
            System.out.println(a);
        }else if(a==b){
            System.out.println("Both numbers are same");
        }else{
            System.out.println(b);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculation(a,b);

    }
}
