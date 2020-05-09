package app;

public class App {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws Exception {

        Personaje p1 = new Personaje();
        p1.nombre = "SubZero";
        p1.color = ANSI_BLUE;
        p1.salud = 100;

        Personaje p2 = new Personaje();
        p2.nombre = "Scorpion";
        p2.color = ANSI_YELLOW;
        p2.salud = 100;

        boolean turnoP1 = true;

        System.out.println(ANSI_RED + "Fight!");

        while (p1.salud > 0 && p2.salud > 0) {

            Personaje atacante;
            Personaje oponente;

            if (turnoP1) {
                atacante = p1;
                oponente = p2;
            } else {
                atacante = p2;
                oponente = p1;
            }

            int max = 10;
            int min = 2;

            int danio = (int) (Math.random() * ((max - min) + 1)) + min;

            System.out.println(atacante.color + atacante.nombre + " ataca a " + oponente.nombre);
            atacante.atacar(oponente, danio);
            System.out.println("A " + oponente.nombre + " le queda " + oponente.salud);

            turnoP1 = !turnoP1;

        }

        if (p1.salud > 0)
            System.out.println("Gano " + p1.nombre);
        else
            System.out.println("Gano " + p2.nombre);

    }
}