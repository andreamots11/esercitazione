package it.corso.tv;

import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainTv {

    public static void main(String[] args) {
    	
    	Tv tv = new Tv();
    	Scanner scanner = new Scanner(System.in);
    	
        try { 
        	System.out.println("Metti un canale tv: ");
        	int input = scanner.nextInt();
        	
        	tv.settaChannel(input);
        	
        } catch (InputMismatchException inputMismatchException) {
        	tv.getLogger().error(inputMismatchException);
       
        }
    }

}
