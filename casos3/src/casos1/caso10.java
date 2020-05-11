package casos1;

import java.util.Scanner;

public class caso10 {
     public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
          String continuar="S" , nombre="";
        int n1=0,n2,n3,c=0,c_aptos=0,c_denegado = 0;
        float sueldobruto= 0,bonificacion=0,descuento=0,mayor=0,menor=0,sueldoneto = 0,alcanzado,m = 0,f=0,t=0;
        String n = null,e = null,d=null;
        while (continuar.contentEquals("S")|| continuar.contentEquals("s")){
        c++;
            System.out.println("Resgistro N" +c);
            System.out.println("============");
            
            System.out.println("Empleado: ");
        nombre=x.next();
        
            System.out.println("Horas trabajadas: ");
        n1=x.nextInt();
            System.out.println("Tarifa por hora: ");
        n2=x.nextInt();
            System.out.println("Minutos de tardanza: ");
        n3=x.nextInt();
            System.out.println("---Resultados---");
            System.out.println("----------------");  
        sueldobruto=n1*n2;
      alcanzado=n1*100/80;           
            if (n1<=50) {
               bonificacion=0;
                System.out.println("Bonificacion: " +bonificacion);
            }if (n1>=51 && n1<=60) {
                bonificacion=(float) (sueldobruto*0.02);
                System.out.println("Bonificacion: " +bonificacion);
            }if (n1>=61 && n1<=70) {
                bonificacion=(float) (sueldobruto*0.08);
                System.out.println("Bonificacion: " +bonificacion);
            }if (n1>=71 && n1<=80) {
                bonificacion=(float) (sueldobruto*0.13);
                System.out.println("Bonificacion: " +bonificacion);
            }if (n1>=81) {
                bonificacion=(float) (sueldobruto*0.15); 
                System.out.println("Bonificacion: " +bonificacion);
            }if (n3<=15) {
                descuento=0;
                System.out.println("Descuento: " +descuento);
            }if (n3>=16 && n3<=30) {
                descuento=(float) (sueldobruto*0.03);
                System.out.println("Descuento: " +descuento);
            }if (n3>=30) {
                descuento=(float) (sueldobruto*0.05);
                System.out.println("Descuento: " +descuento);    
     }sueldoneto=sueldobruto+bonificacion-descuento; 
            if (sueldoneto>mayor) {
                mayor=sueldoneto;
                n=nombre;
            }else{
                menor=sueldoneto;
                e=nombre;           
            }if (n3>t) {
                m=n3;
                d=nombre;
            }if (alcanzado>=91) {
               f=f+1;
            }sueldoneto=sueldobruto+bonificacion-descuento; 
            System.out.println("Sueldo bruto: " +sueldobruto);
            System.out.println("Sueldo neto: " +sueldoneto);
            System.out.println("%Alcanzado: " +alcanzado);
            
     System.out.println("¿Desea continuar<S/N>?");
            continuar=x.next();
            
     } System.out.println("Numeros de empleados: " +c);
        System.out.println("Sueldo neto mayor:" +mayor+ " pertenece a:" +n);
        System.out.println("Sueldo neto menor:" +menor+ " pertenece a:" +e);
         System.out.println("Empleador con la mayor cantidad de minutos de tardanza: " +d+" " +m);
         System.out.println("Cantidad de empleados con mas del 90% de la meta: "+1);
}
}
     
