package algoritmos;

import java.util.ArrayList;
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
	
			
		Punto [] puntosMasCercanos = algoritmoBasico(listaPuntos);
		
		System.out.println(puntosMasCercanos[0].toString()+"-"+puntosMasCercanos[1].toString());
		
		
		
	}
	
	
	
	
	
	
	public static Punto[] algoritmoBasico(List<Punto> listaPuntos ){
		
		Punto [] puntosMasCercanos = {new Punto(0, 0),new Punto(0, 0)}; 
	
		
		double distToReturn = Double.MAX_VALUE;
		
		for(int i= 0;i<listaPuntos.size();i++){
				
			for (int j=i+1; j<listaPuntos.size();j++){
					
				double distanciaActual = Utilidades.distancia(listaPuntos.get(i),listaPuntos.get(j));
				
				
				if(distToReturn>distanciaActual){
					
					distToReturn = distanciaActual;
					puntosMasCercanos[0] = listaPuntos.get(i);
					puntosMasCercanos[1] = listaPuntos.get(j);
				}
				
				
			}
			
		}
		
		
		return puntosMasCercanos;
			
	}
	
	
	

}
