import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess the number between 1 and 100: ");
        int guess = scanner.nextInt();

        while (guess != targetNumber) {
            if (guess > targetNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }
            System.out.print("Guess again: ");
            guess = scanner.nextInt();
        }

        System.out.println("You win!");
    }
}
