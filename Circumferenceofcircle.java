//Write a function that takes in the radius as input and return the circumference of a circle
import java.util.*;

public class Circumferenceofcircle {
    public static void Calcircum_circle(int r){
        double Circumference_of_circle,pi=3.14;
        Circumference_of_circle=2*pi*r;
        System.out.println(Circumference_of_circle);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        Calcircum_circle(r);
    }
}
