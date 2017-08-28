

import java.util.Scanner;

public class Prompter {
    private Jar jar;

    public Prompter(Jar jar) {
        this.jar = jar;
    }

    Scanner sc = new Scanner(System.in);

    public void play() {
        System.out.printf("What type of item will go in this jar?%n Item: ");
        jar.setItemsInJar(sc.nextLine());
        System.out.printf("Enter maximum amount of %s %n Capacity: ", jar.getItemsInJar());
        jar.setItemCapacity(sc.nextInt());
        jar.fill();
        promptForGuess();
        System.out.printf("There are %d %s in the jar%n", jar.getItemCount(), jar.getItemsInJar());
    }

    public boolean promptForGuess() {
        boolean isValidGuess = false;
        System.out.printf("How many %s? Guess between 1 and %d %n Guess: ", jar.getItemsInJar(), jar.getItemCapacity());
        int guess;
        int tries = 1;
        while (!isValidGuess) {
            guess = sc.nextInt();
              if (guess > jar.getItemCapacity()) {
                  System.out.printf("Your guess must be between 1 and %d, try again%n Guess: ", jar.getItemCapacity());
                  isValidGuess = false;
  
              } else if (guess > jar.getItemCount()) {
                  System.out.printf("Your guess is too high, try again%n Guess: ");
                  isValidGuess = false;
                  tries++;
  
              } else if (guess < jar.getItemCount()) {
                  System.out.printf("Your guess is too low, try again%n Guess: ");
                  isValidGuess = false;
                  tries++;
              } else {
                  System.out.printf("You got it in %d attempts. %nExcellent job!%n", tries);
                  return true;
              }

        }
        return isValidGuess;
    }

}
