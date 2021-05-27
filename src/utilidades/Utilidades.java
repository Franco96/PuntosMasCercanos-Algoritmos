package utilidades;

import java.util.ArrayList;

public  class Utilidades {
	
	
	
	
	public static double distancia(Punto p1,Punto p2) {
		long dx = (p1.getX() - p2.getX()); 
		long dy = (p1.getY() - p2.getY());
		return Math.sqrt(dx*dx + dy*dy); 
		
	}
	
	
	public static void quicksortParaX(ArrayList<Punto> A, int izq, int der) {

		  Punto pivote=A.get(izq); // tomamos primer elemento como pivote
		  int i=izq;         // i realiza la búsqueda de izquierda a derecha
		  int j=der;         // j realiza la búsqueda de derecha a izquierda
		  Punto aux;
		 
		  while(i < j){                          // mientras no se crucen las búsquedas                                   
		     
			  while(A.get(i).getX() <= pivote.getX() && i < j) i++; // busca elemento mayor que pivote
		     
		     while(A.get(j).getX() > pivote.getX()) j--;           // busca elemento menor que pivote
		     
		     if (i < j) {                        // si no se han cruzado                      
		         aux= A.get(i);                      // los intercambia
		         
		         A.set(i, A.get(j));
		         A.set(j, aux);
		         
		       
		     }
		   }
		   
		  A.set(izq, A.get(j));
		         // se coloca el pivote en su lugar de forma que tendremos                                    
		  A.set(j, pivote);
		      // los menores a su izquierda y los mayores a su derecha
		   
		   if(izq < j-1)
		      quicksortParaX(A,izq,j-1);          // ordenamos subarray izquierdo
		   if(j+1 < der)
		      quicksortParaX(A,j+1,der);          // ordenamos subarray derecho
		   
		}
	
	
	public static void quicksortParaY(ArrayList<Punto> A, int izq, int der) {

		  Punto pivote=A.get(izq); 
		  int i=izq;         
		  int j=der;         
		  Punto aux;
		 
		  while(i < j){                                                            
		     
			  while(A.get(i).getY() <= pivote.getY() && i < j) 
				  i++; 
		     
		     while(A.get(j).getY() > pivote.getY()) 
		    	  j--;           
		     
		     if (i < j) {                                            
		         aux= A.get(i);                      
		         
		         A.set(i, A.get(j));
		         A.set(j, aux);
		         
		       
		     }
		   }
		   
		  A.set(izq, A.get(j));
		                                        
		  A.set(j, pivote);
		      
		   
		   if(izq < j-1)
		      quicksortParaY(A,izq,j-1);          
		   if(j+1 < der)
		      quicksortParaY(A,j+1,der);        
		   
		}
	
	
}
