package test;

import java.util.ArrayList;

import algoritmos.DyC_ConYOrdenado;
import algoritmos.DyC_SinYOrdenado;
import algoritmos.Simple;
import utilidades.*;

//PROBAMOS EL PRIMER ALGO

public class Test1 {
	
	
	public static void main(String[] args) {
		
		
	//Punto [] A = {new Punto(200,2),new Punto(3,2),new Punto(7,2),new Punto(20,2),new Punto(9,2),new Punto(6,2)};
	
		
		
		
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		
		long start = System.nanoTime();
		Simple.algoritmoBasico(listaPuntos);
		 long end = System.nanoTime();
		 
		 long microseconds1 = (end - start)/1000;
		 
		 long start2 = System.nanoTime();
			DyC_SinYOrdenado.dyC_PuntosCercanosCascara(listaPuntos);
			 long end2 = System.nanoTime();
			 long microseconds2 = (end2 - start2)/1000;
			 
			 long start3 = System.nanoTime(); 
			 DyC_ConYOrdenado.cascaraDyC(listaPuntos);	 
			 long end3 = System.nanoTime();
			 long microseconds3 = (end3 - start3)/1000;
			 
			 
		 System.out.println("algoritmo basico :"+microseconds1+" µs");
		 System.out.println("algoritmo D y C :"+microseconds2+" µs");
		 System.out.println("algoritmo D y C y ordenado :"+microseconds3+" µs");
		
	}

}
