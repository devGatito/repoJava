package ejercicio6;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int codigo;
        String nombreCliente;
        String app;
        LocalDateTime fechaNacimiento;
        int edad;
        String tipoVuelo;
        LocalDateTime fechaLlegada;
        String destino;
        int horaVuelo;
        double precio;
        double ganancias;

        int menu;
        Scanner lec = new Scanner(System.in);

        // Creación de vuelos de ejemplo
        LocalDateTime ahora = LocalDateTime.now();
        Vuelos v1 = new Vuelos(1, "Juan", "Pérez", ahora.minusYears(30), 30, 
                              "Nacional", ahora.plusDays(1), "Cancún", 2, 5000, 4000);
        Vuelos v2 = new Vuelos(2, "María", "Gómez", ahora.minusYears(25), 25, 
                              "Internacional", ahora.plusDays(2), "Madrid", 8, 15000, 12000);
        Vuelos v3 = new Vuelos(3, "Carlos", "López", ahora.minusYears(40), 40, 
                              "Nacional", ahora.plusDays(3), "Guadalajara", 1, 3000, 2500);

        incrementacion imp = new incrementacion();
        
        do {
            System.out.println("\n=== MENU GESTIÓN DE VUELOS ===");
            System.out.println("1.- Alta de vuelos de ejemplo");
            System.out.println("2.- Registrar nuevo vuelo");
            System.out.println("3.- Buscar vuelo por código");
            System.out.println("4.- Editar vuelo");
            System.out.println("5.- Eliminar vuelo");
            System.out.println("6.- Listar todos los vuelos");
            System.out.println("7.- Buscar vuelos por destino");
            System.out.println("8.- Buscar vuelos por tipo");
            System.out.println("9.- Calcular ganancias totales");
            System.out.println("10.- Salir");
            System.out.print("Seleccione una opción: ");
            
            menu = lec.nextInt();
            lec.nextLine(); // Limpiar buffer
            
            if(menu < 1 || menu > 10) {
                System.out.println("Por favor elija una opción válida (1-10)");
            } else {
                switch(menu) {
                    case 1:
                        imp.guardar(v1);
                        imp.guardar(v2);
                        imp.guardar(v3);
                        System.out.println("Vuelos de ejemplo registrados con éxito");
                        break;
                        
                    case 2:
                        System.out.println("\n--- REGISTRAR NUEVO VUELO ---");
                        System.out.print("Código del vuelo: ");
                        codigo = lec.nextInt();
                        lec.nextLine();
                        
                        System.out.print("Nombre del cliente: ");
                        nombreCliente = lec.nextLine();
                        
                        System.out.print("Apellido del cliente: ");
                        app = lec.nextLine();
                        
                        fechaNacimiento = leerFecha(lec, "Fecha de nacimiento (yyyy-MM-dd HH:mm): ");
                        
                        System.out.print("Edad: ");
                        edad = lec.nextInt();
                        lec.nextLine();
                        
                        System.out.print("Tipo de vuelo (Nacional/Internacional): ");
                        tipoVuelo = lec.nextLine();
                        
                        fechaLlegada = leerFecha(lec, "Fecha de llegada (yyyy-MM-dd HH:mm): ");
                        
                        System.out.print("Destino: ");
                        destino = lec.nextLine();
                        
                        System.out.print("Duración del vuelo (horas): ");
                        horaVuelo = lec.nextInt();
                        
                        System.out.print("Precio: ");
                        precio = lec.nextDouble();
                        
                        System.out.print("Ganancias: ");
                        ganancias = lec.nextDouble();
                        
                        Vuelos nuevoVuelo = new Vuelos(codigo, nombreCliente, app, fechaNacimiento, edad,
                                                      tipoVuelo, fechaLlegada, destino, horaVuelo, precio, ganancias);
                        imp.guardar(nuevoVuelo);
                        System.out.println("Vuelo registrado con éxito");
                        break;
                        
                    case 3:
                        System.out.println("\n--- BUSCAR VUELO POR CÓDIGO ---");
                        System.out.print("Ingrese el código del vuelo: ");
                        codigo = lec.nextInt();
                        lec.nextLine();
                        
                        Vuelos encontrado = imp.buscarVuelo(codigo);
                        System.out.println(encontrado != null ? encontrado : "Vuelo no encontrado");
                        break;
                        
                    case 4:
                        System.out.println("\n--- EDITAR VUELO ---");
                        System.out.print("Ingrese el código del vuelo a editar: ");
                        codigo = lec.nextInt();
                        lec.nextLine();
                        
                        Vuelos vueloEditar = imp.buscarVuelo(codigo);
                        if(vueloEditar == null) {
                            System.out.println("Vuelo no encontrado");
                        } else {
                            System.out.println("Datos actuales del vuelo:");
                            System.out.println(vueloEditar);
                            
                            System.out.println("\nIngrese los nuevos datos:");
                            
                            System.out.print("Nombre del cliente (" + vueloEditar.getNombreCliente() + "): ");
                            nombreCliente = lec.nextLine();
                            if(!nombreCliente.isEmpty()) vueloEditar.setNombreCliente(nombreCliente);
                            
                            System.out.print("Apellido del cliente (" + vueloEditar.getApp() + "): ");
                            app = lec.nextLine();
                            if(!app.isEmpty()) vueloEditar.setApp(app);
                            
                            System.out.print("Edad (" + vueloEditar.getEdad() + "): ");
                            String edadStr = lec.nextLine();
                            if(!edadStr.isEmpty()) vueloEditar.setEdad(Integer.parseInt(edadStr));
                            
                            System.out.print("Tipo de vuelo (" + vueloEditar.getTipoVuelo() + "): ");
                            tipoVuelo = lec.nextLine();
                            if(!tipoVuelo.isEmpty()) vueloEditar.setTipoVuelo(tipoVuelo);
                            
                            System.out.print("Destino (" + vueloEditar.getDestino() + "): ");
                            destino = lec.nextLine();
                            if(!destino.isEmpty()) vueloEditar.setDestino(destino);
                            
                            System.out.print("Duración del vuelo (" + vueloEditar.getHoraVuelo() + "): ");
                            String horaStr = lec.nextLine();
                            if(!horaStr.isEmpty()) vueloEditar.setHoraVuelo(Integer.parseInt(horaStr));
                            
                            System.out.print("Precio (" + vueloEditar.getPrecio() + "): ");
                            String precioStr = lec.nextLine();
                            if(!precioStr.isEmpty()) vueloEditar.setPrecio(Double.parseDouble(precioStr));
                            
                            System.out.print("Ganancias (" + vueloEditar.getGanancias() + "): ");
                            String gananciasStr = lec.nextLine();
                            if(!gananciasStr.isEmpty()) vueloEditar.setGanancias(Double.parseDouble(gananciasStr));
                            
                            imp.editar(vueloEditar);
                            System.out.println("Vuelo actualizado con éxito");
                        }
                        break;
                        
                    case 5:
                        System.out.println("\n--- ELIMINAR VUELO ---");
                        System.out.print("Ingrese el código del vuelo a eliminar: ");
                        codigo = lec.nextInt();
                        lec.nextLine();
                        
                        Vuelos vueloEliminar = imp.buscarVuelo(codigo);
                        if(vueloEliminar == null) {
                            System.out.println("Vuelo no encontrado");
                        } else {
                            imp.eliminar(vueloEliminar);
                            System.out.println("Vuelo eliminado con éxito");
                        }
                        break;
                        
                    case 6:
                        System.out.println("\n--- LISTADO DE VUELOS ---");
                        List<Object> vuelos = imp.listar();
                        if(vuelos.isEmpty()) {
                            System.out.println("No hay vuelos registrados");
                        } else {
                            for(Object v : vuelos) {
                                System.out.println(v);
                            }
                        }
                        break;
                        
                    case 7:
                        System.out.println("\n--- BUSCAR POR DESTINO ---");
                        System.out.print("Ingrese el destino a buscar: ");
                        destino = lec.nextLine();
                        
                        List<Vuelos> porDestino = imp.buscarPorDestino(destino);
                        if(porDestino.isEmpty()) {
                            System.out.println("No se encontraron vuelos con ese destino");
                        } else {
                            System.out.println("Vuelos encontrados:");
                            for(Vuelos v : porDestino) {
                                System.out.println(v);
                            }
                        }
                        break;
                        
                    case 8:
                        System.out.println("\n--- BUSCAR POR TIPO DE VUELO ---");
                        System.out.print("Ingrese el tipo de vuelo a buscar (Nacional/Internacional): ");
                        tipoVuelo = lec.nextLine();
                        
                        List<Vuelos> porTipo = imp.buscarPorTipoVuelo(tipoVuelo);
                        if(porTipo.isEmpty()) {
                            System.out.println("No se encontraron vuelos de ese tipo");
                        } else {
                            System.out.println("Vuelos encontrados:");
                            for(Vuelos v : porTipo) {
                                System.out.println(v);
                            }
                        }
                        break;
                        
                    case 9:
                        System.out.println("\n--- GANANCIAS TOTALES ---");
                        double total = imp.calcularGananciasTotales();
                        System.out.printf("Las ganancias totales son: $%.2f\n", total);
                        break;
                        
                    case 10:
                        System.out.println("Saliendo del sistema...");
                        break;
                }
            }
        } while(menu != 10);
        
        lec.close();
    }
    
    private static LocalDateTime leerFecha(Scanner lec, String mensaje) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        while(true) {
            try {
                System.out.print(mensaje);
                String fechaStr = lec.nextLine();
                return LocalDateTime.parse(fechaStr, formatter);
            } catch(Exception e) {
                System.out.println("Formato de fecha incorrecto. Use yyyy-MM-dd HH:mm");
            }
        }
    }

}