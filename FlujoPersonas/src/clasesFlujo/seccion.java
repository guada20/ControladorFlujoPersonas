package clasesFlujo;

public class seccion{
	
	public String nombre;
	public int CapacidadPersonas;
	public int PersonasAhora;
   
	
	public seccion (String nombre, int CapacidadPersonas) {
		this.nombre=nombre;
		this.CapacidadPersonas=CapacidadPersonas;
		this.PersonasAhora=0;
		
	}
	
	public void agregarP (int cant){
		  if (PersonasAhora + cant <= CapacidadPersonas) {
	            PersonasAhora += cant;
	            System.out.println(cant+ " personas agregadas a " + nombre);
	        } else {
	            System.out.println("¡Capacidad máxima alcanzada en " + nombre + "!");
	        }
	}
	
	public void EliminarP(int cant) {
	        if (PersonasAhora - cant >= 0) {
	            PersonasAhora -= cant;
	            System.out.println(cant + " personas removidas de " + nombre);
	        } else {
	            System.out.println("No se pueden remover tantas personas de " + nombre);
	        }
	}
	   
	
	 public void Ocupacion() {
	        System.out.println(nombre + ": " + PersonasAhora+ "/" + CapacidadPersonas + " personas.");
	    
	 }

	 

}
