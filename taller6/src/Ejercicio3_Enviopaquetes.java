
/** *
 * Un servicio de envío cobra diferentes tarifas según la región y el peso del paquete.
 * Si el peso es menor de 5 kg y la región es "local", el costo es de $5.
 * Si pesa entre 5 y 10 kg, el costo es de $10 para la región "nacional".
 * Para cualquier otro caso, el costo es de $15.
 *
 * @author Carlitos Ismael
 */
import java.util.Scanner;

public class Ejercicio3_Enviopaquetes {

    public static void main(String[] args) {
        double peso_p, costo_p;
        String region;
        Scanner ingreso = new Scanner(System.in);
        System.out.print("INGRESE EL PESO DEL PAQUETE: ");
        peso_p = ingreso.nextDouble();
        System.out.print("INGRESE LA REGION DE ENVIO: ");
        region = ingreso.next();
        if (peso_p < 5 && region.equals("local")) {
            costo_p = 5;
        } else if (peso_p >= 5 && peso_p <= 10 && region.equals("nacional")) {
            costo_p = 10;
        } else {
            costo_p = 15;

        }
        System.out.println("EL COSTO DEL ENVIO DEL PAQUETE ES = " + costo_p);
    }
}
/**
 * *
 * run: INGRESE EL PESO DEL PAQUETE: 2 INGRESE LA REGION DE ENVIO: local EL
 * COSTO DEL ENVIO DEL PAQUETE ES = 5.0
 */
/**
 * *
 * run: INGRESE EL PESO DEL PAQUETE: 7 INGRESE LA REGION DE ENVIO: nacional EL
 * COSTO DEL ENVIO DEL PAQUETE ES = 10.0
 */
/**
 * *
 * run: INGRESE EL PESO DEL PAQUETE: 15 INGRESE LA REGION DE ENVIO: nacional EL
 * COSTO DEL ENVIO DEL PAQUETE ES = 15.0
 */
