package ejercicio3;

public class Moto {
	String nombre;
	String marca;
	int numCilindros;
	String modelo;
	String tipo;
	double precio;
	
	public Moto() {
		
	}

	public Moto(String nombre, String marca, int numCilindros, String modelo, String tipo, double precio) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.numCilindros = numCilindros;
		this.modelo = modelo;
		this.tipo = tipo;
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

	public int getNumCilindros() {
		return numCilindros;
	}

	public void setNumCilindros(int numCilindros) {
		this.numCilindros = numCilindros;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Moto [nombre=" + nombre + ", marca=" + marca + ", numCilindros=" + numCilindros + ", modelo=" + modelo
				+ ", tipo=" + tipo + ", precio=" + precio + "]";
	}
	
	

}
