package org.example;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import java.util.Scanner;

public class Main {
    private static final Logger log = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        log.info("L'applicazione è partita");
        Scanner scanner = new Scanner(System.in);
        Evento event1 = new Evento();
        try {
            event1.captureInput(scanner);
        } catch (Exception e) {
            log.error("An exception occurred: " + e.getMessage(),e);
        }
        Evento event2 = new Evento();
        try{
        event2.captureInput(scanner);
        scanner.close(); } catch (Exception e) {
            log.error("An exception occurred: " + e.getMessage(),e);
        }
        Calendario cal = new Calendario();
        cal.addEvent(event1);
        cal.addEvent(event2);
        cal.removeEvent("Andrea");
        cal.displayEvents();
        log.info("L'applicazione è terminata con successo");
    }
}
