import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int number = rand.nextInt(100) + 1; 
        int guess;
        int attempts = 0;
        while (true) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;
            if (guess > number) {
                System.out.println("Too High");
            }
            else if (guess < number) {
                System.out.println("Too Low");
            }
            else {
                System.out.println("You Win! Attempts: " + attempts);
                break;
            }
        }
        sc.close();
    }
}