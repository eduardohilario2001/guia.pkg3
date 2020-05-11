package casos1;

import java.util.Scanner;

public class caso7 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        String nombre="";
        System.out.println("Ingrese nombre: ");
        nombre=x.nextLine();
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + ". Bienvenido " + nombre + "al curso. ");
        }
    }
}
