class Student{
    int Roll;
    String Name;
    double Marks;

    Student(int R,String N,double M){
        Roll = R;
        Name = N;
        Marks = M;
    }
    Student(String N,double M, int R){
        Roll = R;
        Name = N;
        Marks = M;
    }
    void display(){
        System.out.print("\n\t"+Roll+"\t"+Name+"\t"+Marks);
    }
}
public class ConstructorOverloadingDemo {
    public static void main(String[] args){
        Student S1 = new Student(1,"Prachi",8.16);
        Student S2 = new Student("Veer",7.77,2);

        System.out.println("\n\tRoll\tName\tMarks\n");
        S1.display();
        S2.display();
    }
}
