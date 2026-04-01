import java.util.Scanner;
public class student_details {
    String name;
    int rollno;
    int mark;
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        student_details s=new student_details();
        s.name=sc.nextLine();
        s.rollno=sc.nextInt();
        s.mark=sc.nextInt();
        System.out.println("Name: "+s.name);
        System.out.println("Roll No: "+s.rollno);
        System.out.println("Mark: "+s.mark);
        sc.close();
    }
}
