package ejercicio4;

import java.sql.Date;

public class Computadoras {

	int id;
	String modelo;
	String marca;
	String so;
	int capacidadRAm;
	String color;
	Date fechaHoraVenta;
	double precio;

	public Computadoras() {
		
	}
	public Computadoras(int id) {
		super();
		this.id = id;
	}

	public Computadoras(int id, String modelo, String marca, String so, int capacidadRAm, String color,
			Date fechaHoraVenta, double precio) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.marca = marca;
		this.so = so;
		this.capacidadRAm = capacidadRAm;
		this.color = color;
		this.fechaHoraVenta = fechaHoraVenta;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSo() {
		return so;
	}

	public void setSo(String so) {
		this.so = so;
	}

	public int getCapacidadRAm() {
		return capacidadRAm;
	}

	public void setCapacidadRAm(int capacidadRAm) {
		this.capacidadRAm = capacidadRAm;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getFechaHoraVenta() {
		return fechaHoraVenta;
	}

	public void setFechaHoraVenta(Date fechaHoraVenta) {
		this.fechaHoraVenta = fechaHoraVenta;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Computadoras [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", so=" + so + ", capacidadRAm="
				+ capacidadRAm + ", color=" + color + ", fechaHoraVenta=" + fechaHoraVenta + ", precio=" + precio + "]";
	}

	
	
}
