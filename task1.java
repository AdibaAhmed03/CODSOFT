import java.util.Scanner;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number guessing game !");
        Random rnumber = new Random();

        int Randomnumber = rnumber.nextInt(100);
        System.out.println("Hey player you have to guess a number between 0-100\nYou have 5 chances to Guess");
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            if (Randomnumber == guess) {
                System.out.println("Hurrey You Won! You guess Correctly");
                break;
            }
            else if (Randomnumber < guess) {
                System.out.println("The number you guess is too high!");
            }
            else if(Randomnumber > guess) {
                System.out.println("The number you guess is too low! ");
            }
            if (i>=4) {
                    System.out.println();
                    System.out.println("OOPs you are failed! the correct Number is " + Randomnumber);
                    System.out.println("Play Again!");
            }
        }
    }
}
