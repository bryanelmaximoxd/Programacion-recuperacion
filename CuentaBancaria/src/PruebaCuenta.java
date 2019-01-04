import java.util.Scanner;
public class PruebaCuenta {
    
    public static void main (String [] args){
       Cuenta cuenta1 = new Cuenta("Juan", 25.00);
       Cuenta cuenta2 = new Cuenta("Elisa", -7.50);
        System.out.println("Datos Iniciales:");
         System.out.println("Cuenta 1:\n"+"Nombre: "+cuenta1.getNombre()+"\n"+"Saldo: "+cuenta1.getSaldo());
         //cuenta1.getNombre();
         //cuenta1.getSaldo();
         System.out.print("\n");
         System.out.println("Cuenta 2:\n"+"Nombre: "+cuenta2.getNombre()+"\n"+"Saldo: "+cuenta2.getSaldo());
         //cuenta2.getNombre();
         //cuenta2.getSaldo();
         
         //Inicializamos e Monto del deposito
         double MontoDeposito=0;
         
         Scanner entrada = new Scanner(System.in);
         System.out.print("Ingrese el monto a depositar a la Cuenta 1: ");
         MontoDeposito = entrada.nextDouble();
         System.out.println("");
         System.out.println("Sumando el monto depositado a la Cuenta 1 seria:");
         System.out.println("Cuenta 1:\n"+"Nombre: "+cuenta1.getNombre()+"\n"+"Saldo: "+cuenta1.depositar(MontoDeposito));
         //cuenta1.getNombre();
         //cuenta1.depositar(MontoDeposito);
         
         System.out.print("Ingrese el monto a depositar a la cuenta 2: ");
         MontoDeposito =entrada.nextDouble();
         System.out.println("");
         System.out.println("Sumando el monto depositado a la cuenta 2 seria:");
         System.out.println("Cuenta 2:\n"+"Nombre: "+cuenta2.getNombre()+"\n"+"Saldo: "+cuenta2.depositar(MontoDeposito));
         //cuenta2.getNombre();
         //cuenta2.depositar(MontoDeposito);
         
         System.out.println("Resumen de datos: ");
         System.out.println("Cuenta 1: "+cuenta1.getNombre()+" "+cuenta1.depositar(MontoDeposito));
         System.out.println("Cuenta 2: "+cuenta2.getNombre()+" "+cuenta2.depositar(MontoDeposito));
         
     
    }
   
}
