package algoritmos;

import java.util.ArrayList;
import java.util.List;

import utilidades.*;

public class DyC_SinYOrdenado {

	
	
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
	
	
	
	public static Par DyC_PuntosCercanos(List<Punto> listaPuntos)
	{
		int n = listaPuntos.size();
		
		
	
	    if (n <= 3)
	        return Simple.algoritmoBasico(listaPuntos);
	 
	    
	    int medio = n/2;
	    double xMedio = listaPuntos.get(medio).getX();
	 
	    
	    List<Punto> listaIzquierda = new ArrayList<Punto>();
        List<Punto> listaDerecha = new ArrayList<Punto>();
	    
	    
        listaIzquierda =  listaPuntos.subList(0, medio);
        listaDerecha = listaPuntos.subList(medio, n);
	    
	    
	    Par parIzq = DyC_PuntosCercanos(listaIzquierda);
	    Par parDer = DyC_PuntosCercanos(listaDerecha);
	    
	    //Minima de los dos lados
	    double min = Double.min(parIzq.getDistancia(), parDer.getDistancia());
	   
	    
	    ArrayList<Punto> franja = new ArrayList<Punto>();
	    List<Punto> listaPuntoOrdenadaPorY = Utilidades.ordenarPorY(listaPuntos);
	   
	    for (int i = 0; i < n; i++){
	    		
	    	if (Math.abs(listaPuntoOrdenadaPorY.get(i).getX() - xMedio) < min)
	    			
	    				franja.add(listaPuntoOrdenadaPorY.get(i));
	    	
	    	
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
	
	
	public static Par algoritmo2(List<Punto> listaPuntos){
		
		
		List<Punto> ordenadoX = Utilidades.ordenarPorX(listaPuntos);
		
		return DyC_PuntosCercanos(ordenadoX);
		
	} 
	 
	
	
	
	
	
	
	
}
