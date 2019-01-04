
public class FrecuenciasCardiacas {
   //atributos
    private String nombre;
    private String apellido;
    //private String fecha_nacimiento;
    private int dia;
    private String mes;
    private int año;
    private int edad;
    private double FCmax;
    private double FCespmin;
    private double FCespmax;
    
    
    public FrecuenciasCardiacas(String nombre, String apellido, int dia, String mes, int año){
        this.nombre=nombre;
        this.apellido=apellido;
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido= apellido;
    }
    public int getDia(){
        return dia;
    }
    public void setDia(int dia){
        this.dia=dia; 
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }
    
    public void setAño(int año) {
        this.año = año;
    }
    
    public void calculaAños(int edad){
        this.edad=edad;

    }
    public int getEdad(){
        edad=2018-año;
        return edad;
    }
    
    public void setFCmax(double FCmax){
        this.FCmax= FCmax;
    }
    
    public double getFCmax(){
        if(edad<40){
            FCmax= 208.75 -(0.75*edad);
            
        }else{
            FCmax= 200 - edad;
        }
        return FCmax;
    }
    public void setFCespMin(double FCespmin){
        this.FCespmin=FCespmin;
    }
    public double getFCespMin(){
        FCespmin=50*FCmax/100;
        return FCespmin;
    }

    
    public void setFCespMax(double FCespmax){
        this.FCespmax=FCespmax;
    }

    public double getFCespmax() {
        FCespmax=85*FCmax/100;
        return FCespmax;
    }
    
    
    
    
    
    
    
    
}
