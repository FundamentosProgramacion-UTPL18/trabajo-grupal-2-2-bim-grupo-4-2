package trabajogrupal2;

public class Principal {

    public static void main(String[] args) {
        //declaracion de variables
        Persona p = new Persona();
        String[] nombres = {"Jose", "Maria", "Ana", "Paul", "David"};
        String[] apellidos = {"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int[] edad = {20, 19, 20, 19, 25};
        double[] calificaciones1 = {9.1, 10, 8, 7, 9.1};
        double[] calificaciones2 = {6.1, 5, 10, 7.2, 4.1};
        Persona[] est=new Persona[nombres.length];
        //Este for se utiliza para recorrer nuestra cadena vacia e ir guardando cada objeto una ves actualizado sus atributos
        for (int i = 0; i < nombres.length; i++) {
            Persona p = new Persona();   
            p.nombre = nombres[i];
            p.apellido = apellidos[i];
            p.edad = edad[i];
            p.calificacion1 = calificaciones1[i];
            p.calificacion2 = calificaciones2[i];
            est[i]=p
        }
        //Recorremos nuestra lista ya con todos nuestros estudiantes y presentamos el reporte
        for (int i = 0; i < nombres.length; i++) {
            est[i].imprimir();

        }
    }

}
