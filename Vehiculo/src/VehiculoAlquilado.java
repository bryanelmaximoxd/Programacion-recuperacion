
public class VehiculoAlquilado {
    
    public static void main(String [] args){
        Cliente cliente = new Cliente("30435624X","Juan","Perez");
        Vehiculo vehiculo = new Vehiculo("4050 ABJ");
        
        System.out.println("Vehiculo Alquilado");
        System.out.println("Cliente: "+cliente.getDNI()+" "+cliente.getNombre()+" "+cliente.getApellidos());
        //cliente.getCliente();
        //vehiculo.getVehiculo();
        
    }
    
    
    

}
