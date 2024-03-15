package L_Lista;

import java.util.Iterator;

public class Lista {

    class Iteratore{
        private Nodo nodo;

        private Iteratore(Nodo nodo){
            this.nodo = nodo;
        }

        public boolean hasNext(){
            return nodo != null;    //ha un successivo == true
        }                           //non ha un successivo == false

        public Nodo next(){
            if(nodo == null) return null;
            Nodo result = new Nodo(nodo.getValore(), nodo.getSuccessivo());
            nodo = nodo.getSuccessivo();
            return result;
        }
    }

    public Iteratore getIterator(){
        Iteratore i = new Iteratore(radice);
        return i;
    }

    Nodo radice;

    public Lista(){
        radice = null;
    }

    public boolean isEmpty(){
        return radice == null;
    }

    public void addTail(Nodo n){
        if (isEmpty()) {
            radice = n;
        } else {
            Nodo puntatore = radice;
            while (puntatore.getSuccessivo() != null) puntatore = puntatore.getSuccessivo();
            puntatore.setSuccessivo(n);
        }
    }

    public void addHead (Nodo n) {
        if (isEmpty()) {
            radice = n;
        } else {
            n.setSuccessivo(radice);
            radice = n;
        }
    }

public void addSorted(Nodo n) {
    if (isEmpty()){
        radice = n;
        n.setSuccessivo(null);
        return;}
    int vn = n.getValore(); 
    if (vn<radice.getValore()){
        n.setSuccessivo(radice);
        radice = n;
        return;
    }
    Nodo p1 = radice;
    Nodo p2 = radice.getSuccessivo();
    while ( vn>p1.getValore() && p2!=null && vn>p2.getValore()) {
        p1=p2;
        p2=p1.getSuccessivo();
    }
    n.setSuccessivo(p2);
    p1.setSuccessivo(n);
    }

    public boolean addAfter(Nodo n, int pos) {
        Iteratore iter = this.getIterator();
        int i; Nodo npos;
        for (int i = 0; i<pos; i++) {
            if (iter.hasNext()) npos = iter.next();
            else return false;
        }
        n.setSuccessivo(npos.getSuccessivo());
        npos.setSuccessivo(n);
        return true;
    }

    public String toString() {
        String s = "Elementi della lista: ";
        Nodo puntatore = radice;
        while (puntatore != null){
            s += puntatore ;
            puntatore = puntatore.getSuccessivo();
        }

        s += "\nFine!";
        return s;
    }
}
