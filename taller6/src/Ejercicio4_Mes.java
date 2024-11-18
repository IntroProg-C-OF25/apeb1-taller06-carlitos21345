
/** *
 * Dado un número del 1 al 12, que representa un mes del año, muestra el nombre del mes correspondiente.
 * Por ejemplo, si el usuario ingresa 1,
 * debe mostrar "Enero"; si ingresa 2, debe mostrar "Febrero",
 * y así sucesivamente.
 *
 * @author Carlitos
 */
import java.util.Scanner;

public class Ejercicio4_Mes {

    public static void main(String[] args) {
        int nummes;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("INGRESE EL NUMERO DE MES: ");
        nummes = ingreso.nextInt();
        switch (nummes) {
            case 1:
                System.out.println("ENERO");
                break;
            case 2:
                System.out.println("FEBRERO");
                break;
            case 3:
                System.out.println("MARZO");
                break;
            case 4:
                System.out.println("ABRIL");
                break;
            case 5:
                System.out.println("MAYO");
                break;
            case 6:
                System.out.println("JUNIO");
                break;
            case 7:
                System.out.println("JULIO");
                break;

            case 8:
                System.out.println("AGOSTO");
                break;
            case 9:
                System.out.println("SEPTIEMBRE");
                break;
            case 10:
                System.out.println("OCTUBRE");
                break;
            case 11:
                System.out.println("NOVIEMBRE");
                break;
            case 12:
                System.out.println("DICIEMBRE");
                break;
            default:
                System.out.println("FUERA DE RANGO DE MES");
        }
    }
}
/**
 * *
 * run: INGRESE EL NUMERO DE MES: 5 MAYO
 */
/***
 * run:
 *INGRESE EL NUMERO DE MES: 13
 *FUERA DE RANGO DE MES
 */
