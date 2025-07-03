package ejercicio4;

import java.util.HashMap;

public interface metodos {
public void eliminar(Computadoras computadora);
public void editar(Computadoras computadora);
public void guardar(Computadoras computadora);

public Computadoras buscarComputadoras(Computadoras computadora);
public HashMap<Integer,Computadoras>listar(); 
}
