package it.corso.junitTest;

public class Calcolatrice {
    public static float somma(float a, float b ){
        float s = a+b;
        return s;
    }
    public static float diff(float a, float b ){
        float s = a-b;
        return s;
    }
    public static float div(float a, float b ) {
        float s = a/b;
        if (b==0){
            throw new IllegalArgumentException("Impossibile dividere per zero");
        }
        return s;
    }
    public static float media(float a, float b ){
        float s = (a+b)/2;
        return s;
    }
    public static float pot(float a, float b){
        float s = (float) Math.pow(a,b);
        return s;
    }
}
