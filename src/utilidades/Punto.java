package utilidades;

public class Punto {

	double x;
	double y;
	
	

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public double getX() {
		return  x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}


	@Override
	public String toString() {
		return "(x=" + x + ", y=" + y + ")";
	}

	@Override
	public boolean equals(Object p) {
		
		boolean r = (this.getX()==((Punto) p).getX() && this.getY()==((Punto) p).getY());
		
		return r;
	}
	
	

}
