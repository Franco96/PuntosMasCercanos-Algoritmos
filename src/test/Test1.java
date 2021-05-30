package test;

import java.util.ArrayList;
import java.util.Random;

import algoritmos.DyC_ConYOrdenado;
import algoritmos.DyC_SinYOrdenado;
import algoritmos.Simple;
import utilidades.*;
import static java.util.stream.Collectors.toList;



public class Test1 {
	
	
	public static void main(String[] args) {
		
		

	

		
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		
		
		
		
		
		//Puntos que caigan en franja
		
		for (int i = 0; i < 10000; i++) {
			
			
			double randomX = new Random().nextDouble();
			
			double randomY = new Random().nextDouble();
			double min2 = 500;
			double max2 = 504;
			double random2 = new Random().nextDouble();
			double resultY = min2 + (random2 * (max2 - min2));
			
			
			
			listaPuntos.add(new Punto(resultX, resultY));
		}
		
		

		 
		
	
		
		 long start3 = System.nanoTime(); 
		 DyC_ConYOrdenado.cascaraDyC(listaPuntos);	 
		 long end3 = System.nanoTime();
		 long microseconds3 = (end3 - start3)/1000;
		
		long start = System.nanoTime();
		int a= listaPuntos.size();
		 long end = System.nanoTime();
		 
		 long microseconds1 = (end - start)/1000;
		 
		 long start2 = System.nanoTime();
			//DyC_SinYOrdenado.dyC_PuntosCercanosCascara(listaPuntos);
			 long end2 = System.nanoTime();
			 long microseconds2 = (end2 - start2)/1000;
			 
			
			 
		
			 
			 
		 System.out.println("algoritmo basico :"+microseconds1+" µs");
		 System.out.println("algoritmo D y C :"+microseconds2+" µs");
		 System.out.println("algoritmo D y C y ordenado :"+microseconds3+" µs");
		
	}

}
