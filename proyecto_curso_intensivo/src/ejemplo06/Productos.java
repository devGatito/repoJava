package ejemplo06;

public class Productos {
	String nombre;
	String marca;
	String sabor;
	int cantidad;
	double precio;
	
	public Productos() {
		
	}
	public Productos(String nombre, String marca, String sabor, int cantidad, double precio) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.sabor = sabor;
		this.cantidad = cantidad;
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
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "\n===Productos=== \n nombre: " + nombre + "\n marca:" + marca + "\n sabor:" + sabor + "\n cantidad:" + cantidad
				+ "\n precio=" + precio ;
	}
	
	
	
	

}
