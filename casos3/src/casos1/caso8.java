package casos1;

import java.util.Scanner;

public class caso8 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in); 
       int resultado; 
        System.out.println("Ingrese numero: ");
    int a=x.nextInt();
        for (int i = 1; i <= 15; i++) {
            resultado=i*a;
            System.out.println(a+ " * " +i+ " =" +resultado);
        }
    }
}
