/*
    Autor: Jean Paul Emanuel Martir Avila
    Fecha: 24/09/2020
 */
//imports
    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Inicializando variables
        String sNombre;
        int iCalificaciones[];
        int iNumero, iPromedio = 0;
        Scanner sc = new Scanner(System.in);
        iCalificaciones = new int[6];

        //Inicia modulo
        System.out.print("Introduce el nombre del alumno: ");
        sNombre = sc.next();

            //Bucle para obtener calificaciones del usuario
        for (int i = 1 ; i <= 5 ; i++) {
                System.out.println("Introduce calificación " + i);
                iNumero = sc.nextInt();
                iCalificaciones[i] = iNumero;
                iPromedio += iNumero;
            }
        iPromedio = iPromedio / 5;

        //Despliega resultados
        System.out.println("\n");
        System.out.println("Nombre del estudiante: " + sNombre);
        System.out.println("Calificación 1: " + iCalificaciones[1]);
        System.out.println("Calificación 2: " + iCalificaciones[2]);
        System.out.println("Calificación 3: " + iCalificaciones[3]);
        System.out.println("Calificación 4: " + iCalificaciones[4]);
        System.out.println("Calificación 5: " + iCalificaciones[5]);
        System.out.println("Promedio: " + iPromedio);

        //Compara promedio para asignarcalificación
        if (iPromedio <= 50){
            System.out.println("Calificación: F");
        }
        else if (iPromedio >= 51 && iPromedio <= 60){
            System.out.println("Calificación: E");
        }
        else if (iPromedio >= 61 && iPromedio <= 70){
            System.out.println("Calificación: D");
        }
        else if (iPromedio >= 71 && iPromedio <= 80){
            System.out.println("Calificación: C");
        }
        else if (iPromedio >= 81 && iPromedio <= 90){
            System.out.println("Calificación: B");
        }
        else if (iPromedio >= 91 && iPromedio <= 100){
            System.out.println("Calificación: A");
        }
    }
}
