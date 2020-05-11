package casos1;
//Desarrollado por Jesus
import java.util.Scanner;

public class caso4 {
     public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=0;
        int i=1;
        int mayor=0;
         while (i<=4) {  
             System.out.println("Ingrese numero " + i +":");
             n=x.nextInt();
             i++; 
             if (n>mayor) {
                 mayor=n;             
             }
         }
         System.out.println("El numero mayor es: " +mayor);
     }    
}
