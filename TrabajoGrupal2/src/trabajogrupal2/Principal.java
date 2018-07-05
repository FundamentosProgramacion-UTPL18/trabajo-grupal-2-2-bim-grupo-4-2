package trabajogrupal2;

public class Principal {

    public static void main(String[] args) {
        Persona p = new Persona();
        String[] nombres = {"Jose", "Maria", "Ana", "Paul", "David"};
        String[] apellidos = {"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int[] edad = {20, 19, 20, 19, 25};
        double[] calificaciones1 = {9.1, 10, 8, 7, 9.1};
        double[] calificaciones2 = {6.1, 5, 10, 7.2, 4.1};
        for (int i = 0; i < nombres.length; i++) {

            p.nombre = nombres[i];
            p.apellido = apellidos[i];
            p.edad = edad[i];
            p.calificacion1 = calificaciones1[i];
            p.calificacion2 = calificaciones2[i];
        }
        for (int i = 0; i < nombres.length; i++) {
            p.imprimir();

        }
    }

}
