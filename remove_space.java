import java.util.Scanner;
public class remove_space {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String c="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' ')
            continue;
            else
            c=c+str.charAt(i);
        }
        System.out.print(c);
    }
}
