package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import algoritmos.AlgorimoMasEficiente;
import algoritmos.DyC_ConYOrdenado;
import algoritmos.DyC_SinYOrdenado;
import algoritmos.Simple;
import utilidades.Par;
import utilidades.Punto;

public class Tester {

	
	
	public static void main(String[] args) {
		
		
		
		
		
		//executeAlgoritmoSimple();
		
		executeAlgoritmosDyC();
		
	}
	
	
	public static void executeAlgoritmoSimple(){
		
		
		
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		int cantPuntos = 0;
		
		for(int i = 1;i<14;i++){
			
			listaPuntos.clear();
			cantPuntos =  (int) Math.pow(2, i);
			System.out.println("Se van a testar para :"+cantPuntos +" puntos");
			generarPuntos(listaPuntos, cantPuntos);
			
			
			long start = System.nanoTime();
			Par solucionSimple = Simple.algoritmoBasico(listaPuntos);
			long end = System.nanoTime();
			 long microseconds1 = (end - start)/1000;
			System.out.println(solucionSimple.toString());
			System.out.println("Tiempo de ejecion Fuerza bruta: "+microseconds1+" 탎");
			
			
			long start2 = System.nanoTime();
			Par solucionSimple2 = DyC_SinYOrdenado.algoritmo2(listaPuntos);
			long end2 = System.nanoTime();
			 long microseconds2 = (end2 - start2)/1000;
			System.out.println(solucionSimple2.toString());
			System.out.println("Tiempo de ejecion DyC SIN Y ordenado: "+microseconds2+" 탎");
			
			long start3 = System.nanoTime();
			Par solucionSimple3 = DyC_ConYOrdenado.cascaraDyC(listaPuntos);
			long end3 = System.nanoTime();
			 long microseconds3 = (end3 - start3)/1000;
			System.out.println(solucionSimple3.toString());
			System.out.println("Tiempo de ejecion DyC CON Y ordenado: "+microseconds3+" 탎");
		
			long start4 = System.nanoTime();
			Par solucionSimple4 = AlgorimoMasEficiente.dyC_PuntosCercanosCascara(listaPuntos);
			long end4 = System.nanoTime();
			 long microseconds4 = (end4 - start4)/1000;
			System.out.println(solucionSimple4.toString());
			System.out.println("Tiempo de ejecion DyC mas eficiente: "+microseconds4+" 탎");
			
			
			System.out.println("------------------------------------------------");
			
		}
		
	}
	
	public static void generarPuntos(List<Punto> listaPuntos,int cantPuntos){
		
	
        
		//PUNTOS ALEATORIO
				for (int i = 0; i < cantPuntos; i++) {
								
						//Ramdon de numeros x e y entre 0 y 10^9
						double pX = new Random().nextInt(1000000000);
						double pY = new Random().nextInt(1000000000);
						
						
							
						listaPuntos.add(new Punto(pX, pY));
				}
		
	}
	
	public static void executeAlgoritmosDyC(){
		
		
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		int cantPuntos = 0;
		
		for(int i = 1;i<21;i++){
			
			listaPuntos.clear();
			cantPuntos =  (int) Math.pow(2, i);
			System.out.println("Se van a testar para :"+cantPuntos +"("+2+"^"+i+") puntos");
			generarPuntos(listaPuntos, cantPuntos);
			

			long start2 = System.nanoTime();
			Par solucionSimple2 = DyC_SinYOrdenado.algoritmo2(listaPuntos);
			long end2 = System.nanoTime();
			 long microseconds2 = (end2 - start2)/1000;
			System.out.println(solucionSimple2.toString());
			System.out.println("Tiempo de ejecion DyC SIN Y ordenado: "+microseconds2+" 탎");
			
			long start3 = System.nanoTime();
			Par solucionSimple3 = DyC_ConYOrdenado.cascaraDyC(listaPuntos);
			long end3 = System.nanoTime();
			 long microseconds3 = (end3 - start3)/1000;
			System.out.println(solucionSimple3.toString());
			System.out.println("Tiempo de ejecion DyC CON Y ordenado: "+microseconds3+" 탎");
		
			long start4 = System.nanoTime();
			Par solucionSimple4 = AlgorimoMasEficiente.dyC_PuntosCercanosCascara(listaPuntos);
			long end4 = System.nanoTime();
			 long microseconds4 = (end4 - start4)/1000;
			System.out.println(solucionSimple4.toString());
			System.out.println("Tiempo de ejecion DyC mas eficiente: "+microseconds4+" 탎");
			
			
			System.out.println("------------------------------------------------");
			
		}
		
	}
	
	
}
