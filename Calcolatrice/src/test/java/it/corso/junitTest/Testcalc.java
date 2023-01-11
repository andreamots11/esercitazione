package it.corso.junitTest;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testcalc {

    @Test
    void checkModel() {
        int a = 3;
        int b = 2;
        float somma = 5;
        float differenza = 1;
        float divisione = 1.5F;
        float media = 2.5F;
        float pot = 9;
        Calcolatrice calcolatrice = new Calcolatrice();

        assertEquals(somma, calcolatrice.somma(a, b));
        assertEquals(differenza, calcolatrice.diff(a, b));
        assertEquals(divisione, calcolatrice.div(a, b));
        assertEquals(media, calcolatrice.media(a, b));
        assertEquals(pot, calcolatrice.pot(a, b));
    }
    public void testDivisionByZero() {
        Calcolatrice calcolatrice = new Calcolatrice();
        try {
            calcolatrice.div(1,0);
            fail("Expected ArithmeticException to be thrown");
        } catch (ArithmeticException e) {
            // Expected exception
            assertTrue(e.getMessage().contains("/ by zero"));
        }
    }


}

