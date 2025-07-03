package ejemplo06;

import java.time.LocalDateTime;

public class Clientes {

	String nombre;
	String app;
	LocalDateTime fechaNacimiento;
	int edad;
	String sexo;
	String correo;
	long telefono;

	public Clientes() {
	}

	public Clientes(String nombre) {

	}

	public Clientes(int id) {

	}

	public Clientes(String nombre, String app, LocalDateTime fechaNacimiento, int edad, String sexo, String correo,
			long telefono) {
		super();
		this.nombre = nombre;
		this.app = app;
		this.fechaNacimiento = fechaNacimiento;
		this.edad = edad;
		this.sexo = sexo;
		this.correo = correo;
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Clientes \n nombre: " + nombre + "\n app:" + app + "\n fechaNacimiento:" + fechaNacimiento + "\n edad: " + edad
				+ "\n sexo:" + sexo + "\n correo=" + correo + "\n telefono=" + telefono;
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

	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	

	
}
