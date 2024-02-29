package L_Lista;

public class Lista {
    Nodo radice;

    public Lista(){
        radice = null;
    }

    public boolean isEmpty(){
        return radice == null;
    }

    public void add(Nodo n){
        if (isEmpty()) {
            radice = n;
        } else {
            Nodo puntatore = radice;
            while (puntatore.getSuccessivo() != null) puntatore = puntatore.getSuccessivo();
            puntatore.setSuccessivo(n);
        }
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
