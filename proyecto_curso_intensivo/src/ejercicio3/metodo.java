package ejercicio3;

import java.util.List;

public interface metodo {
	
	void guardar(Moto moto);
	void eliminar(int indice);
	void editar(int indice, Moto moto);
	void buscar(int indice, Moto moto);
	
	List<Moto> lista();
	void mostrarPosicion();	
	
	


	

}
