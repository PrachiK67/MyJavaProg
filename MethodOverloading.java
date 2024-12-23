public class MethodOverloading {
    void multiply(int a,int b){
        System.out.println("Result is"+(a*b));
    }
    void multiply(int a,int b,int c) {
        System.out.println("Result is" +(a*b*c));
    }
    public static void main(String[] args){
        MethodOverloading obj = new MethodOverloading();
        obj.multiply(8,5);
        obj.multiply(4,6,2);
    }
}
