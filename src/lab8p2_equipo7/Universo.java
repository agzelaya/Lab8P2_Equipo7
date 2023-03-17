package lab8p2_equipo7;

import java.util.ArrayList;

public class Universo {
    private String nombre;
    private ArrayList<SeresVivos> citizens = new ArrayList();
    private int cantSeres;
   

    public Universo() {
    }

    public Universo(String nombre) {
        this.nombre = nombre;
        this.cantSeres = cantSeres;
        cantSeres = citizens.size();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantSeres() {
        return cantSeres;
    }

    public void setCantSeres(int cantSeres) {
        this.cantSeres = cantSeres;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
}
