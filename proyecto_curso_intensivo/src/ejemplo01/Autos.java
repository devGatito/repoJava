package ejemplo01;

public class Autos {
	String nombre;
	String marca;
	String modelo;
	String numPuertas;
	double precio;
	
	public Autos() {
		
	}
	
	public Autos(String nombre, String marca, String modelo, String numPuertas, double precio) {
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.numPuertas = numPuertas;
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

	public String getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(String numPuertas) {
		this.numPuertas = numPuertas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Autos [nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + ", numPuertas=" + numPuertas
				+ ", precio=" + precio + "]";
	}
	
	
	
	

}
