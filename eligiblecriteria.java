//Write a function that takes in age as input and returns if that person is eligible to vote or not.A person of age>18 is eligible to vote.
import java.util.*;

public class eligiblecriteria {
    public static void voting(int n){
        if(n>18){
            System.out.println("A person is eligible to vote.");
        }else{
            System.out.println("A person is not eligible to vote.");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        voting(n);
    }
}
