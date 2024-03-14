package L_Lista;

public class Lista {
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


    public String toString() {
        String s = "Elementi della lista: ";
        Nodo puntatore = radice;
        while (puntatore != null){
            s += "\n" + puntatore ;
            puntatore = puntatore.getSuccessivo();
        }

        s += "\nFine!";
        return s;
    }
}
