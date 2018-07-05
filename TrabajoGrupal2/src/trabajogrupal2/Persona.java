package trabajogrupal2;

public class Persona {
// Declaramos variables 
    String nombre;
    String apellido;
    int edad;
    double calificacion1;
    double calificacion2;

    public void imprimir() {
        System.out.println("\n-----DATOS ESTUDIANTE-----\n");//Encabezado del reporte
        System.out.printf("%s %s\n", nombre, apellido);//Presentacion del nombre
        System.out.printf("Edad - %d\n", edad);//Presentacion de la edad
        System.out.printf("Calificacion 1 - %.2f\n", calificacion1);//Presentacion de la calificacion1
        System.out.printf("Calificacion 2 - %.2f\n", calificacion2);//Presentacion de la calificacion2
        System.out.printf("Promedio - %.2f\n", (calificacion1 + calificacion2) / 2);// Calculo y presentacion del promedio de calificaciones
    }
}
