package algoritmos;


import java.util.List;
import utilidades.*;


public class Simple {
	
	public static Par algoritmoBasico(List<Punto> listaPuntos ){
		
		 Par Solucion = new Par();
		
		if(listaPuntos.size()==2){
			
			Solucion.setP1(listaPuntos.get(0));
			Solucion.setP2(listaPuntos.get(1));
			
			Solucion.setDistancia(Utilidades.distancia(Solucion.getP1(), Solucion.getP2()));
			
			return Solucion;
		}
	
		
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
	
		return Solucion;
			
	}
	
}
