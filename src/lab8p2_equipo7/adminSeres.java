/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_equipo7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author skxka
 */
public class adminSeres {
    private ArrayList<SeresVivos> listaSeres = new ArrayList<>();
    private File archivo = null;

    public adminSeres(String path) {
        archivo = new File(path);
    }

    public adminSeres() {
    }

    public ArrayList<SeresVivos> getListaSeres() {
        return listaSeres;
    }

    public void setListaSeres(ArrayList<SeresVivos> listaSeres) {
        this.listaSeres = listaSeres;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void cargarArchivo() {
        try {            
            listaSeres = new ArrayList();
            SeresVivos temp = new SeresVivos();
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (SeresVivos) objeto.readObject()) != null) {
                        listaSeres.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
           // ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (SeresVivos t : listaSeres) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
