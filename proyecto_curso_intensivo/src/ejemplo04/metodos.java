package ejemplo04;

import java.util.HashMap;

public interface metodos {
	public void guardar(Productos productos);
	public void editar(Productos productos);
	public void eliminar(Productos productos);
	public Productos buscar(Productos producto);
	public HashMap<Integer,Productos> listar();
	

}
