package casos1;
//Desarrolado por Jesus
import java.util.Scanner;

public class caso3 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=0;
        
        System.out.println("Ingrese Numero: ");
        n=x.nextInt();
        int i=1;
        int s=0;
         if (7>=n) {
        while (i<=n) {
        s=s*i;
        i=i+1;    
        }
        System.out.println("La sumatoria de " +n +" es: " +s);    
        } else {    
        System.out.println("El numero es superior de 7"); 
}
}
}