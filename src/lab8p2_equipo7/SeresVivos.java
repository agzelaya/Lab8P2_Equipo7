package lab8p2_equipo7;

public class SeresVivos {
    private String nombre, ID, raza;
    private int poder, anios;
    private Universo universo;

    public SeresVivos(String nombre, String ID, String raza, int poder, int anios, Universo universo) {
        this.nombre = nombre;
        this.ID = ID;
        this.raza = raza;
        this.poder = poder;
        this.anios = anios;
        this.universo = universo;
    }

    public SeresVivos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getAnios() {
        return anios;
    }

    public void setAnios(int anios) {
        this.anios = anios;
    }

    public Universo getUniverso() {
        return universo;
    }

    public void setUniverso(Universo universo) {
        this.universo = universo;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
