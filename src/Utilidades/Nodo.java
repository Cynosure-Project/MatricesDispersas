
package Utilidades;
public class Nodo {
    
    
    //Atributos
    private int Dato,fila,columna;
    private  Nodo Liga,Lf,Lc;
    
    public Nodo() {
        this.Dato = 0;
        this.fila = 0;
        this.columna = 0;
        Liga = null;
        Lf = null;
        Lc = null;
    } //Vacío

    public Nodo(int Dato, int fila, int columna) {
        this.Dato = Dato;
        this.fila = fila;
        this.columna = columna;
        Liga = null;
        Lf = null;
        Lc = null;
    }
    

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int col) {
        this.columna = col;
    }

    public Nodo getLiga() {
        return Liga;
    }

    public void setLiga(Nodo Liga) {
        this.Liga = Liga;
    }

    public Nodo getLf() {
        return Lf;
    }

    public void setLf(Nodo Lf) {
        this.Lf = Lf;
    }

    public Nodo getLc() {
        return Lc;
    }

    public void setLc(Nodo Lc) {
        this.Lc = Lc;
    }
    
    
}

    

