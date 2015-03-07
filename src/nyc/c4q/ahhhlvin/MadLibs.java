package nyc.c4q.ahhhlvin;

/**
 * Created by alvin2 on 3/7/15.
 */

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args ) {

        Scanner input = new Scanner(System.in);

        String noun;
        String adjective;
        String color;
        String day;
        String food;
        String number;


        System.out.println("Enter an noun: ");
        noun = input.next();

        System.out.println("Enter an adjective: ");
        adjective = input.next();

        System.out.println("Favorite color: ");
        color = input.next();

        System.out.println("Favorite day of the week: ");
        day = input.next();

        System.out.println("Favorite food dish: ");
        food = input.next();

        System.out.println("Enter your favorite number: ");
        number = input.next();


        System.out.println("Here is your mad lib!");
        System.out.println("There was a " + noun + " ");


    }
}
