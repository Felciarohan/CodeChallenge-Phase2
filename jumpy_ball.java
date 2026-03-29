import java.util.Scanner;
public class jumpy_ball {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int h=s.nextInt();
        double b=s.nextDouble();
        double down=0,up=0;
        double m=h;
        while(m>1){
           m=m*b;
           if(m<1)
            break;
           down=down+m;
           up=up+m;
        }
        System.out.print(h+down+up);
    }
}
