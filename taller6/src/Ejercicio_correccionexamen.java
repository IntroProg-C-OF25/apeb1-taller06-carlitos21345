
/** *CORRECCION EXAMEN
 *
 * @author Carlitos Ismael
 */
import java.util.Scanner;
public class Ejercicio_correccionexamen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double acdb1, apeb1, aab1, acdb2, apeb2, aab2, bim1, bim2, totalFIN, acu30, recu;
        String estado;
        System.out.println("Ingrese la nota ACD, APE y AAB del primer bimestre en ese orden: ");
        acdb1 = in.nextDouble();
        apeb1 = in.nextDouble();
        aab1 = in.nextDouble();
        System.out.println("Ingrese la nota ACD, APE y AAB del segundo bimestre en dicho orden: ");
        acdb2 = in.nextDouble();
        apeb2 = in.nextDouble();
        aab2 = in.nextDouble();
        bim1 = acdb1 + apeb1 + aab1;
        bim2 = acdb2 + apeb2 + aab2;
        acu30 = (aab1 + aab2) / 2;
        totalFIN = bim1 + bim2;
        recu = 0;
        if (totalFIN >= 6.5)
        {
            estado = "Aprobado";
            System.out.println(estado);
        }
        else
        {
            estado = "Reprobado";    
            System.out.println(estado);
            System.out.println("Ingrese la nota del exámen de recuperación: ");
            recu = in.nextDouble();
            totalFIN = recu + acu30;
            if (totalFIN >= 6.5)
            {
               estado = "Aprobado";
               System.out.println(estado);
                }
            else
            {
                estado = "Reprobado";
                System.out.println(estado);
                }
         } 
                   System.out.printf("%s\t%s\t%s\t%s\t%s" 
                + "\t%s\t%s\t%s\t%s"
                + "\t%s\t%s\t%s\t%s\t%s\n",
                "NOMBRES", "ACDB1", "APEB1", "AAB1","BIM1",
                "ACDB2", "APEB2", "AAB2","BIM2",
                "TOTALFIN", "ACU30", "RECU", "FINAL", "ESTADO");
        System.out.printf("%s\t%.2f\t%.2f\t%.2f\t%.2f" 
                + "\t%.2f\t%.2f\t%.2f\t%.2f"
                + "\t%.2f\t%.2f\t%.2f\t%.2f\t%s",
                "Cris", acdb1, apeb1, aab1,bim1,
                acdb2, apeb2, aab2, bim2,
                totalFIN, acu30, recu, totalFIN, estado);
    }
}
/***
 * run:
Ingrese la nota ACD, APE y AAB del primer bimestre en ese orden: 
1 2 3 4 5 6
Ingrese la nota ACD, APE y AAB del segundo bimestre en dicho orden: 
Aprobado
NOMBRES	ACDB1	APEB1	AAB1	BIM1	ACDB2	APEB2	AAB2	BIM2	TOTALFIN ACU30	RECU	FINAL	ESTADO
Cris	1,00	2,00	3,00	6,00	4,00	5,00	6,00	15,00	21,00	4,50	0,00	21,00	AprobadoBUILD SUCCESSFUL (total time: 3 seconds)

 */