import java.util.Scanner;
public class PairDifferenceGreaterThan5 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((a[i]-a[j])>5)
                count++;
            }
        }
        System.out.print(count);
        s.close();
    }
}
