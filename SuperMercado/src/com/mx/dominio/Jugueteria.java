package com.mx.dominio;

import claseAbstracta.SuperMercado;

public class Jugueteria extends SuperMercado {
	
	String nombreJuguete;
	String marca;
	int edadMinima;
	double precio;
	public Jugueteria() {
		super();
	}
	public Jugueteria(int id) {
		super(id);
	}
	public Jugueteria(int id, String nombreSuper, String direccion, long telefono, String nombreJuguete, String marca,
			int edadMinima, double precio) {
		super(id, nombreSuper, direccion, telefono);
		this.nombreJuguete = nombreJuguete;
		this.marca = marca;
		this.edadMinima = edadMinima;
		this.precio = precio;
	}
	public String getNombreJuguete() {
		return nombreJuguete;
	}
	public void setNombreJuguete(String nombreJuguete) {
		this.nombreJuguete = nombreJuguete;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getEdadMinima() {
		return edadMinima;
	}
	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Jugueteria [nombreJuguete=" + nombreJuguete + ", marca=" + marca + ", edadMinima=" + edadMinima
				+ ", precio=" + precio + ", id=" + id + ", nombreSuper=" + nombreSuper + ", direccion=" + direccion
				+ ", telefono=" + telefono + "]";
	}
	
	
	
	
	

}
