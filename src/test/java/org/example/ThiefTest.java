package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThiefTest {

    @Test
    void givenAThiefTryToSteal() {
        Thief thief1 = new Thief("Dumitru", 0, 1000, 1, 789);

        thief1.start();


    }
}