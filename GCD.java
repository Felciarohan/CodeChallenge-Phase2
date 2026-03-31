import java.util.Scanner;
public class GCD {
    public static void main(String[]args){
       Scanner s=new Scanner(System.in);
       int num1=s.nextInt();
       int num2=s.nextInt();
       while(num2!=0){
        int r=num1%num2;
        num1=num2;
        num2=r;
       }
       System.out.print(num1);
    }
}
