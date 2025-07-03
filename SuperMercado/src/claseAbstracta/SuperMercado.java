package claseAbstracta;

public abstract class SuperMercado {
	
	protected int id;
	protected String nombreSuper;
	protected String direccion;
	protected long telefono;
	
	
	public SuperMercado(int id, String nombreSuper, String direccion, long telefono) {
		super();
		this.id = id;
		this.nombreSuper = nombreSuper;
		this.direccion = direccion;
		this.telefono = telefono;
	}


	public SuperMercado() {
		super();
	}


	public SuperMercado(int id) {
		super();
		this.id = id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombreSuper() {
		return nombreSuper;
	}


	public void setNombreSuper(String nombreSuper) {
		this.nombreSuper = nombreSuper;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public long getTelefono() {
		return telefono;
	}


	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}


	@Override
	public String toString() {
		return "\nSuperMercado \n id: " + id + "\n nombreSuper: " + nombreSuper + "\n direccion: " + direccion + "\n telefono: "
				+ telefono;
	}



	
	
	
	
/*


toString()

Getters/Setters
 */

}
