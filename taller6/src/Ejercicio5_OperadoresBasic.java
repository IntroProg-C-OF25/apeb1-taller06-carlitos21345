
/** *
 * Dado un número del 1 al 4 que representa una operación matemática básica
 * (suma, resta, multiplicación, división),
 * muestra el nombre de la operación correspondiente.
 * Por ejemplo, si el usuario ingresa 1, debe mostrar "Suma";
 * si ingresa 2, debe mostrar "Resta", y así sucesivamente.
 *
 * @author Carlitos Ismael
 */
import java.util.Scanner;

public class Ejercicio5_OperadoresBasic {

    public static void main(String[] args) {
        int NumOperador;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("INGRESE EL NUMERO DE OPERADOR: ");
        NumOperador = ingreso.nextInt();
        switch (NumOperador) {
            case 1:
                System.out.println("SUMA");
                break;
            case 2:
                System.out.println("RESTA");
                break;
            case 3:
                System.out.println("MULTIPLICACION");
                break;
            case 4:
                System.out.println("DIVISION");
                break;
            default:
                System.out.println("NO INCLUIDO EN LOS OPERADORES");

        }
    }

}
/**
 * *
 * run: INGRESE EL NUMERO DE OPERADOR: 1 SUMA
 */
/***
 * run:
 *INGRESE EL NUMERO DE OPERADOR: 5
 *NO INCLUIDO EN LOS OPERADORES
 */
