package com.mx.servicio;

import java.util.HashMap;

import com.mx.dao.metodos;
import com.mx.dominio.Electronica;
import com.mx.dominio.Farmacia;
import com.mx.dominio.Ropa;

public class Implementacion implements metodos {

	HashMap<Integer, Object> hash = new HashMap<Integer, Object>();
	Electronica electronico = null;
	Ropa ropa = null;
	Farmacia farmacia = null;

	@Override
	public void guardar(Object obj, String clase) {
		switch (clase) {
		case "electronica":
			electronico = (Electronica) obj;
			hash.put(electronico.getId(), electronico);
			System.out.print("Se guardo el objeto");

			break;

		case "farmacia":
			farmacia = (Farmacia) obj;
			hash.put(farmacia.getId(), farmacia);
			System.out.print("Se guardo el objeto");

			break;

		case "ropa":
			ropa = (Ropa) obj;
			hash.put(ropa.getId(), ropa);
			System.out.print("Se guardo el objeto");

			break;
		}

	}

	@Override
	public void eliminar(Object obj, String clase) {
		switch(clase) {
		case "electronica":
			electronico = (Electronica) obj;
			hash.remove(electronico.getId(), electronico);
			System.out.print("Se guardo el objeto");

			break;

		case "farmacia":
			farmacia = (Farmacia) obj;
			hash.remove(farmacia.getId(), farmacia);
			System.out.print("Se guardo el objeto");

			break;

		case "ropa":
			ropa = (Ropa) obj;
			hash.remove(ropa.getId(), ropa);
			System.out.print("Se guardo el objeto");

			break;
		
			
		}


	}

	@Override
	public void editar(Object obj, String clase) {
		switch(clase) {
		case "electronica":
			electronico = (Electronica) obj;
			hash.put(electronico.getId(), electronico);
			System.out.print("Se guardo el objeto");

			break;

		case "farmacia":
			farmacia = (Farmacia) obj;
			hash.put(farmacia.getId(), farmacia);
			System.out.print("Se guardo el objeto");

			break;

		case "ropa":
			ropa = (Ropa) obj;
			hash.put(ropa.getId(), ropa);
			System.out.print("Se guardo el objeto");

			break;
		
			
		}

	}

	@Override
	public Object buscar(int id) {
		

		return hash.get(id);
	}

	@Override
	public void listar() {
		System.out.print("Lista de productos:\n " + hash );

	}

}
