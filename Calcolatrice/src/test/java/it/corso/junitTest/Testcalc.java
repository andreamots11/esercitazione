package it.corso.junitTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testcalc {

    @Test
    void checkModel(){
        float somma = 5;
        float differenza = 1;
        float moltiplicazione = 6;
        float divisione = 1.5F;
        int a=3;
        int b=2;
        Calcolatrice calcolatrice = new Calcolatrice();

        assertEquals(somma, calcolatrice.somma(a,b));
        assertEquals(differenza, calcolatrice.diff(a,b));
        assertEquals(moltiplicazione, calcolatrice.molt(a,b));
        assertEquals(divisione, calcolatrice.div(a,b));

    }

}

