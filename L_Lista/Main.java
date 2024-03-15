package L_Lista;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Partiti!");

        Lista l = new Lista();
        System.out.println(l);

        /*for (int i=0; i<10; i++){
            l.addTail (new Nodo(i, null));
        }
        l.addHead(new Nodo(2024, null));
*/
l.addSorted(new Nodo( 300, null));
l.addSorted(new Nodo( 200, null));
l.addSorted(new Nodo( 170, null));
l.addSorted(new Nodo( 160, null));
l.addSorted(new Nodo( 576, null));
l.addSorted(new Nodo( 65, null)) ;
l.addSorted(new Nodo( 114, null));
l.addSorted(new Nodo(678 , null));

System.out.println(l);

if (l.addAfter(new Nodo(560, null), 3));

Lista.Iteratore iter = l.getIterator();
while (iter.hasNext()) {
    System.out.println(iter.next());
}
    }
}

