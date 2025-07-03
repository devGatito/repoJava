package com.mx.dominio;

import ClaseAbstracta.SuperMercado;

public class Farmacia extends SuperMercado {
	String nombre;
	String marca;
	String desc;
	double precio;
	public Farmacia() {
		super();
	}
	public Farmacia(int id) {
		super(id);
	}
	public Farmacia(int id, String nombreSuper, String direccion, long telefono, String nombre, String marca,
			String desc, double precio) {
		super(id, nombreSuper, direccion, telefono);
		this.nombre = nombre;
		this.marca = marca;
		this.desc = desc;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Farmacia [nombre=" + nombre + ", marca=" + marca + ", desc=" + desc + ", precio=" + precio + ", id="
				+ id + ", nombreSuper=" + nombreSuper + ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}
	
	

}
