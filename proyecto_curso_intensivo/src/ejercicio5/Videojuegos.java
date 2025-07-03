package ejercicio5;

import java.time.LocalDateTime;

public class Videojuegos {
	String codigo;
	String nombre;
	String tipo;
	String color;
	int inventario;
	int cantidadVendida;
	LocalDateTime fechaVenta;
	double precio;
	double ganancias;

	public Videojuegos() {

	}

	public Videojuegos(String codigo) {
		super();
		this.codigo = codigo;
	}

	public Videojuegos(String codigo, String nombre, String tipo, String color, int inventario, int cantidadVendida,
			LocalDateTime fechaVenta, double precio, double ganancias) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo = tipo;
		this.color = color;
		this.inventario = inventario;
		this.cantidadVendida = cantidadVendida;
		this.fechaVenta = fechaVenta;
		this.precio = precio;
		this.ganancias = ganancias;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getInventario() {
		return inventario;
	}

	public void setInventario(int inventario) {
		this.inventario = inventario;
	}

	public int getCantidadVendida() {
		return cantidadVendida;
	}

	public void setCantidadVendida(int cantidadVendida) {
		this.cantidadVendida = cantidadVendida;
	}

	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}

	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getGanancias() {
		return ganancias;
	}

	public void setGanancias(double ganancias) {
		this.ganancias = ganancias;
	}

	@Override
	public String toString() {
		return "Videojuegos [codigo=" + codigo + ", nombre=" + nombre + ", tipo=" + tipo + ", color=" + color
				+ ", inventario=" + inventario + ", cantidadVendida=" + cantidadVendida + ", fechaVenta=" + fechaVenta
				+ ", precio=" + precio + ", ganancias=" + ganancias + "]";
	}

	
	
}
