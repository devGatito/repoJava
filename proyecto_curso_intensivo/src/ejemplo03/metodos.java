package ejemplo03;

import java.util.List;

public interface metodos {
public void guardar(Empleados empleado);
public void editar(int indice, Empleados empleado);
public void eliminar(int indice, Empleados empleado);
public Empleados buscarIndice(int id);

public List<Empleados>lista();





}
