import java.util.Scanner;


class RangeGenerator {
    public int generate(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        RangeGenerator rg = new RangeGenerator();

        System.out.println(" NUMBER GUESSING GAME ");

        while (true) {

            System.out.print("Enter minimum number: ");
            int min = sc.nextInt();

            System.out.print("Enter maximum number: ");
            int max = sc.nextInt();

            int randomNumber = rg.generate(min, max);
            int attempts = 0;

            System.out.println("\nI have selected a number between " + min + " and " + max + ".");
            System.out.println("Try to guess it!");

            while (true) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == randomNumber) {
                    System.out.println("\n🎉 Correct! You guessed the number in " + attempts + " attempts.");
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            // Ask to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String choice = sc.next().toLowerCase();

            if (!choice.equals("yes")) {
                System.out.println("Thank you for playing!");
                break;
            }
        }

        sc.close();
    }
}

