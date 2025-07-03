package ejercicio3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre;
        String marca;
        int numCilindros;
        String modelo;
        String tipo;
        double precio;

        int menu, submenu, indice;
        Scanner lec = new Scanner(System.in);

        Implementacion imp = new Implementacion();

        do {
            System.out.println("\nConcesionario de Motos");
            System.out.println("Opciones:");
            System.out.println("1.- Alta de motos con datos de ejemplo");
            System.out.println("2.- Guardar nueva moto");
            System.out.println("3.- Buscar por índice");
            System.out.println("4.- Editar moto");
            System.out.println("5.- Eliminar por índice");
            System.out.println("6.- Listar todas las motos");
            System.out.println("7.- Buscar por nombre (lambda)");
            System.out.println("8.- Buscar por nombre (for)");
            System.out.println("9.- Buscar por nombre (forEach)");
            System.out.println("10.- Buscar por nombre (iterador)");
            System.out.println("11.- Eliminar por nombre (lambda)");
            System.out.println("12.- Eliminar por nombre (for)");
            System.out.println("13.- Eliminar por nombre (forEach)");
            System.out.println("14.- Eliminar por nombre (iterador)");
            System.out.println("15.- Eliminar todo");
            System.out.println("16.- Salir");
            
            System.out.print("\nSeleccione una opción: ");
            menu = lec.nextInt();
            
            if(menu < 1 || menu > 16) {
                System.out.println("Opción no válida. Seleccione entre 1 y 16");
                continue;
            }
            
            switch(menu) {
                case 1:
                    // Dar de alta
                    Moto moto1 = new Moto("Ninja", "Kawasaki", 4, "ZX-10R", "deportiva", 15000);
                    Moto moto2 = new Moto("Africa Twin", "Honda", 2, "CRF1100L", "montaña", 14000);
                    imp.guardar(moto1);
                    imp.guardar(moto2);
                    System.out.println("Motos  agregadas");
                    break;
                    
                case 2:
                    System.out.print("Nombre: ");
                    lec.nextLine();
                    nombre = lec.nextLine();
                    
                    System.out.print("Marca: ");
                    marca = lec.nextLine();
                    
                    System.out.print("Número de cilindros: ");
                    numCilindros = lec.nextInt();
                    
                    System.out.print("Modelo: ");
                    lec.nextLine();
                    modelo = lec.nextLine();
                    
                    System.out.print("Tipo (deportiva/montaña/choper/ciudad/cargo): ");
                    tipo = lec.nextLine();
                    
                    System.out.print("Precio: ");
                    precio = lec.nextDouble();
                    
                    Moto nuevaMoto = new Moto(nombre, marca, numCilindros, modelo, tipo, precio);
                    imp.guardar(nuevaMoto);
                    break;
                    
                case 3:
                    imp.mostrarPosicion();
                    System.out.print("Índice a buscar: ");
                    indice = lec.nextInt();
                    imp.buscar(indice, null);
                    break;
                    
                case 4:
                    imp.mostrarPosicion();
                    System.out.print("Índice a editar: ");
                    indice = lec.nextInt();
                    
                    System.out.print("Nuevo nombre: ");
                    lec.nextLine();
                    nombre = lec.nextLine();
                    
                    System.out.print("Nueva marca: ");
                    marca = lec.nextLine();
                    
                    System.out.print("Nuevo número de cilindros: ");
                    numCilindros = lec.nextInt();
                    
                    System.out.print("Nuevo modelo: ");
                    lec.nextLine();
                    modelo = lec.nextLine();
                    
                    System.out.print("Nuevo tipo: ");
                    tipo = lec.nextLine();
                    
                    System.out.print("Nuevo precio: ");
                    precio = lec.nextDouble();
                    
                    Moto motoEditada = new Moto(nombre, marca, numCilindros, modelo, tipo, precio);
                    imp.editar(indice, motoEditada);
                    break;
                    
                case 5:
                    imp.mostrarPosicion();
                    System.out.print("Índice a eliminar: ");
                    indice = lec.nextInt();
                    imp.eliminar(indice);
                    break;
                    
                case 6:
                    System.out.println("Lista de motos:");
                    imp.lista().forEach(System.out::println);
                    break;
                    
                case 7:
                    System.out.print("Nombre a buscar (lambda): ");
                    lec.nextLine();
                    nombre = lec.nextLine();
                    imp.buscarNombreLambda(nombre);
                    break;
                    
                case 8:
                    System.out.print("Nombre a buscar (for): ");
                    lec.nextLine();
                    nombre = lec.nextLine();
                    imp.buscarNombreFor(nombre);
                    break;
                    
                case 12:
                	System.out.print("Nombre a eliminar");
                	lec.nextLine();
                	nombre = lec.nextLine();
                	imp.eliminarNombreLambda(nombre);
                	break;
                case 15:
                    imp.eliminarTodo();
                    System.out.println("Todas las motos han sido eliminadas");
                    break;
                    
                case 16:
                    System.out.println("Saliendo del sistema...");
                    break;
                    
                default:
                    System.out.println("Opción no implementada aún");
            }
            
        } while(menu != 16);
        
    }
}