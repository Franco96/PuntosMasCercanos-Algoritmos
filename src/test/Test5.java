package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import algoritmos.Simple;
import utilidades.Punto;
import utilidades.Utilidades;

public class Test5 {

	
	
	public static void main(String[] args) {
		
		
		Comparator<Punto> customComparator = new Comparator<Punto>() {
			   

			@Override
			public int compare(Punto o1, Punto o2) {
				 if(o1.getX() > o2.getX())
			            return 1;
			        else return -1;
			}
		};
		
		
		
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		
		
		listaPuntos.add(new Punto(100, 20));
		listaPuntos.add(new Punto(30, 2000));
		listaPuntos.add(new Punto(30, 20));
		listaPuntos.add(new Punto(50, 299));
		listaPuntos.add(new Punto(1.5, 20));
		listaPuntos.add(new Punto(2, 20));
		listaPuntos.add(new Punto(80, 20));
		listaPuntos.add(new Punto(100, 20));
		listaPuntos.add(new Punto(100, 20));
		
		//Puntos que caigan del lado izquierdo
	/*	for (int i = 10000; i >0; i--) {
			
			listaPuntos.add(new Punto(i, i));
		
		}
		*/
		
		long start = System.nanoTime();
		List<Punto> sortedList = listaPuntos.stream()
		        .sorted(customComparator)
		        .collect(Collectors.toList());
		 long end = System.nanoTime();
		 
		 long microseconds1 = (end - start)/1000;
		
		
			
		 
		 
		
		for (Punto punto : sortedList) {
			
			System.out.println(punto.toString());			
		}
		
		System.out.println("lista viegA");	
		for (Punto punto : listaPuntos) {
			System.out.println(punto.toString());	
		}
		
		 
		 long start2 = System.nanoTime();
		Utilidades.quicksortParaX((ArrayList<Punto>) listaPuntos, 0, listaPuntos.size()-1);
		long end2 = System.nanoTime();
		 
		 long microseconds2 = (end2 - start2)/1000;
		 
		 System.out.println("Quicksort : "+microseconds2);	
		 System.out.println("Toto :"+microseconds1);
	}
	
	
	
}
