import java.util.Scanner;
public class FirstNonRepeatingCharIndex {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            count=0;
            for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                System.out.println(i);
                break;
            }
        }
        s.close();
    }
}
