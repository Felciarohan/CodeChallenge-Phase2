import java.util.Scanner;
public class rectangleArea {
    int length;
    int width;
    void display(){
        System.out.print(length*width);
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        rectangleArea a=new rectangleArea();
        a.length=s.nextInt();
        a.width=s.nextInt();
        a.display();
        s.close();
    }
}
