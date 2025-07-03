package com.mx.controller;

import com.mx.dominio.Electronica;
import com.mx.dominio.Farmacia;
import com.mx.dominio.Jugueteria;
import com.mx.dominio.Ropa;
import com.mx.servicio.Implementacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Implementacion imp = new Implementacion();
		
		Electronica e1 = new Electronica(1,"","",454343L,"","","",250);
		  Farmacia f1 = new Farmacia(2, "Guadalajara", "Toluca", 554000L, "Paracetamol", "Genérico", "500mg", 30);
	        Ropa r1 = new Ropa(3, "C&A", "Centro", 552000L, "Nike", "Deportivo", "Negro", 799.90);
	        Jugueteria j1 = new Jugueteria(4, "Juguetron", "Perisur", 553000L, "HotWheels", "Mattel", 4, 200);
	        
	        imp.guardar(e1, "electronica");
	        imp.guardar(f1, "farmacia");
	        imp.guardar(r1, "ropa");
	        imp.guardar(j1, "jugueteria");

	}

}
