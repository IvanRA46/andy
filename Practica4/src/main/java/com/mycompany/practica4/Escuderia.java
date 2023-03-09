
package com.mycompany.practica4;

public class Escuderia {
    private String NombreEs;
    private String PaisEsc;
    private int Puntos;
    private int PosicionTablaConstructore;

    public Escuderia(String NombreEsString, String PaisEsc, int Puntos, int PosicionTablaConstructore) {
        this.NombreEs = NombreEsString;
        this.PaisEsc = PaisEsc;
        this.Puntos = Puntos;
        this.PosicionTablaConstructore = PosicionTablaConstructore;
    }
    public Escuderia(){
        super();
        this.NombreEs = "Ferrari";
        this.PaisEsc = "Italia";
        this.Puntos = 12;
        this.PosicionTablaConstructore = 4;
    }

    public String getNombreEs() {
        return NombreEs;
    }

    public void setNombreEs(String NombreEs) {
        this.NombreEs = NombreEs;
    }

    public String getPaisEsc() {
        return PaisEsc;
    }

    public void setPaisEsc(String PaisEsc) {
        this.PaisEsc = PaisEsc;
    }

    public int getPuntos() {
        return Puntos;
    }

    public void setPuntos(int Puntos) {
        this.Puntos = Puntos;
    }

    public int getPosicionTablaConstructore() {
        return PosicionTablaConstructore;
    }

    public void setPosicionTablaConstructore(int PosicionTablaConstructore) {
        this.PosicionTablaConstructore = PosicionTablaConstructore;
    }
    
    
    
}
