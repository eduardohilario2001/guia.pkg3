package casos1;

import java.util.Scanner;

public class caso5 {
       public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=0;
        int i=1;
        int menor=10000;
         while (i<=5) {  
             System.out.println("Ingrese numero " + i +":");
             n=x.nextInt();
             i++;
             if (n<menor) {
              menor=n;
             }
         }
         System.out.println("El numero mayor es: " +menor);
     }    
}

