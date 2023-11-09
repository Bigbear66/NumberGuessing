import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        Random newRand = new Random();

        int numOfGuess = 0;

        int randNum = newRand.nextInt(100)+1;

         System.out.println("Please enter your guess (-1 to quit): ");
         while(true){


          int guess = scan.nextInt();

          if(guess == -1) {

              break;
          }

          numOfGuess++;

          if(guess<randNum) {

              System.out.println("You Guessed too low. Please guess again (-1 to quit:");
          }
          else if(guess>randNum) {

              System.out.println("You Guessed too high. Please guess again (-1 to quit:");
          }
           else{

               System.out.println("Awesome! You guessed the correct number in " + numOfGuess + " tries.");

               numOfGuess = 0;

               System.out.println("Do you want to guess another number? (yes/no): ");

               String s = scan.next();

               if (s.equalsIgnoreCase("no")) {

                   break;
               }
               else {
                   randNum = newRand.nextInt(100) + 1;

                   System.out.println("Please guess the next number (-1 to quit) ; ");
               }
               }

          }
         }
    }

