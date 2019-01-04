package Perimetro;




import java.util.Scanner;


public class Principal {
    
    public static void main(String [] args){
       Cuadrilatero c1;
       float lado1, lado2;
       Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el lado 1: ");
        lado1 = entrada.nextFloat();
        System.out.println("Ingrese el lado 2: ");
        lado2=entrada.nextFloat();
        
        if(lado1==lado2){
            c1=new Cuadrilatero(lado1);
        }else{
            c1=new Cuadrilatero(lado1,lado2);
        }
        System.out.println("El perimetro del cuadrilatero es: "+c1.getPerimetro());
        System.out.println("El area del cuadrilatero es: "+c1.getarea());
        
    }
    
    
    
}
