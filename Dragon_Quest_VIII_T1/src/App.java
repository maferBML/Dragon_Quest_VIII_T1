import java.util.*;

public class App {
    public static void main(String[] args) {
        // Crear héroes
        List<Heroe> heroes = new ArrayList<>();
        heroes.add(new Heroe("Jessica", 100, 40, 25, 10, 20));
        heroes.add(new Heroe("Yangus", 120, 15, 30, 15, 10));

        // Crear enemigos
        List<Enemigo> enemigos = new ArrayList<>();
        enemigos.add(new Enemigo("Goblin", 80, 20, 18, 8, 12, "agresivo"));
        enemigos.add(new Enemigo("Slime", 60, 10, 10, 5, 8, "defensivo"));

        // Iniciar combate
        Combate combate = new Combate(heroes, enemigos);
        combate.iniciar();
    }
}

