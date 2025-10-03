public class App {
    public static void main(String[] args) {
        Heroe heroe = new Heroe("Héroe", 100, 30, 25, 10, 15);
        Enemigo slime = new Enemigo("Slime", 60, 0, 15, 5, 8, "agresivo");

        System.out.println("¡Comienza el combate!");
        heroe.atacar(slime);
        slime.accionAutomatica(heroe);

        heroe.curar(20);
        heroe.mostrarEstado();
        slime.mostrarEstado();
    }
}
