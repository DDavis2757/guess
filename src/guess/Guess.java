/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guess;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author More to come. hahahha
 */
public class Guess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(10);

        System.out.println("Guess a number between 1 and 10");

        while (true) {
            System.out.println("Enter a number: ");
            if (sc.nextInt() == number) {
                break;
            } else {
                System.out.println("Sorry, try again");
            }

        }
        System.out.println("You win!");
    }
}
