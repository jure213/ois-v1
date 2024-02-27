/**
 * Gravitacija
 */
public class Gravitacija {

    public static final double GRAV_KONST = 6.674e-11;
    public static final double MASA_ZEMLJE = 5.972e24;
    public static final double POLMER_ZEMLJE = 6.371e6;

    public static void main(String[] args) {
        
        int km = 1000;

        izpis(0);
        izpis(10*km);
        izpis(1000 * km);
        izpis(100000 * km);

    }

    public static double gravPospesekZVisino(int visina) {
        double razdaljaOdSredisca = visina + POLMER_ZEMLJE;
        return (GRAV_KONST * MASA_ZEMLJE)/(razdaljaOdSredisca*razdaljaOdSredisca);
    }

    public static void izpis(int visina) {
        System.out.println("Nadmorska višina je: " + visina + "m");
        System.out.printf("Gravitacijski pospešek na tej višini je: %.2f m/s^2\n", gravPospesekZVisino(visina));
    }

}