package com.mx.dao;

import java.util.List;

public interface Metodos {
public void guardar(Object obj, String clase);
public void eliminar(Object obj, String clase);
public void editar(Object obj, String clase);
public Object buscar(int indice);
List<Object> listar();
}
