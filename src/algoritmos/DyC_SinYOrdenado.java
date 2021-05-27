package algoritmos;

import java.util.ArrayList;

import utilidades.*;

public class DyC_SinYOrdenado {

	
	
	
	
	
	public static double masCercanoEnFranja(ArrayList<Punto> franja, int size, double d)
	{
	    double min = d; 
	 
	    //Ordenar segun Y O(n log n)
	    Utilidades.quicksortParaY(franja, 0, franja.size()-1);
	 
	    
	    
	    for (int i = 0; i < size; ++i){
	    	
	    			
	        for (int j = i+1; j < size && (franja.get(j).getY() - franja.get(i).getY()) < min; ++j)
	            
	        	if((franja.get(j).getY() - franja.get(i).getY()) > min)
	        		break;
	        	else
	        		if (Utilidades.distancia(franja.get(i),franja.get(j)) < min)
	        					min = Utilidades.distancia(franja.get(i),franja.get(j));
	        
	    }
	 
	    return min;
	    
	    
	   
	}
	
	
}
