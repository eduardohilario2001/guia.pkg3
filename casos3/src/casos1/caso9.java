package casos1;

import java.util.Scanner;

public class caso9 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in); 
        String continuar="S" , nombre="";
        int n1=0,n2,n3,c=0,c_aptos=0,c_denegado = 0;
        float promedio = 0,asistencia,estado,mayor=0,menor=0;
        String n = null,e = null;
        while (continuar.contentEquals("S")|| continuar.contentEquals("s")){
        c++;
            System.out.println("Resgistro N" +c);
            System.out.println("============");
            
            System.out.println("Participante: ");
        nombre=x.next();
        
            System.out.println("Nota 1: ");
        n1=x.nextInt();
            System.out.println("Nota 2: ");
        n2=x.nextInt();
            System.out.println("Nota 3: ");
        n3=x.nextInt();
            System.out.println("Asitencia[1-12]");
        int a=x.nextInt();
            System.out.println("---Resultados---");
            System.out.println("----------------");
            promedio=(float) (n1*0.2+n2*0.3+n3*0.5);
            asistencia=(float)(a*100/12);
            System.out.println("Promedio: " +promedio);
            System.out.println("Asistencia: " +asistencia);
            if (promedio>=13 && asistencia>=70) {
                System.out.println("Estado:Certificado");
                c_aptos=c_aptos+1;
            } else {
                System.out.println("Estado:Sin certificado");
                c_denegado=c_denegado+1;
            }if (promedio>mayor) {
                mayor=promedio;
                n=nombre;
            }else{
                menor=promedio;
                e=nombre;
            }
            System.out.println("¿Desea continuar<S/N>?");
            continuar=x.next();
        }
        System.out.println("Numeros de alumnos: " +c);
        System.out.println("Mayor promedio:" +mayor+ " pertenece a:" +n);
        System.out.println("Menor promedio:" +menor+ " pertenece a:" +e);
        System.out.println("Numeros de alumnos certificados: " +c_aptos);
        System.out.println("Numeros de alumnos sin certificados: " +c_denegado);
        
}
    }  

