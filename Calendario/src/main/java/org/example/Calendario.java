package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Calendario {
    ArrayList<Evento> eventi;

    public Calendario() {
        eventi = new ArrayList<Evento>();
    }
    public void addEvent(Evento evento){
        eventi.add(evento);
    }
    public void removeEvent(String nomeEvento){
        for (Evento event : eventi) {
            if (event.getNome().equals(nomeEvento)) {
                eventi.remove(event);
                return;
            }
        }
    }
    public void displayEvents(){
        for (Evento event : eventi) {
            System.out.println("Event name: " + event.getNome() + " Descriz: " + event.getDescrizione()
                    +" Day: "+event.getGiorno()+" Month: "+event.getMese()+" Year: "+event.getAnno());
        }
    }
    private List<Evento> events;
    // ... other code here
    public List<Evento> getEvents() {
        return events;
    }
}


