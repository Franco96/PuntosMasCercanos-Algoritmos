package test;

import java.util.ArrayList;

import algoritmos.DyC_ConYOrdenado;
import algoritmos.DyC_SinYOrdenado;
import algoritmos.Simple;
import utilidades.Par;
import utilidades.Punto;

public class Test3 {

	
	public static void main(String[] args) {
		
		
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		
		
		listaPuntos.add(new Punto(1, 10));
		listaPuntos.add(new Punto(1, 60));
		
		listaPuntos.add(new Punto(1, 14444));
		listaPuntos.add(new Punto(1, 99990));
		listaPuntos.add(new Punto(1, 10000));
		
		listaPuntos.add(new Punto(1, 3434));
		listaPuntos.add(new Punto(1, 10));
		listaPuntos.add(new Punto(1, 60));
		
		listaPuntos.add(new Punto(1, 14444));
		listaPuntos.add(new Punto(1, 99990));
		listaPuntos.add(new Punto(1, 10000));
		
		listaPuntos.add(new Punto(1, 3434));
		listaPuntos.add(new Punto(1, 10));
		listaPuntos.add(new Punto(1, 60));
		
		listaPuntos.add(new Punto(1, 14444));
		listaPuntos.add(new Punto(1, 99990));
		listaPuntos.add(new Punto(1, 10000));
		
		listaPuntos.add(new Punto(1, 3434));
		listaPuntos.add(new Punto(1, 10));
		listaPuntos.add(new Punto(1, 60));
		
		listaPuntos.add(new Punto(1, 14444));
		listaPuntos.add(new Punto(1, 99990));
		listaPuntos.add(new Punto(1, 10000));
		
		listaPuntos.add(new Punto(1, 3434));
		listaPuntos.add(new Punto(1, 10));
		listaPuntos.add(new Punto(1, 60));
		
		listaPuntos.add(new Punto(1, 14444));
		listaPuntos.add(new Punto(1, 99990));
		listaPuntos.add(new Punto(1, 10000));
		
		listaPuntos.add(new Punto(1, 3434));
		listaPuntos.add(new Punto(1, 10));
		listaPuntos.add(new Punto(1, 60));
		
		listaPuntos.add(new Punto(1, 14444));
		listaPuntos.add(new Punto(1, 99990));
		listaPuntos.add(new Punto(1, 10000));
		
		listaPuntos.add(new Punto(1, 3434));
		listaPuntos.add(new Punto(1, 10));
		listaPuntos.add(new Punto(1, 60));
		
		listaPuntos.add(new Punto(1, 14444));
		listaPuntos.add(new Punto(1, 99990));
		listaPuntos.add(new Punto(1, 10000));
		
		listaPuntos.add(new Punto(1, 3434));
		listaPuntos.add(new Punto(1, 10));
		listaPuntos.add(new Punto(1, 60));
		
		listaPuntos.add(new Punto(1, 14444));
		listaPuntos.add(new Punto(1, 99990));
		listaPuntos.add(new Punto(1, 10000));
		
		listaPuntos.add(new Punto(1, 3434));
	
		
		
		Par soluicion = DyC_ConYOrdenado.cascaraDyC(listaPuntos);
		
		System.out.println(soluicion.getP1().toString()+"-"+soluicion.getP2().toString());
	
		 
	}
	
}
