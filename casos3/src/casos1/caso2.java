package casos1;

import java.util.Scanner;

public class caso2 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int n=0;
        
        System.out.println("Ingrese Numero: ");
        n=x.nextInt();
        int i=1;
        int s=0;
        
        while (i<=n) {
        s=s+i;
        i=i+1;    
        }
        System.out.println("La sumatoria de " +n +" es: " +s);
    }    
}
