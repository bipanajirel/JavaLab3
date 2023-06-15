import java.util.Scanner;

public class PartA {
    private static final int MAX_GUESSES = 14;
    private static final int MAX_NUMBER = 9999;

    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * (MAX_NUMBER + 1));

        Scanner input = new Scanner(System.in);
        boolean won = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 0 and " + MAX_NUMBER + ".");
        System.out.println("You have " + MAX_GUESSES + " attempts to guess the number.");

        for (int guesses = 1; guesses <= MAX_GUESSES; guesses++) {
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();

            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly!");
                System.out.println("You won in " + guesses + " guesses.");
                won = true;
                break;
            } else if (guess < targetNumber) {
                System.out.println("The number is bigger than " + guess + ".");
            } else {
                System.out.println("The number is smaller than " + guess + ".");
            }
        }

        if (!won) {
            System.out.println("Sorry, you did not guess the number within " + MAX_GUESSES + " attempts.");
            System.out.println("The correct number was: " + targetNumber);
        }
    }
}
