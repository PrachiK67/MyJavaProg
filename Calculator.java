import java.util.*;
public class Calculator {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String choice = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        switch(choice) {
            case "add": {
                c = a + b;
                System.out.println("Sum : " + c);
                break;
            }

            case "sub": {
                c = a - b;
                System.out.println("Diff :" + c);
                break;
            }

            case "div": {
                c = a / b;
                System.out.println("division:" + c);
                break;
            }

            case "Multi": {
                c = a*b;
                System.out.println("Multiplication:"+c);
                break;
            }

            case "fact" : {
                int factorial = 1;
                for (int i = a; i >= 1; i--) {
                    factorial = factorial * i;
                }
                System.out.println("Factorial:"+factorial);
                break;
            }

            default:
                System.out.println("Invalid operation");

        }
    }
}
