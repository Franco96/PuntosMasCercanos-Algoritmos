package test;

import java.util.ArrayList;

import utilidades.Par;
import utilidades.Punto;
import utilidades.Utilidades;
import algoritmos.DyC_ConYOrdenado;
import algoritmos.DyC_SinYOrdenado;


//TESTER PARA COMPARAR SOLO LOS DOS ALGORITMOS DYC HASTA 2^20 PUNTOS 
public class Tester2 {

	public static void main(String[] args) {
		
		executeAlgoritmosDyC();

	}
	
public static void executeAlgoritmosDyC(){
		
		
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		int cantPuntos = 0;
		
		for(int i = 1;i<21;i++){
			
			listaPuntos.clear();
			cantPuntos =  (int) Math.pow(2, i);
			System.out.println("Se van a testar para :"+cantPuntos +"("+2+"^"+i+") puntos");
			Utilidades.generarPuntosAleatorios(listaPuntos, cantPuntos);
			

			long start2 = System.nanoTime();
			Par solucionSimple2 = DyC_SinYOrdenado.algoritmo2(listaPuntos);
			long end2 = System.nanoTime();
			 long microseconds2 = (end2 - start2)/1000;
			System.out.println(solucionSimple2.toString());
			System.out.println("Tiempo de ejecion DyC SIN Y ordenado: "+microseconds2+" µs");
			
			long start3 = System.nanoTime();
			Par solucionSimple3 = DyC_ConYOrdenado.cascaraDyC(listaPuntos);
			long end3 = System.nanoTime();
			 long microseconds3 = (end3 - start3)/1000;
			System.out.println(solucionSimple3.toString());
			System.out.println("Tiempo de ejecion DyC CON Y ordenado: "+microseconds3+" µs");
		
			
			
			
			System.out.println("------------------------------------------------");
			
		}
		
	}

}
