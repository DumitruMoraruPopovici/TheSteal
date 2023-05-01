package org.example;

import java.util.Random;

/**
 * Main App where we create 4 thieves and one policeman: the thieves are trying to steal something and the policeman tries
 * to catch them.
 */
public class App {
    public static void main(String[] args) {
        int randomNumber;
        Random random = new Random();
        randomNumber = random.nextInt(100000) + 1;
        System.out.println("The mind combination is: " + randomNumber);
        Thief thief = new Thief("Dumitru", 0, 25000, 1, randomNumber);
        Thief thief1 = new Thief("Alexandra", 25001, 50000, 1, randomNumber);
        Thief thief2 = new Thief("Piciul", 50001, 75000, 1, randomNumber);
        Thief thief3 = new Thief("Oliviu", 75001, 100000, 1, randomNumber);
        Policeman policeman = new Policeman("Bucur Adrian", 10, 0, 1);

        thief.start();
        thief1.start();
        thief2.start();
        thief3.start();
        policeman.start();
    }
}
