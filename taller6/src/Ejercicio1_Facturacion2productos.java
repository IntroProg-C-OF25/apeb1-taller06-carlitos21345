
/** *
 * La empresa Amazon.com le contrata como desarrollador de Sistemas Informáticos para programar su sistema de compras online,
 * el cual calcule el precio total de la compra para un cliente.
 * Para ello, se necesita utilizar estructuras secuenciales y de selección (if simple, doble y/o anidadas),
 * sin aplicar ciclos repetitivos.
 *
 * @author Carlitos
 */
import java.util.Scanner;

public class Ejercicio1_Facturacion2productos {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);
        double costoProd1, costoProd2, costoEnvio, iva, descuento, subTotal, costoFinal;
        System.out.print("DAME TRES COSTOS(2 del producto + 1 envio): ");
        costoProd1 = ingreso.nextDouble();
        costoProd2 = ingreso.nextDouble();
        costoEnvio = ingreso.nextDouble();
        iva = (costoProd1 + costoProd2) * 0.10;
        subTotal = iva + (costoProd1 + costoProd2);
        descuento = subTotal * 0.05;
        if (subTotal <= 1000) {
            descuento = 0.05;

        } else {
            if (subTotal > 1000) {
                descuento = subTotal * 0.20;
            }
        }
        descuento *= subTotal;
        if (subTotal >= 5000) {
            costoEnvio = 0;
        }
        costoFinal = subTotal - descuento + costoEnvio;
        System.out.println("IVA = " + iva);
        System.out.println("DESCUENTO = " + descuento);
        System.out.println("costoFinal = " + costoFinal);
    }
}

/**
 * *
 * run: DAME TRES COSTOS(2 del producto + 1 envio): 10 10 10 costoFinal = 30.9
 * BUILD SUCCESSFUL (total time: 4 seconds)
 *
 */
