import java.util.Scanner;
public class NextGreatestElement {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        for(int i=0;i<n;i++){
            int max=-1;
            for(int j=i+1;j<n;j++){
                if(a[i]<a[j]){
                max=a[j];
                break;
                }
            }
            if (max == -1) {
                for (int j = 0; j < i; j++) {
                    if (a[j] > a[i]) {
                        max = a[j];
                        break;
                    }
                }
            }
            System.out.print(max+" ");
        }
    }
}
