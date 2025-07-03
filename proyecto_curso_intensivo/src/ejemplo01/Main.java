package ejemplo01;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class Main {

	public static void main(String[] args) {
		Autos newAutos = new Autos("Vocho", "Volvagen","Vocho","4",3200);
		Autos newAutos1 = new Autos("Vocho", "Volvagen","Vocho","4",3200);
		Autos newAutos2 = new Autos("Vocho", "Volvagen","Vocho","4",3200);
		Autos newAutos3 = new Autos("Vocho", "Volvagen","Vocho","4",3200);
		Autos newAutos4 = new Autos("Vocho", "Volvagen","Vocho","4",3200);

		
		List<Autos> lista = new ArrayList<Autos>();
		
		lista.add(newAutos);
		lista.add(newAutos1);
		lista.add(newAutos2);
		lista.add(newAutos3);
		lista.add(newAutos4);
		
		Autos autoBuscar = lista.get(4);
		System.out.print("Autos\n");
		System.out.print( "\n Se encontro el auto que buscas " + autoBuscar);
		
		System.out.println("METODO EDITAR\n");
		Autos autoeditar = lista.get(0);
		autoeditar.setMarca("LOLA");

		
		lista.set(0, autoeditar);
		System.out.print("\nSe encontro el auto que quiere editar" + autoeditar);
		
		//metodo eliminar 
		
		lista.remove(1);
		System.out.println("\n Metodo Actualizado" + lista );
		
		String puertasBuscadas = "4";
		// Buscar  por numero de puertas lamda
		System.out.print( "Metodo para buscar "+ puertasBuscadas);
		lista.stream().filter(a-> a.getNumPuertas() == puertasBuscadas).forEach(b -> {
			System.out.println("se encontro el auto por numero de puertas" + b);
		});;
		
		

		System.out.print("*******************");
		System.out.print("Recorrer una lista utilizando iterator");
		Iterator<Autos> interador = lista.iterator();
		
		
		while(interador.hasNext()) {
			Autos autointerar = interador.next();
			System.out.print("\n Lista de autos con interator" + autointerar);
		
		}
		
	
		
		
	

	}

}
