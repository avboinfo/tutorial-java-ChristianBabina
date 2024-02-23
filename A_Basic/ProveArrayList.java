import java.util.ArrayList;
import java.util.Collections;

public class ProveArrayList {
    public static void main (String[] args) {
        System.out.println("Questo codice funziona");

        ArrayList<String> a = new ArrayList<>();
        a.add ("Uno");
        a.add ("Babina");
        a.add ("Tre");
        a.add ("Quattro");
        a.add ("Cinque");

        a.remove ("Babina");
        a.add(1, "Due");
        //Collections.sort(a);

        for (String s : a) {
            System.out.println(s);
          }
          for (int i=0; i<a.size(); i++){
            String s = a.get(i);
            System.out.println();
          }
        System.out.println(a);
        System.out.println("Ancona".compareTo("Bologna"));
    }
}
