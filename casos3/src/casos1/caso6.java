package casos1;

import java.util.Scanner;

public class caso6 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);               
        String continuar="S" , nombre="";
        int edad=0,c=0,c_aptos=0;
        while (continuar.contentEquals("S")|| continuar.contentEquals("s")){
        c++;
            System.out.println("Resgistro N" +c);
            System.out.println("============");
            
            System.out.println("Participante: ");
        nombre=x.next();
        
            System.out.println("Edad");
        edad=x.nextInt();
            if (edad>=18) {
                System.out.println("Apto para votar");
                c_aptos=c_aptos+1;
            } else {
                System.out.println("Menor de edad");
            }
            
            System.out.println("¿Desea continuar<S/N>?");
            continuar=x.next();
            
        }
        System.out.println("Resumen");
        System.out.println("========");
        System.out.println("Participantes registrados: " +c);
        System.out.println("Cantidad de Participantes aptos para votar: " +c_aptos);
}
}
