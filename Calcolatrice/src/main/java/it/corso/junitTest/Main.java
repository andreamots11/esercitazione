package it.corso.junitTest;

public class Main {
    public static void main(String[] args) {
        float a = 3;
        float b = 2;
        float s = Calcolatrice.somma(a,b);
        float d = Calcolatrice.diff(a,b);
        float q = Calcolatrice.div(a,b);
        float m = Calcolatrice.media(a,b);
        float p = Calcolatrice.pot(a,b);
        System.out.println(q);

    }

}