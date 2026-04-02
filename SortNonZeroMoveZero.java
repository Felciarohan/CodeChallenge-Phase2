import java.util.Scanner;
public class SortNonZeroMoveZero {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int k=0;
        for(int i = 0; i < n; i++){
            if(a[i] != 0){
                int t = a[i];
                a[i] = a[k];
                a[k] = t;
                k++;
            }
        }
        for(int i=0;i<k;i++){
           for(int j=i+1;j<k;j++){
            if(a[i]>a[j]){
                int t=a[i];
                a[i]=a[j];
                a[j]=t;
            }
           }
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]);
    }
}
