package test;

import java.util.ArrayList;

import algoritmos.DyC_ConYOrdenado;
import algoritmos.DyC_SinYOrdenado;
import utilidades.Par;
import utilidades.Punto;

public class Test3 {

	
	public static void main(String[] args) {
		
		
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(2, 777));
		listaPuntos.add(new Punto(4, 0));
		listaPuntos.add(new Punto(6, 1));
		
		
		
		
		Par soluicion = DyC_ConYOrdenado.cascaraDyC(listaPuntos);
		
		System.out.println(soluicion.getP1().toString()+"-"+soluicion.getP2().toString());
		
	}
	
}
