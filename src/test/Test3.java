package test;

import java.util.ArrayList;

import algoritmos.DyC_SinYOrdenado;
import utilidades.Par;
import utilidades.Punto;

public class Test3 {

	
	public static void main(String[] args) {
		
		
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		
		listaPuntos.add(new Punto(1, 200));
		listaPuntos.add(new Punto(2, 300));
		listaPuntos.add(new Punto(3, 3));
		listaPuntos.add(new Punto(3.5, 3.5));
		listaPuntos.add(new Punto(4, 0));
		listaPuntos.add(new Punto(5, 3));
		listaPuntos.add(new Punto(64, 30));
		
		Par par = DyC_SinYOrdenado.DyC_PuntosCercanos(listaPuntos);
		
		
		System.out.println(par.getP1().toString()+" "+par.getP2().toString());
	}
	
}
