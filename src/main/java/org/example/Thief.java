package org.example;

/**
 * Blueprint for the thieves with params and methods which creates thieves objects
 */
public class Thief extends Thread {
    public String name;
    public int start;

    public int end;
    public int step;
    public int randomNumber;

    /**
     * the constructor for the thief object
     *
     * @param name
     * @param start
     * @param end
     * @param step
     * @param randomNumber
     */
    public Thief(String name, int start, int end, int step, int randomNumber) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.step = step;
        this.randomNumber = randomNumber;
    }

    /**
     * method for trying to find the combination and whats inside the vault
     */
    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println("Thief " + name + " is at number :" + i);
            try {

                sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i == randomNumber) {
                System.out.println("The thief" + name + " stoled the knowledge with combination " + i);
                System.exit(1);
            }
        }
    }
}
