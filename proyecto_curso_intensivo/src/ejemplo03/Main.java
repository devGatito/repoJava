package ejemplo03;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre;
        String app;
        int edad;
        String sexo;
        String depto;
        double sueldo;
        
        Scanner lec;
        int menu, submenu, indice;

        Implementacion imp = new Implementacion();
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        
        do {
            System.out.println("\nEmpresa:");
            System.out.println("\nOpciones");
            System.out.println("1. Alta de empleados con codigo DURO");
            System.out.println("2. Guardar");
            System.out.println("3. Buscar");
            System.out.println("4. Editar");
            System.out.println("5. Eliminar");
            System.out.println("6. Listar");
            System.out.println("7. Buscar Nombre --> expresión lambda");
            System.out.println("8. Buscar Nombre --> for");
            System.out.println("9. Buscar Nombre --> for each");
            System.out.println("10. Buscar Nombre --> iterador");
            System.out.println("11. Eliminar Nombre --> expresión lambda");
            System.out.println("12. Eliminar Nombre --> for");
            System.out.println("13. Eliminar Nombre --> for each");
            System.out.println("14. Eliminar Nombre --> iterador");
            System.out.println("15. Eliminar Todo");
            System.out.println("16. Salir");
            
            System.out.print("\nSeleccione una opción: ");
            lec = new Scanner(System.in);
            menu = lec.nextInt();
            
            if(menu < 1 || menu > 16) {
                System.out.println("Debes escoger una opción válida");
            } else {
                switch(menu) {
                    case 1:
                        Empleados empleado1 = new Empleados("felipe", "arriega", 35, "M", "Ventas", 3000);
                        Empleados empleado2 = new Empleados("guason", "arriega", 25, "M", "Ventas", 3000);
                        imp.guardar(empleado1);
                        imp.guardar(empleado2);
                        System.out.println("Datos guardados");
                        break;
                        
                    case 2:
                        System.out.print("Ingresa el nombre: ");
                        lec.nextLine();
                        nombre = lec.nextLine();
                        
                        System.out.print("Ingresa el apellido: ");
                        app = lec.nextLine();
                        
                        System.out.print("Ingresa la edad: ");
                        edad = lec.nextInt();
                        
                        System.out.print("Ingresa el Sexo (M/F): ");
                        lec.nextLine();
                        sexo = lec.nextLine();
                        
                        System.out.print("Ingresa el DEPARTAMENTO: ");
                        depto = lec.nextLine();
                        
                        System.out.print("Ingresa el sueldo: ");
                        sueldo = lec.nextDouble();
                        
                        Empleados empleado = new Empleados(nombre, app, edad, sexo, depto, sueldo);
                        imp.guardar(empleado);
                        break;
                        
                    case 3:
                        imp.posicion();
                        System.out.print("\nIngrese un índice a buscar: ");
                        indice = lec.nextInt();
                        Empleados emp = imp.buscarIndice(indice);
                        System.out.println("Empleado encontrado: " + emp);
                        break;
                        
                    case 4:
                        imp.posicion();
                        System.out.print("\nIngrese un índice a editar: ");
                        indice = lec.nextInt();
                        
                        Empleados empleadoActual = imp.buscarIndice(indice);
                        if(empleadoActual == null) {
                            System.out.println("Índice no válido");
                            break;
                        }
                        
                        System.out.println("\nEmpleado seleccionado: " + empleadoActual);
                        
                        do {
                            System.out.println("\nSubmenú de Edición");
                            System.out.println("1. Editar nombre");
                            System.out.println("2. Editar apellido");
                            System.out.println("3. Editar edad");
                            System.out.println("4. Editar sexo");
                            System.out.println("5. Editar departamento");
                            System.out.println("6. Editar sueldo");
                            System.out.println("7. Guardar cambios y salir");
                            System.out.println("8. Salir sin guardar");
                            
                            System.out.print("\nSeleccione atributo a editar: ");
                            submenu = lec.nextInt();
                            lec.nextLine(); // Limpiar buffer
                            
                            switch(submenu) {
                                case 1:
                                    System.out.print("Nuevo nombre: ");
                                    nombre = lec.nextLine();
                                    empleadoActual.setNombre(nombre);
                                    break;
                                    
                                case 2:
                                    System.out.print("Nuevo apellido: ");
                                    app = lec.nextLine();
                                    empleadoActual.setApp(app);
                                    break;
                                    
                                case 3:
                                    System.out.print("Nueva edad: ");
                                    edad = lec.nextInt();
                                    empleadoActual.setEdad(edad);
                                    break;
                                    
                                case 4:
                                    System.out.print("Nuevo sexo (M/F): ");
                                    sexo = lec.nextLine();
                                    empleadoActual.setSexo(sexo);
                                    break;
                                    
                                case 5:
                                    System.out.print("Nuevo departamento: ");
                                    depto = lec.nextLine();
                                    empleadoActual.setDepto(depto);
                                    break;
                                    
                                case 6:
                                    System.out.print("Nuevo sueldo: ");
                                    sueldo = lec.nextDouble();
                                    empleadoActual.setSueldo(sueldo);
                                    break;
                                    
                                case 7:
                                    imp.editar(indice, empleadoActual);
                                    System.out.println("Cambios guardados exitosamente");
                                    submenu = 8; // Salir
                                    break;
                                    
                                case 8:
                                    System.out.println("Cambios descartados");
                                    break;
                                    
                                default:
                                    System.out.println("Opción no válida");
                            }
                            
                        } while(submenu != 7 && submenu != 8);
                        break;
                        
                    case 5:
                        imp.posicion();
                        System.out.print("\nIngrese el índice a eliminar: ");
                        indice = lec.nextInt();
                        imp.eliminar(indice, null);
                        break;
                        
                    case 6:
                        System.out.println("\nLista de empleados:");
                        System.out.println(imp.lista());
                        break;
                        
                    case 7:
                        System.out.print("Ingrese el nombre a buscar (lambda): ");
                        lec.nextLine();
                        nombre = lec.nextLine();
                        imp.buscarNombreLamnda(nombre);
                        break;
                        
                    case 8:
                        System.out.print("Ingrese el nombre a buscar (for): ");
                        lec.nextLine();
                        nombre = lec.nextLine();
                        imp.buscarNombrefor(nombre);
                        break;
                        
                    case 9:
                        System.out.print("Ingrese el nombre a buscar (for each): ");
                        lec.nextLine();
                        nombre = lec.nextLine();
                        // Implementar método correspondiente
                        break;
                        
                    case 10:
                        System.out.print("Ingrese el nombre a buscar (iterador): ");
                        lec.nextLine();
                        nombre = lec.nextLine();
                        imp.buscarNombreIterador(nombre);
                        break;
                        
                    case 11:
                        System.out.print("Ingrese el nombre a eliminar (lambda): ");
                        lec.nextLine();
                        nombre = lec.nextLine();
                        imp.eliminarNombreLamba(nombre);
                        break;
                        
                    case 12:
                        System.out.print("Ingrese el nombre a eliminar (for): ");
                        lec.nextLine();
                        nombre = lec.nextLine();
                        imp.eliminarNombreFor(nombre);
                        break;
                        
                    case 13:
                        System.out.print("Ingrese el nombre a eliminar (for each): ");
                        lec.nextLine();
                        nombre = lec.nextLine();
                        imp.eliminarNombreForEach(nombre);
                        break;
                        
                    case 14:
                        System.out.print("Ingrese el nombre a eliminar (iterador): ");
                        lec.nextLine();
                        nombre = lec.nextLine();
                        imp.eliminarNombreIterador(nombre);
                        break;
                        
                    case 15:
                        imp.eliminarTodo();
                        System.out.println("Todos los empleados han sido eliminados");
                        break;
                        
                    case 16:
                        System.out.println("Saliendo del sistema...");
                        break;
                }
            }
        } while(menu != 16);
        
    }
}