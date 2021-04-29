package e1;

public class QuadraticEquation {
	private int a = 0;
	private int b = 0;
	private int c = 0;
	
	public QuadraticEquation(int a, int b, int c) {
		setA(a);
		setB(b);
		setC(c);
	}
	public QuadraticEquation() {
		
	}
	
	public QuadraticEquation(QuadraticEquation other) {
		this.a=other.a;
		this.b=other.b;
		this.c=other.c;
	}
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	
	public double getDiscriminant() {

		
		return Math.pow(this.b,2)-4*this.a*this.c;
		
	}
	
	public double getRoot1() {
		if(getDiscriminant()<0) {
			return 0;
		}else {
			return (-this.b+Math.sqrt(getDiscriminant()))/ 2*this.a;
		}
		
	}
	public double getRoot2() {
		if(getDiscriminant()<0) {
			return 0;
		}else {
			return (-this.b-Math.sqrt(getDiscriminant()))/ 2*this.a;
		}
		
	}
	@Override
	public String toString() {
		return String.format("QuadraticEquation: a=%s, b=%s, c=%s", a, b, c);
	}
	
}
