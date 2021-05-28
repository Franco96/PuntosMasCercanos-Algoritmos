package algoritmos;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;
import utilidades.*;

public class DyC_ConYOrdenado {

	
	
	public static Par masCercanoEnFranja(List<Punto> franja, double min)
	{
	   
		Par par = new Par();
		
		par.setDistancia(min);
		
	    
	 
	    	    
	    for (int i = 0; i < franja.size(); ++i){
	    	
	 		
	        for (int j = i+1; j < franja.size(); ++j){
	        	
	        		double deltaY=(franja.get(j).getY() - franja.get(i).getY());
	            
	        		if( deltaY > min)
	        			break;
	        		else
	        			 if (Utilidades.distancia(franja.get(i),franja.get(j)) < par.getDistancia()){
	        				 
	        				 par.setDistancia(Utilidades.distancia(franja.get(i),franja.get(j)));
	        				 par.setP1(franja.get(i));
	        				 par.setP2(franja.get(j));
	        				 
	        			 }
	        }
	   
	    }
	 
	    return par;
	    

	}
	
	
	
	public static Par DyC_Y_Ordenado(List<Punto> ordenadosPorX,List<Punto> ordenadosPorY)
	{
		int n = ordenadosPorX.size();
		
		
	    if (n <= 3)
	        return Simple.algoritmoBasico(ordenadosPorX);
	 
	    // Find the middle point
	    int medio = n/2;
	    double xMedio = ordenadosPorX.get(medio).getX();
	 
	    
	    
	    List<Punto> listaIzquierdaX = new ArrayList<Punto>();
        List<Punto> listaDerechaX = new ArrayList<Punto>();
        List<Punto> listaIzquierdaY = new ArrayList<Punto>();
        List<Punto> listaDerechaY = new ArrayList<Punto>();
	    
	    
        listaIzquierdaX =  ordenadosPorX.subList(0, medio);
        listaDerechaX = ordenadosPorX.subList(medio, n);
        
       
        /*
        for (Punto punto : ordenadosPorX) {
        	
        	if(punto.getX()<=xMedio){
        		listaIzquierdaX.add(punto);
        	}
        	else{
        		listaDerechaX.add(punto);
        		}
        	
			
		}
		*/
        
        
        for (Punto punto : ordenadosPorY) {
        	
        	if((listaIzquierdaY.size()<listaIzquierdaX.size()) && (punto.getX()<=xMedio)){
        		listaIzquierdaY.add(punto);
        	}
        	else{
        		listaDerechaY.add(punto);
        		}
        	
			
		}
        
        
	    
	    
	    Par parIzq = DyC_Y_Ordenado(listaIzquierdaX,listaIzquierdaY);
	    Par parDer = DyC_Y_Ordenado(listaDerechaX,listaDerechaY);
	    
	    //Minimo de los dos lados
	    double min = Double.min(parIzq.getDistancia(), parDer.getDistancia());
	   
	    
	    ArrayList<Punto> franja = new ArrayList<Punto>();
	    
	    
	    for (int i = 0; i < n; i++){
	    		
	    	if (Math.abs(ordenadosPorY.get(i).getX() - xMedio) < min)
	    			
	    				franja.add(ordenadosPorY.get(i));
	    	
	    	
	    }
	    
	    Par parFranja = null;
	    if(franja.size() > 1)
	    	  parFranja = masCercanoEnFranja(franja,min);
	    
	    if(parFranja!=null && parFranja.getDistancia()<min)
	    	return parFranja;
	    else{
	    	
	    	if(parIzq.getDistancia()<parDer.getDistancia())
	    		return parIzq;
	    	else
	    		return parDer;
	    	
	    }
	   
	     
	   
	}
	 
	
	
	
	
	public static Par cascaraDyC(List<Punto> listaPunto){
		
		
		ArrayList<Punto> listaOrdenadaX = (ArrayList<Punto>) listaPunto.stream().collect(toList());
		ArrayList<Punto> listaOrdenadaY = (ArrayList<Punto>) listaPunto.stream().collect(toList());
		
		Utilidades.quicksortParaX(listaOrdenadaX, 0, listaOrdenadaX.size()-1);
		Utilidades.quicksortParaY(listaOrdenadaY, 0, listaOrdenadaY.size()-1);
		
		
		
		return DyC_Y_Ordenado(listaOrdenadaX,listaOrdenadaY);
		
		
	}
	
	
	
	
}

