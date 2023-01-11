package org.example;
import java.util.Scanner;

public class Evento {
        private String nome;
        private String descrizione;
        private int giorno;
        private int mese;
        private int anno;

        public Evento(String nome, String descrizione, int giorno, int mese, int anno){
                this.nome = nome;
                this.descrizione = descrizione;
                this.giorno = giorno;
                this.mese = mese;
                this.anno = anno;
        }
        public Evento (){
        }

        public void setNome(String nome){
                this.nome = nome;
        }

        public String getNome(){
                return nome;
        }

        public void setDescrizione(String descrizione){
                this.descrizione = descrizione;
        }

        public String getDescrizione(){
                return descrizione;
        }
        public void setGiorno(int giorno){
                this.giorno = giorno;
        }

        public int getGiorno(){
                return giorno;
        }
        public void setMese(int mese){
                this.mese = mese;
        }

        public int getMese(){
                return mese;
        }
        public void setAnno(int anno){
                this.anno = anno;
        }

        public int getAnno(){
                return anno;
        }
        public void captureInput(Scanner scanner) {
                System.out.print("Inserisci il nome: ");
                this.nome = scanner.nextLine();
                System.out.print("Inserisci la descrizione: ");
                this.descrizione = scanner.nextLine();
                System.out.print("Inserisci il giorno: ");
                this.giorno = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Inserisci il mese: ");
                this.mese = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Inserisci l'anno: ");
                this.anno = scanner.nextInt();
                scanner.nextLine();
        }
}
