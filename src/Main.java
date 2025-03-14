//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Reloj reloj1 = new Reloj("Casio", "G-Shock", 14, 30);
        Reloj reloj2 = new Reloj("Rolex", "Submariner", 22, 45);
        Reloj reloj3 = new Reloj();

        reloj3.setMarca("Seiko");
        reloj3.setModelo("Presage");
        reloj3.setHora(9);
        reloj3.setMinutos(15);

        reloj1.mostrarInfo();
        reloj2.mostrarInfo();
        reloj3.mostrarInfo();

        System.out.println("\nPrueba de avance de minutos:");
        reloj1.avanzarMinutos(50);
        reloj2.avanzarMinutos(30);
        reloj3.avanzarMinutos(120);
    }
}