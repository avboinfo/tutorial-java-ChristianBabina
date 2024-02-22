import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args ) {
        File f = new File("E_Esercizi/datiIn.txt");
        Pila<String> p = new Pila<String>();
        try{
            Scanner sc = new Scanner (f);
            while (sc.hasNextLine()) {
               String line = sc.nextLine();
               p.push (line);
            }
            sc.close();
        }
        catch(Exception e) {
            System.out.println("Errore" + e.toString());
        }
        System.out.println(p);
        }
    }

