import java.util.Scanner;
public class swap_without_temp {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Before swap: a="+a+" b="+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.print("After swap: a="+a+" b="+b);
    }
}
