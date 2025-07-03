package ejercicio3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Implementacion implements metodo {

    List<Moto> listaMotos = new ArrayList<>();
    private static final List<String> TIPOS_VALIDOS = Arrays.asList("deportiva", "montaña", "choper", "ciudad", "cargo");

    @Override
    public void guardar(Moto moto) {
        if (!TIPOS_VALIDOS.contains(moto.getTipo())) {
            System.out.println("Tipos válidos: deportiva, montaña, choper, ciudad, cargo");
            return;
        }
        
        if (existeMoto(moto)) {
            System.out.println("La moto ya está registrada");
            return;
        }
        
        listaMotos.add(moto);
        System.out.println("Moto guardada exitosamente");
    }

    private boolean existeMoto(Moto moto) {
        return listaMotos.stream().anyMatch(m -> 
            m.getNombre().equalsIgnoreCase(moto.getNombre()) && 
            m.getModelo().equalsIgnoreCase(moto.getModelo()));
    }

    @Override
    public void eliminar(int indice) {
        if (indice < 0 || indice >= listaMotos.size()) {
            System.out.println("Índice no válido");
            return;
        }
        Moto eliminada = listaMotos.remove(indice);
        System.out.println("Moto eliminada: " + eliminada.getNombre());
    }

    @Override
    public void editar(int indice, Moto moto) {
        if (indice < 0 || indice >= listaMotos.size()) {
            System.out.println("Índice no válido");
            return;
        }
        
        if (!TIPOS_VALIDOS.contains(moto.getTipo())) {
            System.out.println("Tipo de moto no válido");
            return;
        }
        
        listaMotos.set(indice, moto);
        System.out.println("Moto actualizada correctamente");
    }

    @Override
    public void buscar(int indice, Moto moto) {
        if (indice < 0 || indice >= listaMotos.size()) {
            System.out.println("Índice no válido");
            return;
        }
        System.out.println("Moto encontrada: " + listaMotos.get(indice));
    }

    @Override
    public List<Moto> lista() {
        return new ArrayList<>(listaMotos);
    }

    @Override
    public void mostrarPosicion() {
        if (listaMotos.isEmpty()) {
            System.out.println("No hay motos registradas");
            return;
        }
        
        for (int i = 0; i < listaMotos.size(); i++) {
            System.out.println("[" + i + "] " + listaMotos.get(i).getNombre());
        }
    }
    
    // Métodos adicionales para búsqueda y eliminación
    
    public void buscarNombreLambda(String nombre) {
        listaMotos.stream()
            .filter(m -> m.getNombre().equalsIgnoreCase(nombre))
            .forEach(System.out::println);
    }
    
    public void buscarNombreFor(String nombre) {
        for (Moto m : listaMotos) {
            if (m.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(m);
            }
        }
    }
    
    public void eliminarNombreLambda(String nombre) {
        listaMotos.removeIf(m -> m.getNombre().equalsIgnoreCase(nombre));
        System.out.println("Motos eliminadas con éxito");
    }
    
    public void eliminarTodo() {
        listaMotos.clear();
        System.out.println("Todas las motos han sido eliminadas");
    }
}