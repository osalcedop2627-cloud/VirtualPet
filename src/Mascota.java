import java.util.Random;

public class Mascota {

    // Atributos
    public String nom;
    public String tipusmascota;
    public int pes;
    public int higiene;
    public int energia;
    public int anim;

    // Constructor
    public Mascota(String nom, String mascota) {
        this.nom = nom;
        this.tipusmascota = mascota;
        Random rnd = new Random();
        this.energia = 40 + rnd.nextInt(21);
        this.pes = 40 + rnd.nextInt(21);
        this.anim = 40 + rnd.nextInt(21);
        this.higiene = 40 + rnd.nextInt(21);
    }

    // Métodos
    public void dormir() {
        System.out.println(nom + " està dormint...");
        if (tipusmascota.equals("gos")) {
            energia += 25;
            anim += 10;
        } else if (tipusmascota.equals("gat")) {
            energia += 20;
            anim += 10;
        }
    }
    public void jugar() {
        System.out.println(nom + " està jugant");
        energia -= 20;
        anim += 20;
        pes -=10;
    }
    public void menjar() {
        System.out.println(nom + " està menjant");
        energia += 10;
        higiene -= 15;
        pes += 10;
    }
    public void dutxar() {
        System.out.println(nom + " està a la dutxa");
        if (tipusmascota.equals("gos")) {
            energia -= 10;
            higiene += 25;
            anim -= 15;
        } else if (tipusmascota.equals("gat")) {
            energia -= 5;
            higiene += 25;
            anim += 5;
        }
    }
    public void energia(int energia) {
        this.energia = energia;
    }
    public void higiene(int higiene) {
        this.higiene = higiene;
    }
    public void pes(int pes) {
        this.pes = pes;
    }
    public void anim(int anim) {
        this.anim = anim;
    }
    public void atacar(int vegadesAtacar, Mascota dummy) {
        for (int contador = 0; contador < vegadesAtacar; contador++) {
            energia -= 3;
            higiene -= 3;
            anim -= 3;
            dummy.energia -= 3;
            dummy.higiene -= 3;
            dummy.anim -= 3;
            System.out.println("Cop " + (contador + 1) + "!");
            System.out.println("El dummy ha rebut un atac.");
            dummy.mostrarMascota();
        }
    }
    public boolean mascotaMorta() {
        return energia <= 0 || energia > 100
                || higiene <= 0 || higiene > 100
                || anim <= 0 || anim > 100
                || pes <= 0 || pes > 100;
    }
    public void mostrarMascota() {
        System.out.println(nom + " (" + tipusmascota + ") -> Energia: " + energia
                + " | Higiene: " + higiene + " | Ànim: " + anim + " | Pes: " + pes);
    }
}