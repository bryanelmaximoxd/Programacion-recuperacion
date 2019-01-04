
public class Cuenta {
    private String Nombre;
    private double Saldo;
    
    
    
    public Cuenta(String Nombre, double Saldo){
        this.Nombre=Nombre;
        if(Saldo>0.0)
        this.Saldo=Saldo;
    }

    /*public void setSaldo(double Saldo){
        System.out.println("Saldo: "+this.Saldo);
    }*/
    public String getNombre(){
        return this.Nombre;
    }
    public double getSaldo(){
        return this.Saldo;
    }
    
    
    public double depositar(double MontoDeposito){
        if(MontoDeposito>0.0)
            Saldo+=MontoDeposito;
            //System.out.println("Saldo: "+this.Saldo);
            return Saldo;
    }
    
    /*public void setNombre(){
        System.out.println("Nombre: "+this.Nombre);
    }*/
    
    
    




    
    
}
