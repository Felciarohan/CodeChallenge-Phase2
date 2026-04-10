import java.util.Scanner;
public class QuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Welcome to the Quiz Game!\n");
        System.out.println("Q1: What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) Delhi");
        System.out.println("c) Chennai");
        System.out.println("d) Kolkata");
        System.out.print("Your answer: ");
        char ans1 = sc.next().charAt(0);
        if(ans1 == 'b' || ans1 == 'B'){
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect!\n");
        }
        System.out.println("Q2: 2 + 2 = ?");
        System.out.println("a) 3");
        System.out.println("b) 4");
        System.out.println("c) 5");
        System.out.println("d) 6");
        System.out.print("Your answer: ");
        char ans2 = sc.next().charAt(0);
        if(ans2 == 'b' || ans2 == 'B'){
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect!\n");
        }
        System.out.println("Q3: Which language is used for Android development?");
        System.out.println("a) Java");
        System.out.println("b) Python");
        System.out.println("c) C");
        System.out.println("d) PHP");
        System.out.print("Your answer: ");
        char ans3 = sc.next().charAt(0);
        if(ans3 == 'a' || ans3 == 'A'){
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect!\n");
        }
        System.out.println("Final Score: " + score + "/3");
        if(score == 3){
            System.out.println("Excellent!");
        } else if(score == 2){
            System.out.println("Good!");
        } else {
            System.out.println("Try Again!");
        }
        sc.close();
    }
}