import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿La mascota es gat o gos?");
        String tipus = sc.nextLine();
        System.out.println("Escull el nom de la mascota");
        String nom = sc.nextLine();
        Mascota mascota = new Mascota(nom, tipus);

        Mascota dummy = new Mascota("Mascota", "dummy");
        dummy.energia = 100;
        dummy.higiene = 100;
        dummy.pes = 100;
        dummy.anim = 100;

        boolean mort = false;
        int opcio = -1;

        while (!mort && opcio != 0) {
            mascota.mostrarMascota();
            mostrarMenu();
            System.out.println("Tria una opció (número):");
            opcio = sc.nextInt();
            if (opcio == 1) {
                mascota.dormir();
            } else if (opcio == 2) {
                mascota.jugar();
            } else if (opcio == 3) {
                mascota.menjar();
            } else if (opcio == 4) {
                mascota.dutxar();
            } else if (opcio == 5) {
                System.out.println("Cuánts cops vols atacar?");
                int atacar = sc.nextInt();
                mascota.atacar(atacar, dummy);
            } else if (opcio == 6) { // INVOCACIÓN DE LA NUEVA FUNCIÓN
                mascota.bailar();
            } else if (opcio == 0) {
                System.out.println("Sortint de l'aplicació...");
            } else {
                System.out.println("Opció no vàlida");
            }
            if (mascota.mascotaMorta()) {
                mort = true;
            }
        }
        if (mort) {
            System.out.println("La mascota ha mort");
        }
        System.out.println("FI");
    }
    static void mostrarMenu() {
        System.out.println(" 1.Dormir");
        System.out.println(" 2.Jugar");
        System.out.println(" 3.Menjar");
        System.out.println(" 4.Dutxar");
        System.out.println(" 5.Atacar");
        System.out.println(" 6.Bailar mambo 💃🕺");
        System.out.println(" 0.Sortir");
    }
}
