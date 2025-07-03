package com.mx.dao;

public interface metodos {
public void guardar(Object obj,String clase);
public void eliminar(Object obj,String clase);
public void editar(Object obj,String clase);
public Object buscar(int id);
public void listar();
}
