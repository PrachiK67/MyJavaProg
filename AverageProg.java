import java.util.*;
public class AverageProg{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Total count of number to find the sum & average of:");
        int n = sc.nextInt();
        int sum=0;
        System.out.println("Enter the numbers:");

        for(int i=0; i<n; i++){
            sum+=sc.nextInt();
        }
        double average = sum/(double)n;
        System.out.println("Sum of n given numbers is" +sum);
        System.out.println("Average of n given numbers is" +average);
    }
}
