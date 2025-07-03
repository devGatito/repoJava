package ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class incrementacion implements metodos {

    List<Vuelos> listaVuelos = new ArrayList<Vuelos>();

    @Override
    public void guardar(Vuelos vuelo) {
        if (vuelo == null) {
            System.out.println("Error: No se puede guardar un vuelo nulo");
            return;
        }
        
        if (listaVuelos.contains(vuelo)) {
            System.out.println("El vuelo con código " + vuelo.getCodigo() + " ya existe");
        } else {
            listaVuelos.add(vuelo);
            System.out.println("Vuelo guardado exitosamente");
        }
    }

    @Override
    public void eliminar(Vuelos vuelo) {
        if (listaVuelos.isEmpty()) {
            System.out.println("No existen vuelos a eliminar");
            return;
        }
        
        if (vuelo == null) {
            System.out.println("Error: No se puede eliminar un vuelo nulo");
            return;
        }
        
        if (listaVuelos.remove(vuelo)) {
            System.out.println("Vuelo eliminado exitosamente");
        } else {
            System.out.println("El vuelo no existe en la lista");
        }
    }

    @Override
    public void editar(Vuelos vuelo) {
        if (vuelo == null) {
            System.out.println("Error: No se puede editar un vuelo nulo");
            return;
        }
        
        for (int i = 0; i < listaVuelos.size(); i++) {
            if (listaVuelos.get(i).getCodigo() == vuelo.getCodigo()) {
                listaVuelos.set(i, vuelo);
                System.out.println("Vuelo editado exitosamente");
                return;
            }
        }
        System.out.println("No se encontró el vuelo con código " + vuelo.getCodigo());
    }

    @Override
    public Vuelos buscarVuelo(int codigo) {
        for (Vuelos v : listaVuelos) {
            if (v.getCodigo() == codigo) {
                return v;
            }
        }
        System.out.println("No se encontró el vuelo con código " + codigo);
        return null;
    }

    @Override
    public List<Object> listar() {
        if (listaVuelos.isEmpty()) {
            System.out.println("No hay vuelos registrados");
            return new ArrayList<Object>();
        }
        
        List<Object> resultado = new ArrayList<Object>();
        resultado.addAll(listaVuelos);
        return resultado;
    }
    
    
    public List<Vuelos> buscarPorDestino(String destino) {
        List<Vuelos> resultados = new ArrayList<>();
        for (Vuelos v : listaVuelos) {
            if (v.getDestino().equalsIgnoreCase(destino)) {
                resultados.add(v);
            }
        }
        return resultados;
    }
    
    public List<Vuelos> buscarPorTipoVuelo(String tipoVuelo) {
        List<Vuelos> resultados = new ArrayList<>();
        for (Vuelos v : listaVuelos) {
            if (v.getTipoVuelo().equalsIgnoreCase(tipoVuelo)) {
                resultados.add(v);
            }
        }
        return resultados;
    }
    
    public double calcularGananciasTotales() {
        double total = 0;
        for (Vuelos v : listaVuelos) {
            total += v.getGanancias();
        }
        return total;
    }
}