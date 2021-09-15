import java.util.Random;
import java.util.Scanner;

public class Randomdemo {
    public static void main(String[] args){
        var randomNumberPicker = new Random();
        var randomNumber = randomNumberPicker.nextInt(10)+1;
        var inputReader = new Scanner(System.in); // read from command line input
        System.out.print("Pick a random number from 1 to 10:");
        var userNumber = inputReader.nextInt();
        if (randomNumber == userNumber){
            System.out.println("You were right the number was " +randomNumber);

        }
        else {
            System.out.println("Unfortunately " + userNumber + " was not the right number ");
        }


    }
}
