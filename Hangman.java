import java.util.Random;
import java.util.Scanner;

public class Hangman {

    public static void main(String[] args) {

        String[] words = {
                "java",
                "computer",
                "programming",
                "developer",
                "keyboard",
                "monitor",
                "internet"
        };

        Random random = new Random();
        String word = words[random.nextInt(words.length)];

        char[] guessedWord = new char[word.length()];

        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int attempts = 6;
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {

            System.out.print("\nWord: ");
            for (char c : guessedWord) {
                System.out.print(c + " ");
            }

            System.out.println("\nAttempts Left: " + attempts);
            System.out.print("Guess a letter: ");

            char guess = scanner.next().toLowerCase().charAt(0);

            boolean found = false;

            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    found = true;
                }
            }

            if (!found) {
                attempts--;
                System.out.println("Wrong guess!");
            }

            if (String.valueOf(guessedWord).equals(word)) {
                System.out.println("\nCongratulations!");
                System.out.println("You guessed the word: " + word);
                scanner.close();
                return;
            }
        }

        System.out.println("\nGame Over!");
        System.out.println("The word was: " + word);

        scanner.close();
    }
}
