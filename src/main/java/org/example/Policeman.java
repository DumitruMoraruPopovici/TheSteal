package org.example;

/**
 * Blueprint class for the police with params and methods
 */
public class Policeman extends Thread {

    public String name;

    public int start;

    public int end;

    public int step;

    /**
     * the constructor which returns a police object
     *
     * @param name
     * @param start
     * @param end
     * @param step
     */
    public Policeman(String name, int start, int end, int step) {
        this.name = name;
        this.start = start;
        this.end = end;
        this.step = step;
    }

    /**
     * method for police counting until catching the thieves
     */
    public void run() {
        for (int i = start; i >= end; i--) {
            System.out.println("Policeman " + name + " counting : " + i);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Adrian caught us trying to steal Java knowledge");
        System.exit(0);
    }

}
