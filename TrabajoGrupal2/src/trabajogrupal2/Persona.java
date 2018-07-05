package trabajogrupal2;

public class Persona {

    String nombre;
    String apellido;
    int edad;
    double calificacion1;
    double calificacion2;

    public void imprimir() {
        System.out.println("\n-----DATOS ESTUDIANTE-----\n");
        System.out.printf("%s %s\n", nombre, apellido);
        System.out.printf("Edad - %d\n", edad);
        System.out.printf("Calificacion 1 - %.2f\n", calificacion1);
        System.out.printf("Calificacion 2 - %.2f\n", calificacion2);
        System.out.printf("Promedio - %.2f\n", (calificacion1 + calificacion2) / 2);
    }
}
