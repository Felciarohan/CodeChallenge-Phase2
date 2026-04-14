import java.util.Scanner;
public class StringCompression {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int a[]=new int[256];
        for(int i=0;i<str.length();i++)
        a[str.charAt(i)]++;
        for(int i=0;i<str.length();i++){
            if(a[str.charAt(i)]>0){
                System.out.print(str.charAt(i)+""+a[str.charAt(i)]);
                a[str.charAt(i)]=0;
            }
        }
        s.close();
    }
}
