package test;

import java.util.ArrayList;

import utilidades.*;



public class Test1 {
	
	
	public static void main(String[] args) {
		
		
	//Punto [] A = {new Punto(200,2),new Punto(3,2),new Punto(7,2),new Punto(20,2),new Punto(9,2),new Punto(6,2)};
	
		ArrayList<Punto> listaPuntos = new ArrayList<Punto>( );
		
		listaPuntos.add(new Punto(14440, 3));
		listaPuntos.add(new Punto(1, 1));
		listaPuntos.add(new Punto(2000, 2000));
		listaPuntos.add(new Punto(1, 0));
		listaPuntos.add(new Punto(222, 3));
		listaPuntos.add(new Punto(44410, 3));
		
		for(int i = 0;i<listaPuntos.size();i++){
			
			System.out.print(listaPuntos.get(i).toString()+"-");
			
			}
		
		System.out.println("");
		
		System.out.println("ORDENAMOS Y QUEDA");
	
	Utilidades.quicksortParaY(listaPuntos, 0, listaPuntos.size()-1);
	
	for(int i = 0;i<listaPuntos.size();i++){
	
	System.out.print(listaPuntos.get(i).toString()+"-");
	
	}
		
	}

}
