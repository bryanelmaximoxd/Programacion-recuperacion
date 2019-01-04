
public class Vehiculo {
    private String matricula;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void getVehiculo(){
        System.out.println("Vehiculo: "+this.matricula);
    }
}
