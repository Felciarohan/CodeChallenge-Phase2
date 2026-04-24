import java.util.Arrays;
import java.util.Scanner;
public class NextGreatestElement {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        int result[]=new int[n];
        Arrays.fill(result,-1);
        for(int i=0;i<n;i++){
          for(int j=1;j<n;j++){
            int index=(i+j)%n;
            if(a[index]>a[i]){
                result[i]=a[index];
                break;
            }
          }       
    }
    for(int i=0;i<n;i++)
    System.out.print(result[i]);
    s.close();
}
}
