package libros;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner lec = new Scanner(System.in);

		Empleados e = null;
		Libros l = null;
		int menu, menuC, menuP, id;

		String nombre;
		String app;
		LocalDateTime fechaNacimiento;

		int edad;
		String sexo;
		String correo;
		int telefono;

		Implementacion imp = new Implementacion();

		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		do {
			System.out.print("\n MENU PRINCIPAL");
			System.out.print("\n1.-Empleados");
			System.out.print("\n2.-Libros");
			System.out.print("\n3.-Salir");
			System.out.print("\nSeleccione una opción: ");

			menu = lec.nextInt();
			lec.nextLine(); // Limpiar buffer

			if (menu < 1 || menu > 3) {
				System.out.print("\033[34m SELECCIONA UNA OPCION VALIDA \033[0m");
			} else {
				switch (menu) {
				case 1:
					do {
						System.out.print("\nMENU EMPLEADOS");
						System.out.print("\n1.-Alta rápida");
						System.out.print("\n2.-Guardar nuevo empleado");
						System.out.print("\n3.-Buscar empleado");
						System.out.print("\n4.-Editar empleado");
						System.out.print("\n5.-Eliminar empleado");
						System.out.print("\n6.-Listar todos los empleados");
						System.out.print("\n7.-Regresar al menú principal");
						System.out.print("\nSeleccione una opción: ");

						menuC = lec.nextInt();
						lec.nextLine();

						switch (menuC) {
						case 1:

							System.out.print("\nAlta rápida de empleado");
							Empleados empleadoRapido = new Empleados("Juan", "Pérez", LocalDateTime.now(), 30,
									"Masculino", "juan@email.com", 5551234);
							
							Empleados empleadoRapido1 = new Empleados("Juan", "Pérez", LocalDateTime.now(), 30,
									"Masculino", "juan@email.com", 5551234);
							
							imp.guardar(empleadoRapido, "empleado");
							imp.guardar(empleadoRapido1, "empleado");
							break;

						case 2:
							System.out.print("\nNuevo Empleado");

							System.out.print("\nNombre: ");
							nombre = lec.nextLine();

							System.out.print("Apellido: ");
							app = lec.nextLine();

							System.out.print("Fecha nacimiento (yyyy-MM-dd): ");
							String fechaStr = lec.nextLine();
							LocalDate fecha = LocalDate.parse(fechaStr, formatoFecha);
							fechaNacimiento = fecha.atStartOfDay();

							System.out.print("Edad: ");
							edad = lec.nextInt();
							lec.nextLine();

							System.out.print("Sexo: ");
							sexo = lec.nextLine();

							System.out.print("Correo: ");
							correo = lec.nextLine();

							System.out.print("Teléfono: ");
							telefono = lec.nextInt();
							lec.nextLine();

							Empleados nuevoEmpleado = new Empleados(nombre, app, fechaNacimiento, edad, sexo, correo,
									telefono);
							imp.guardar(nuevoEmpleado, "empleado");
							System.out.print("\nEmpleado guardado exitosamente");
							break;

						case 3:
							System.out.print("\nBuscar empleado por posición: ");
							int posicion = lec.nextInt();
							e = (Empleados) imp.buscar(posicion, "empleado");
							if (e != null) {
								System.out.print("\nEmpleado encontrado:");
								System.out.print(e);
							} else {
								System.out.print("\nNo se encontró el empleado en esa posición");
							}
							break;

						case 4:
							System.out.print("\nEditar empleado");
							System.out.print("\nIngrese la posición del empleado a editar: ");
							posicion = lec.nextInt();
							lec.nextLine();

							System.out.print("\nNuevos datos del empleado");

							System.out.print("\nNombre: ");
							nombre = lec.nextLine();

							System.out.print("Apellido: ");
							app = lec.nextLine();

							System.out.print("Fecha nacimiento (yyyy-MM-dd): ");
							fechaStr = lec.nextLine();
							fecha = LocalDate.parse(fechaStr, formatoFecha);
							fechaNacimiento = fecha.atStartOfDay();

							System.out.print("Edad: ");
							edad = lec.nextInt();
							lec.nextLine();

							System.out.print("Sexo: ");
							sexo = lec.nextLine();

							System.out.print("Correo: ");
							correo = lec.nextLine();

							System.out.print("Teléfono: ");
							telefono = lec.nextInt();
							lec.nextLine();

							Empleados empleadoEditado = new Empleados(nombre, app, fechaNacimiento, edad, sexo, correo,
									telefono);
							imp.editar(posicion, empleadoEditado, "empleado");
							System.out.print("\nEmpleado editado exitosamente");
							break;

						case 5:
							System.out.print("\nEliminar empleado");
							System.out.print("\nIngrese la posición del empleado a eliminar: ");
							posicion = lec.nextInt();
							imp.eliminar(posicion, e, "empleado");
							System.out.print("\nEmpleado eliminado exitosamente");
							break;

						case 6:

							System.out.print("\nListado de todos los empleados");
							imp.listar("empleado");

							break;

						case 7:
							System.out.print("\nRegresando al menú principal");
							break;

						default:
							System.out.print("\nOpción no válida");
						}
					} while (menuC != 7);
					break;

				case 2:
					do {
						System.out.print("\nMENU LIBROS");
						System.out.print("\n1.-Alta rápida");
						System.out.print("\n2.-Guardar nuevo libro");
						System.out.print("\n3.-Buscar libro");
						System.out.print("\n4.-Editar libro");
						System.out.print("\n5.-Eliminar libro");
						System.out.print("\n6.-Listar todos los libros");
						System.out.print("\n7.-Regresar al menú principal");
						System.out.print("\nSeleccione una opción: ");

						menuP = lec.nextInt();
						lec.nextLine(); // Limpiar buffer

						switch (menuP) {
						case 1:
							System.out.print("\nAlta rápida de libro");
							Libros libroRapido = new Libros("El principito", "Antoine de Saint-Exupéry", 96, "Amarillo",
									12, "Literatura infantil");
							imp.guardar(libroRapido, "libros");
							System.out.print("\nLibro guardado exitosamente");
							break;

						case 2:
							System.out.print("\nNuevo Libro");

							System.out.print("\nNombre del libro: ");
							String nombreLibro = lec.nextLine();

							System.out.print("Autor: ");
							String autor = lec.nextLine();

							System.out.print("Número de páginas: ");
							int paginas = lec.nextInt();
							lec.nextLine();

							System.out.print("Color: ");
							String color = lec.nextLine();

							System.out.print("Fecha publicación (yyyy-MM-dd): ");
							String fechaStr = lec.nextLine();
							LocalDate fecha = LocalDate.parse(fechaStr, formatoFecha);
							LocalDateTime fechaPub = fecha.atStartOfDay();

							System.out.print("Categoría: ");
							String categoria = lec.nextLine();

							Libros nuevoLibro = new Libros(nombreLibro, autor, paginas, color, 12, categoria);
							imp.guardar(nuevoLibro, "libros");
							System.out.print("\nLibro guardado exitosamente");
							break;

						case 3:
							System.out.print("\nBuscar libro por posición: ");
							int posicion = lec.nextInt();
							l = (Libros) imp.buscar(posicion, "libros");
							if (l != null) {
								System.out.print("\nLibro encontrado:");
								System.out.print(l);
							} else {
								System.out.print("\nNo se encontró el libro en esa posición");
							}
							break;

						case 4:
							System.out.print("\nEditar libro");
							System.out.print("\nIngrese la posición del libro a editar: ");
							posicion = lec.nextInt();
							lec.nextLine();

							System.out.print("\nNuevos datos del libro");

							System.out.print("\nNombre del libro: ");
							nombreLibro = lec.nextLine();

							System.out.print("Autor: ");
							autor = lec.nextLine();

							System.out.print("Número de páginas: ");
							paginas = lec.nextInt();
							lec.nextLine();

							System.out.print("Color: ");
							color = lec.nextLine();

							System.out.print("Fecha publicación (yyyy-MM-dd): ");
							fechaStr = lec.nextLine();
							fecha = LocalDate.parse(fechaStr, formatoFecha);
							fechaPub = fecha.atStartOfDay();

							System.out.print("Categoría: ");
							categoria = lec.nextLine();

							Libros libroEditado = new Libros(nombreLibro, autor, paginas, color, 12, categoria);
							imp.editar(posicion, libroEditado, "libros");
							System.out.print("\nLibro editado exitosamente");
							break;

						case 5:
							System.out.print("\nEliminar libro");
							System.out.print("\nIngrese la posición del libro a eliminar: ");
							posicion = lec.nextInt();
							imp.eliminar(posicion, l, "libros");
							System.out.print("\nLibro eliminado exitosamente");
							break;

						case 6:
							System.out.print("\nListado de todos los libros");
							imp.listar("libros");
							break;

						case 7:
							System.out.print("\nRegresando al menú principal");
							break;

						default:
							System.out.print("\nOpción no válida");
						}
					} while (menuP != 7);
					break;

				case 3:
					System.out.print("\nSaliendo del programa...");
					break;
				}
			}
		} while (menu != 3);
		lec.close();
	}
}
