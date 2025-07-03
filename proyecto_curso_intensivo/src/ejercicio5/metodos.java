package ejercicio5;

import java.util.List;

public interface metodos {
	public void guardar(Videojuegos videojuegos);
	public void eliminar(Videojuegos videojuegos);
	public void editar(Videojuegos videojuegos);
	public Videojuegos buscarId(String codigo);
	
	public List<Object>listar();

}
