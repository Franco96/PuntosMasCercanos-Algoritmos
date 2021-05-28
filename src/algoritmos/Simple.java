package algoritmos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import utilidades.*;





public class Simple {

	public static void main(String[] args) {
	
		
		//Tienen que ser positivos los puntos [0,10^9]
		
	
	
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		
	
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2, 2));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		listaPuntos.add(new Punto(14440, 3));
	
			
		Par puntosMasCercanos = algoritmoBasico(listaPuntos);
		
		System.out.println("Tiempo de ejecucion "+puntosMasCercanos.getTiempo());
		
		
		
	}
	
	
	
	
	
	
	public static Par algoritmoBasico(List<Punto> listaPuntos ){
		
		double Inicio = new Date().getTime(); //Tomamos la fecha de inicio
		
		 Par Solucion = new Par();
		
		
	
		
		 Solucion.setDistancia(Double.MAX_VALUE); //Como buscamos la distncia minima, inicializamos la variale con el valor maximo
		
		for(int i= 0;i<listaPuntos.size();i++){
				
			for (int j=i+1; j<listaPuntos.size();j++){
					
				double distanciaActual = Utilidades.distancia(listaPuntos.get(i),listaPuntos.get(j));
				
				
				if(Solucion.getDistancia()>distanciaActual){
					
					  	Solucion.setDistancia(distanciaActual);
	                    Solucion.setP1(listaPuntos.get(i));
	                    Solucion.setP2(listaPuntos.get(j));
					
				
				}
				
				
			}
			
		}
		
		
		 double Fin = new Date().getTime(); 
	       
		 Solucion.setTiempo(Fin - Inicio);
		
		
		return Solucion;
			
	}
	
	
	

}
