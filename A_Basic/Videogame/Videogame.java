package Videogame;
public class Videogame {
 String nome,marca;
 float costo;
 int anno;


public Videogame(String nome, String marca, float costo, int anno){
    this.costo = costo;
    this.marca = marca;
    this.nome = nome;
    this.anno = anno;
}

public String toString(){
    return "Nome " + nome + " / Marca" + marca + " / Costo" + costo + " / Anno" + anno;
    }
}