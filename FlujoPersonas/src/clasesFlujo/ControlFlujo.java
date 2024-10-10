package clasesFlujo;
import java.util.Scanner;


public class ControlFlujo {
   
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		  Oficina oficina = new Oficina();
	      SalaReunion salaReunion = new SalaReunion();
	      Cafeteria cafeteria = new Cafeteria();
	      
	      
	      while(true) {
	    	  System.out.println("seleccione la sección del edificio para agregar o eliminar personas");
	    	  System.out.println("1. Oficina");
	          System.out.println("2. Sala de Reunión");
	          System.out.println("3. Cafetería");
	          System.out.println("4. Salir");
	          int opcion = scanner.nextInt();
	          
	          if(opcion == 4) {
	        	  System.out.println("Saliendo del sistema...");
	              break;
	          }
	          
	          System.out.println("Ingrese la cantidad de personas a agregar o eliminar (número negativo para eliminar):");
	           int CapacidadPersonas = scanner.nextInt();
	           
			   switch (opcion) {
                case 1:
                    oficina.gestionarSeccion(CapacidadPersonas);
                    break;
                case 2:
				    salaReunion.gestionarSeccion(CapacidadPersonas);
                    break;
                case 3:
                    cafeteria.gestionarSeccion(CapacidadPersonas);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            oficina.Ocupacion();
            salaReunion.Ocupacion();
            cafeteria.Ocupacion();
        }

        scanner.close();
    }
}
