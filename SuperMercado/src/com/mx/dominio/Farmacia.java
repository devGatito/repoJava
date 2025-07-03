package com.mx.dominio;

import claseAbstracta.SuperMercado;

public class Farmacia extends SuperMercado {
	String nombre;
	String marca;
	String modelo;
	double precio;
	public Farmacia() {
		super();
	}
	public Farmacia(int id) {
		super(id);
	}
	public Farmacia(int id, String nombreSuper, String direccion, long telefono, String nombre, String marca,
			String modelo, double precio) {
		super(id, nombreSuper, direccion, telefono);
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Farmacia [nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", id="
				+ id + ", nombreSuper=" + nombreSuper + ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}
	
	
	

}
