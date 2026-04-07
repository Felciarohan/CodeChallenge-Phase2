import java.util.Scanner;
public class spiral_matrix {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int r=s.nextInt();
        int c=s.nextInt();
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=s.nextInt();
            }
        }    
        int top = 0;
        int bottom = a.length - 1;
        int left = 0;
        int right = a[0].length - 1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                System.out.print(a[top][i] + " ");
            }
            top++;
            for(int i = top; i <= bottom; i++){
                System.out.print(a[i][right] + " ");
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    System.out.print(a[bottom][i] + " ");
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    System.out.print(a[i][left] + " ");
                }
                left++;
            }
        }
    }
}