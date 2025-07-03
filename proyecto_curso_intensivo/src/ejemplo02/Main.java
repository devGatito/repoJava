package ejemplo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		int id;
		String marca;
		String tipo;
		String color;
		String descripcion;
		int cantidad;
		double precio;
		
		
		Herramientas herramientas = null;

		Scanner lec = null;
		int menu, submenu, indice;

		List<Herramientas> lista = new ArrayList<Herramientas>();

		do {
			System.out.println("================Bienvenido a la ferreteria==================");
			System.out.println("1.- Alta de Herramientas con  codigo duro");
			System.out.println("2.- Guardar  una herramienta");
			System.out.println("3.- Buscar   una herramienta");
			System.out.println("4.- Editar   una herramienta");
			System.out.println("5.- Eliminar una herramienta");
			System.out.println("6.- Listar las herramientas");
			System.out.println("7.- salir......");

			lec = new Scanner(System.in);
			menu = lec.nextInt();

			if (menu < 1 || menu > 7) {
				System.out.println("Seleccione una opcion valida del 1 al 7 ");

			} else {
				switch (menu) {

				case 1:
					Herramientas herramienta1 = new Herramientas(1, "trupper", "jardineria", "naranja", "tijeras", 10, 150);
							
					Herramientas herramienta2 = new Herramientas(2, "pretul", "jardineria", "verde", "manguera", 10, 200);
							
					Herramientas herramienta3 = new Herramientas(3, "bellota", "construccion", "roja", "pala", 10, 150);
					Herramientas herramienta4 = new Herramientas(4, "patito", "electricidad", "verde", "cable", 10, 300);
					
					lista.add(herramienta1);
					lista.add(herramienta2);
					lista.add(herramienta3);
					lista.add(herramienta4);
					
					
					
					System.out.println("Se registraron correctamente las herremientas");
							

					break;
				case 2:
					System.out.println("Ingresa el id de la herramienta");
					lec = new Scanner(System.in);
					id = lec.nextInt();
					
					System.out.println("Ingresa la marca de la herramienta");
					lec = new Scanner(System.in);
					marca = lec.nextLine();
					
					System.out.println("Ingresa el tipo de la herramienta");
					lec = new Scanner(System.in);
					tipo = lec.nextLine();
					
					System.out.println("Ingresa el color de la herramienta");
					lec = new Scanner(System.in);
					color = lec.nextLine();
					
					System.out.println("Ingresa la descripcion de la herramienta");
					lec = new Scanner(System.in);
					descripcion = lec.nextLine();
					
					System.out.println("Ingresa la cantidad en inventario");
					lec = new Scanner(System.in);
					cantidad = lec.nextInt();
					
					System.out.println("Ingresa la precio en inventario");
					lec = new Scanner(System.in);
					precio = lec.nextDouble();
					
					herramientas = new Herramientas(id, marca, tipo, color, descripcion, cantidad, precio);
					lista.add(herramientas);
					System.out.println("Se guardo correctamente la herramienta" + herramientas.getId() + "exitosamente");
					break;
					
					
				case 3:
					System.out.println("Ingrese el indice de la herramienta que busca");
					indice = lec.nextInt();
					
					if(indice >= 0 && indice < lista.size()) {
						System.out.println("Herramienta encontrada: " + lista.get(indice));
						
					}else {
						System.out.println("indice fuera de rango");
					}
					
					
					break;

				case 4:
					System.out.println("Ingrese el indice de la herramienta que va editar");
					indice = lec.nextInt();
					lec.nextLine();
					
					if(indice >= 0 && indice < lista.size()) {
						System.out.println("Edite los nuevos valores");
						
						System.out.println("nueva marca: ");
						marca = lec.nextLine();
						
						System.out.println("nuevo tipo: ");
						tipo = lec.nextLine();
						
						System.out.println("nuevo color: ");
						color = lec.nextLine();
						
						System.out.println("nueva descripcion: ");
						descripcion = lec.nextLine();
						
						System.out.println("nueva cantidad: ");
						cantidad = lec.nextInt();
						
						System.out.println("nuevo precio: ");
						precio = lec.nextDouble();
						
						herramientas = lista.get(indice);
						
						herramientas.setMarca(marca);
						herramientas.setTipo(tipo);
						herramientas.setColor(color);
						herramientas.setDescripcion(descripcion);
						herramientas.setCantidad(cantidad);
						herramientas.setPrecio(precio);
						System.out.println("herramienta editada correctamente");
					}else {
						System.out.println("indice no valido");
					}
					break;

				case 5:
					System.out.println("Ingrese el indice de la herramienta que va eliminar");
					indice = lec.nextInt();
					
					if(indice >= 0 && indice < lista.size()) {
						lista.remove(indice);
						System.out.println("Herramienta eliminada correctamente");
					}else {
						System.out.println("indice fuera de rango");
					}
					
					break;

				case 6:
					System.out.println("Lista de herramientas: \n" + lista);
					break;

				case 7:
					System.out.println("gracias por usar el sistema de ferreteria ");
					break;

				}
			}

		} while (menu != 7);

	}

}
























