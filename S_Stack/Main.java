/*
** Esempio di uso di uno Stack (Pila)
** Sandro Gallo - 08/02/2024
*/

package S_Stack;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        /*s.push("Juve");
        s.push("Inter");
        System.out.println(s.pop());
        System.out.println(s);*/
    }

    private void loadFromFile(String filename, Stack<String> s) {
        try {
            File f = new File(filename);
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){
                s.push(sc.nextLine());
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    private void ScriviSuFile(String filename, Stack<String> s){
        File f = new File(filename);
        PrintWriter c = new PrintWriter(f);

    }

}
