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
	            System.out.println(cant + " personas eliminadas de " + nombre);
	        } else {
	            System.out.println("No se pueden eliminar tantas personas de " + nombre);
	        }
	}
	   
	public void gestionarSeccion(int CapacidadPersonas) {
        if (CapacidadPersonas >= 0) {
            agregarP(CapacidadPersonas);
        } else {
            EliminarP(Math.abs(CapacidadPersonas));
        }
    }

	 public void Ocupacion() {
	        System.out.println(nombre + ": " + PersonasAhora+ "/" + CapacidadPersonas + " personas.");
	    
	 }

}
