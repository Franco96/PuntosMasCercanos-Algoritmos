package test;

import java.util.ArrayList;

import utilidades.Par;
import utilidades.Punto;
import algoritmos.*;

public class Test6 {

	
	public static void main(String[] args) {
		
		
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		
		
		listaPuntos.add(new Punto(10, 1111));
		listaPuntos.add(new Punto(73450, 53556650));
		listaPuntos.add(new Punto(72120, 5660));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2, 2));
		listaPuntos.add(new Punto(800, 900));
		listaPuntos.add(new Punto(4, 100));
		listaPuntos.add(new Punto(987, 988));
		listaPuntos.add(new Punto(8787, 78787));
		listaPuntos.add(new Punto(70000, 121221));
		listaPuntos.add(new Punto(33333, 33333));
		listaPuntos.add(new Punto(1.6, 1.5));
		listaPuntos.add(new Punto(1.5, 1.8));
		
		Par solucion = DyC_ConYOrdenado.cascaraDyC(listaPuntos);
		
		System.out.println(solucion.getP1().toString()+"-"+solucion.getP2());
				
	}
	
}
