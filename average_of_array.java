import java.util.Scanner;
public class average_of_array {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int sum=0;
        double avg=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        avg=sum/n;
        System.out.print(avg);
    }
}
