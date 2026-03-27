import java.util.Scanner;
import java.util.*;
public class valid_paranthesis {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        Stack<Character>st=new Stack<>();
        boolean balance=true;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='{'||ch=='['||ch=='(')
            st.push(ch);
            else{
            if(st.isEmpty()){
                balance=false;
                break;
            }
            char temp=st.pop();
            if((temp=='['&&ch!=']')||(temp=='{'&&ch!='}')||(temp=='('&&ch!=')')){
                balance=false;
                break;
            }
        }
        }
        if(!st.isEmpty())
        balance=false;
        if(balance)
        System.out.print("true");
        else
        System.out.print("false");
    }
}
