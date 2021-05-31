package utilidades;

//Clase que recoge los datos de una solucion concreta
public class Par {

	
    private Punto p1; //Primer punto del par mas cercano
    private Punto p2; //Segundo punto del par mas cercano
    private double distancia; //Distancia entre los dos puntos de la solucion
   

    
    public Punto getP1() {
        return p1;
    }

    
    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    
    public Punto getP2() {
        return p2;
    }

   
    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    
    public double getDistancia() {
        return distancia;
    }

    
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

   

	@Override
	public String toString() {
		return "Par [p1=" + p1.toString() + ", p2=" + p2.toString() + ", distancia=" + distancia
				+ "]";
	}
	
	
}
