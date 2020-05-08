package app;

public class Personaje {
    public String nombre;
    public int salud;
    public String color;

    public void atacar(Personaje oponente, int danio) {
        oponente.salud = oponente.salud - danio;
    }
}