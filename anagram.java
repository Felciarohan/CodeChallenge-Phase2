import java.util.Scanner;
public class anagram {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        int a[]=new int[256];
        char c1[]=str1.toCharArray();
        char c2[]=str2.toCharArray();
        if(str1.length()!=str2.length()){
        System.out.print("false");
        return;
        }
        for(int i=0;i<str1.length();i++){
            a[c1[i]]++;
            a[c2[i]]++;
        }
        boolean t=true;
        for(int i=0;i<str1.length();i++){
            if(a[c1[i]]!=2){
                t=false;
                break;
            }
        }
        if(t)
        System.out.print("true");
        else
        System.out.print("false");
    }
}
