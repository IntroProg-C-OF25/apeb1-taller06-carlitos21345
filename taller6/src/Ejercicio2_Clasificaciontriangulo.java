
/** *
 * Dado tres valores que representan las longitudes de los lados de un triángulo, determinar su tipo. Las reglas son:
 *Si todos los lados son iguales, mostrar "Triángulo equilátero".
 *Si dos lados son iguales, mostrar "Triángulo isósceles".
 *Si todos los lados son diferentes, mostrar "Triángulo escaleno".
 *Si la suma de dos lados no es mayor que el tercer lado, mostrar "No es un triángulo".
 *
 * @author Carlitos Ismael
 */
import java.util.Scanner;

public class Ejercicio2_Clasificaciontriangulo {

    public static void main(String[] args) {
        double lado1, lado2, lado3;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("INGRESE EL PRIMER LADO DEL TRIANGULO: ");
        lado1 = ingreso.nextDouble();
        System.out.print("INGRESE EL SEGUNDO LADO DEL TRIANGULO: ");
        lado2 = ingreso.nextDouble();
        System.out.print("INGRESE EL TERCER LADO DEL TRIANGULO: ");
        lado3 = ingreso.nextDouble();
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {

            if ((lado1 == lado2) && (lado3 == lado1)) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if ((lado1 == lado2) || (lado1 == lado3) || (lado2 == lado3)) {
                System.out.println("TRIANGULO ISOCELES");
            } else {
                System.out.println("TRIANGULO ESCALENO");
            }
        } else {
            System.out.println("NO ES UN TRIANGULO");
        }
    }

}
/**
 * *
 * run: INGRESE EL PRIMER LADO DEL TRIANGULO: 4 INGRESE EL SEGUNDO LADO DEL
 * TRIANGULO: 4 INGRESE EL TERCER LADO DEL TRIANGULO: 4 TRIANGULO EQUILATERO
 */
/**
 * *
 * run: INGRESE EL PRIMER LADO DEL TRIANGULO: 4 INGRESE EL SEGUNDO LADO DEL
 * TRIANGULO: 3 INGRESE EL TERCER LADO DEL TRIANGULO: 4 TRIANGULO ISOCELES
 */
/***
 * run:
 *INGRESE EL PRIMER LADO DEL TRIANGULO: 2
 *INGRESE EL SEGUNDO LADO DEL TRIANGULO: 4
 *INGRESE EL TERCER LADO DEL TRIANGULO: 8
 *NO ES UN TRIANGULO
 */
