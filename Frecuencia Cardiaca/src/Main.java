
public class Main {
   public static void main(String [] args){
       FrecuenciasCardiacas f1 = new FrecuenciasCardiacas("Boris", "Huamanchumo", 29, "Septiembre", 1983);
       System.out.println("Nombre: "+f1.getNombre()+"\nApellidos: "+f1.getApellido()+"\nFecha de nacimiento: "
                                    +f1.getDia()+"--"+f1.getMes()+"--"+f1.getAño());
       System.out.println("Su edad es: "+f1.getEdad());
       System.out.println("La frecuencia cardiaca maxima es: "+f1.getFCmax()+" latidos/minuto");
       System.out.println("La frecuencia cardiaca esperada esta en un rango de : "+f1.getFCespMin()+" a "+f1.getFCespmax()+" "
               + "latidos/minuto");
   }
    
    
}
