/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_equipo7;

/**
 *
 * @author skxka
 */
public class Universo {
    private String nombre;
    private int cantSeres;

    public Universo() {
    }

    public Universo(String nombre, int cantSeres) {
        this.nombre = nombre;
        this.cantSeres = cantSeres;
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
