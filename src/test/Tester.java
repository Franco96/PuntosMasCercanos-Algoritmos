package test;

import java.util.ArrayList;

import algoritmos.DyC_ConYOrdenado;
import algoritmos.DyC_SinYOrdenado;
import algoritmos.Simple;
import utilidades.Par;
import utilidades.Punto;
import utilidades.Utilidades;


//TESTER PARA COMPARAR LOS 3 ALGORITMOS HASTA 2^13 PUNTOS
public class Tester {

	
	
	public static void main(String[] args) {
	
		executeAlgoritmoSimple();
			
	}
	
	
	public static void executeAlgoritmoSimple(){
		
		
		
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		int cantPuntos = 0;
		
		for(int i = 1;i<14;i++){
			
			listaPuntos.clear();
			cantPuntos =  (int) Math.pow(2, i);
			System.out.println("Se van a testar para :"+cantPuntos +" puntos");
			Utilidades.generarPuntosAleatorios(listaPuntos, cantPuntos);
			
			
			long start = System.nanoTime();
			Par solucionSimple = Simple.algoritmoBasico(listaPuntos);
			long end = System.nanoTime();
			long microseconds1 = (end - start)/1000;
			System.out.println(solucionSimple.toString());
			System.out.println("Tiempo de ejecion Fuerza bruta: "+microseconds1+" ?s");
			
			
			long start2 = System.nanoTime();
			Par solucionSimple2 = DyC_SinYOrdenado.algoritmo2(listaPuntos);
			long end2 = System.nanoTime();
			 long microseconds2 = (end2 - start2)/1000;
			System.out.println(solucionSimple2.toString());
			System.out.println("Tiempo de ejecion DyC SIN Y ordenado: "+microseconds2+" ?s");
			
			long start3 = System.nanoTime();
			Par solucionSimple3 = DyC_ConYOrdenado.cascaraDyC(listaPuntos);
			long end3 = System.nanoTime();
			 long microseconds3 = (end3 - start3)/1000;
			System.out.println(solucionSimple3.toString());
			System.out.println("Tiempo de ejecion DyC CON Y ordenado: "+microseconds3+" ?s");
		
			
			
			
			System.out.println("------------------------------------------------");
			
		}
		
	}
	

	
	
	
	
}
