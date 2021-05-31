package utilidades;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public  class Utilidades {
	
	
	
	public static double distancia(Punto p1,Punto p2) {
		double dx = (p1.getX() - p2.getX()); 
		double dy = (p1.getY() - p2.getY());
		return Math.sqrt(dx*dx + dy*dy); 
		
	}
	
	
	public static List<Punto> ordenarPorX(List<Punto> listaPuntos){
		
		Comparator<Punto> customComparator = new Comparator<Punto>() {
			   
			@Override
			public int compare(Punto o1, Punto o2) {
				 if(o1.getX() > o2.getX())
			            return 1;
			        else return -1;
			}
		};
		
		return listaPuntos.stream()
		        .sorted(customComparator)
		        .collect(Collectors.toList());
		
	}
	
public static List<Punto> ordenarPorY(List<Punto> listaPuntos){
		
		Comparator<Punto> customComparator = new Comparator<Punto>() {
			   
			@Override
			public int compare(Punto o1, Punto o2) {
				 if(o1.getY() > o2.getY())
			            return 1;
			        else return -1;
			}
		};
		
		return listaPuntos.stream()
		        .sorted(customComparator)
		        .collect(Collectors.toList());
		
	}
	

public static void generarPuntosAleatorios(List<Punto> listaPuntos,int cantPuntos){
	
	
    
	//PUNTOS ALEATORIO
			for (int i = 0; i < cantPuntos; i++) {
							
					//Ramdon de numeros x e y entre 0 y 10^9
					double pX = new Random().nextInt(1000000000);
					double pY = new Random().nextInt(1000000000);
					
					
						
					listaPuntos.add(new Punto(pX, pY));
			}
	
}
	
}
