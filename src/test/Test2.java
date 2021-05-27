package test;

import java.util.ArrayList;

import algoritmos.*;
import utilidades.*;

public class Test2 {

	
	public static void main(String[] args) {
		
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		
		
		double dist = DyC_SinYOrdenado.masCercanoEnFranja(listaPuntos, listaPuntos.size(), 1.5);
	
	System.out.print(dist);
	
	}
	
}
