package ejemplo03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Implementacion implements metodos, metodos1 {

	List<Empleados> newEmpleados = new ArrayList<Empleados>();

	@Override
	public void guardar(Empleados empleado) {
		// TODO Auto-generated method stub
		if (newEmpleados.isEmpty()) {
			if (Arrays.asList("Ventas", "Soporte", "Programacion").contains(empleado.getDepto())) {
				// validacion de 30 y 40 anos
				if (empleado.getEdad() > 30 && empleado.getEdad() < 40) {
					newEmpleados.add(empleado);
					System.out.println("Status.ok ==success");

				} else {
					System.out.println("No cuenta con la edad para ocupar el puesto");
				}


			} else {
				System.out.printf("solo tenemos vacantes para el area de \n Ventas", "\n Soporte", "\n Programacion");
			}
		} else {
			boolean empleadoExiste = false;
			for (Empleados e : newEmpleados) {
				if (e.getNombre().equalsIgnoreCase(empleado.getNombre())
						&& e.getApp().equalsIgnoreCase(empleado.getApp())) {
					empleadoExiste = true;
					break;
				}

			}
			if (empleadoExiste == true) {
				System.out.println("El empleado ya esta registrado");
			} else {
				if (Arrays.asList("Ventas", "Soporte", "Programacion").contains(empleado.getDepto())) {
					// validar que sea de 30 a 40
					if (empleado.getEdad() > 30 && empleado.getEdad() < 40) {
						newEmpleados.add(empleado);
						System.out.println("Status.ok ==success");

					} else {
						System.out.println("No cuenta con la edad para ocupar el puesto");
					}

				}
			}
		}

	}

	@Override
	public void editar(int indice, Empleados empleado) {
		// TODO Auto-generated method stub
		if (newEmpleados.isEmpty()) {
			System.out.println("La lista esta vacia");
			return;
		}
		if (indice < 0 || indice >= newEmpleados.size()) {
			System.out.println("El indice esta fuera de rango");
			return;
		}
		for (int i = 0; i < newEmpleados.size(); i++) {
			if (i != indice && newEmpleados.get(i).getNombre().equalsIgnoreCase(empleado.getApp())) {
				System.out.print("Ya existe otro empleado con el nombre y apellido");
			}

		}
		newEmpleados.set(indice, empleado);
		System.out.println("El empleado se actualizo correctamente");

	}

	public void editarId(int indice, Empleados empleado) {
		if (newEmpleados.isEmpty()) {
			if (Arrays.asList("Ventas", "Soporte", "Programacion").contains(empleado.getDepto())) {
				if (empleado.getEdad() > 30 && empleado.getEdad() < 40) {
					newEmpleados.set(indice, empleado);
					System.out.println("Status.ok ==success");

				} else {
					System.out.print("Usted no cuenta edad para postular");
				}

			} else {
				System.out.printf("solo tenemos vacantes para el area de \n Ventas", "\n Soporte", "\n Programacion");

			}

		} else {
			boolean empleadoExiste = false;
			for (Empleados e : newEmpleados) {
				if (e.getNombre().equalsIgnoreCase(empleado.getNombre())
						&& e.getApp().equalsIgnoreCase(empleado.getApp())) {
					empleadoExiste = true;
					break;
				}

			}
			if (empleadoExiste) {
				System.out.println("El empleado ya existe");
				return;
			} else {
				Empleados emp = newEmpleados.get(indice);
				emp.setNombre(empleado.getNombre());
				emp.setApp(empleado.getApp());
				System.out.print("El empleado" + emp.nombre + " ah sido actualizado");
			}

		}
	}

	@Override
	public void eliminar(int indice, Empleados empleado) {
		// TODO Auto-generated method stub

		if (newEmpleados.isEmpty()) {
			System.out.println("no existen empleados a eliminar");
		} else {
			if (indice >= 0 && indice < newEmpleados.size()) {
				newEmpleados.remove(indice);
				System.out.println("Status ok");

			}
		}

	}

	@Override
	public Empleados buscarIndice(int id) {
		// TODO Auto-generated method stub

		return newEmpleados.get(id);
	}

	@Override
	public List<Empleados> lista() {
		// TODO Auto-generated method stub
		return newEmpleados;
	}

	@Override
	public void posicion() {
		// TODO Auto-generated method stub
		for (int i = 0; i < newEmpleados.size(); i++) {
			System.out.printf("\n[%d] " + newEmpleados.get(i).getNombre(), i);

		}

	}
	// metodos adicionales

	public void buscarNombreLamnda(String nombre) {
		newEmpleados.stream().filter(e -> e.getNombre().equalsIgnoreCase(nombre)).forEach(System.out::println);

	}

	public void buscarNombrefor(String nombre) {
		for (int i = 0; i < newEmpleados.size(); i++) {
			if (newEmpleados.get(i).getNombre().equalsIgnoreCase(nombre)) {
				System.out.print(newEmpleados.get(i));

			}

		}

	}

	// buscar nombre con interador
	public void buscarNombreIterador(String nombre) {
		var it = newEmpleados.iterator();
		while (it.hasNext()) {
			Empleados e = it.next();
			if (e.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println(e);

			}

		}
	}

	// eliminar por nombre con expression lamnda
	public void eliminarNombreLamba(String nombre) {
		newEmpleados.removeIf(e -> e.getNombre().equalsIgnoreCase(nombre));
		System.out.print("Empleados eliminados con lamnda");

	}

	public void eliminarNombreFor(String nombre) {
		for (int i = 0; i < newEmpleados.size(); i++) {
			if (newEmpleados.get(i).getNombre().equalsIgnoreCase(nombre)) {
				newEmpleados.remove(i);
				System.out.println("Empleado eliminado");

			}
		}

	}

	// eliminar nombre ocupando for each
	public void eliminarNombreForEach(String nombre) {
		for (Empleados e : new ArrayList<>(newEmpleados)) {
			if (e.getNombre().equalsIgnoreCase(nombre)) {
				newEmpleados.remove(0);
				System.out.print("Borrando el nombre");
			}
		}
	}

// eliminar por nombre con iterator
	public void eliminarNombreIterador(String nombre) {
		var it = newEmpleados.iterator();
		while (it.hasNext()) {
			Empleados e = it.next();
			if (e.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Empleado eliminado con iterator");
				break;
			}

		}

	}
	//eliminar todo
	public void eliminarTodo() {
		newEmpleados.clear();
		System.out.print("Se eliminaron todos");
	}
}
