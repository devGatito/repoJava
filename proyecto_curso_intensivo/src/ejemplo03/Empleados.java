package ejemplo03;

public class Empleados {
	String nombre;
	String app;
	int edad;
	String sexo;
	String depto;
	double sueldo;
	
	
	public Empleados() {
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApp() {
		return app;
	}


	public void setApp(String app) {
		this.app = app;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getDepto() {
		return depto;
	}


	public void setDepto(String depto) {
		this.depto = depto;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public Empleados(String nombre, String app, int edad, String sexo, String depto, double sueldo) {
		super();
		this.nombre = nombre;
		this.app = app;
		this.edad = edad;
		this.sexo = sexo;
		this.depto = depto;
		this.sueldo = sueldo;
	}


	@Override
	public String toString() {
		return "Empleados [nombre=" + nombre + ", app=" + app + ", edad=" + edad + ", sexo=" + sexo + ", depto=" + depto
				+ ", sueldo=" + sueldo + "]";
	}
	
	

}
