//Enter 3 numbers from the user & make a function to print their average
import java.util.*;

public class Average {
    public static Double CalculateAvg(Double a,Double b, Double c){
        Double Average1;
        Average1= (a+b+c)/3;
        return Average1;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Double a = sc.nextDouble();
        Double b = sc.nextDouble();
        Double c = sc.nextDouble();

        Double Average1 = CalculateAvg(a,b,c);
        System.out.println(Average1);
    }
}
