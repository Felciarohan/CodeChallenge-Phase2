import java.util.Scanner;
public class product_array {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int res[]=new int[n];
        int total=1;
        for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
             if(i!=j)
             total=total*a[j];
           }
           res[i]=total;
           total=1;
        }
        for(int i=0;i<n;i++)
        System.out.println(res[i]);
    }
}
