/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_equipo7;

import javax.swing.JProgressBar;

/**
 *
 * @author skxka
 */
public class adminProgressBar extends Thread {

    private JProgressBar barra;
    private int cantidad;

    public adminProgressBar() {
    }

    public adminProgressBar(JProgressBar barra, int cantSegundos) {
        this.barra = barra;
        this.cantidad = cantSegundos;

    }

    @Override
    public void run() {
        while (barra.getValue() <= barra.getMaximum()) {

            barra.setValue(barra.getValue() + 1);
            if (barra.getValue() == barra.getMaximum()) {
            }
        } //FIN IF

        try {
            int cooldown = cantidad * 1000;
            Thread.sleep(cooldown);
        } catch (InterruptedException ex) {
        }
    }
}
