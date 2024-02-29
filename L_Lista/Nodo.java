package L_Lista;

//import java.io.*;

public class Nodo {

    private int valore;
    Nodo successivo;


    public Nodo (int valore, Nodo successivo){
        this.valore = valore;
        this.successivo = successivo;
    }  

    public void setValore (int nuovoValore) {
        valore = nuovoValore;
    }

    public void setSuccessivo(Nodo nuovoSuccessivo){
        successivo = nuovoSuccessivo;
    }

    public int getValore(){
        return valore;
    }

    public Nodo getSuccessivo() {
        return successivo;
    }

    public String toString() {
        return "Io sono un nodo che vale " + valore;
    }
}
