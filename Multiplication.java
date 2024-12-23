import java.util.*;

public class Multiplication {
    public static int calProduct(int a,int b){
        return a*b;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println("Product of two no.is:" +calProduct(a,b));
    }
}
