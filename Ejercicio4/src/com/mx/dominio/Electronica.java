package com.mx.dominio;

import ClaseAbstracta.SuperMercado;

public class Electronica extends SuperMercado{
String nombreElectronica;
String marca;
String modelo;
double precio;


public Electronica() {
	
}


public Electronica(int id, String nombreSuper, String direccion, long telefono, String nombreElectronica, String marca,
		String modelo, double precio) {
	super(id, nombreSuper, direccion, telefono);
	this.nombreElectronica = nombreElectronica;
	this.marca = marca;
	this.modelo = modelo;
	this.precio = precio;
}


public String getNombreElectronica() {
	return nombreElectronica;
}


public void setNombreElectronica(String nombreElectronica) {
	this.nombreElectronica = nombreElectronica;
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
	return "Electronica [nombreElectronica=" + nombreElectronica + ", marca=" + marca + ", modelo=" + modelo
			+ ", precio=" + precio + ", id=" + id + ", nombreSuper=" + nombreSuper + ", direccion=" + direccion
			+ ", telefono=" + telefono + "]";
}




}
