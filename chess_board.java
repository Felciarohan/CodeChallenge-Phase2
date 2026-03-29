import java.util.Scanner;
public class chess_board {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i+j)%2==0)
                System.out.print("B");
                else
                System.out.print("W");
            }
            System.out.println();
        }
    }
}
