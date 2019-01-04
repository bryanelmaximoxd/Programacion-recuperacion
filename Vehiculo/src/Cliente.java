
public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    
    public Cliente(String dni, String nombre, String apellidos){
        this.apellidos=apellidos;
        this.nombre=nombre;
        this.dni=dni;
    }
    
    public String getDNI(){
        return this.dni;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    
    public void getCliente(){
        //System.out.println("Cliente: "+this.dni+" "+ this.nombre+" "+ this.apellidos);  
        
    }
}
