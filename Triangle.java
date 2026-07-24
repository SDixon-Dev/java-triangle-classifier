/**
 * This class represents a triangle and stores the lengths of its three sides.
 * 
 * @author seand
 */
public class Triangle {
	 
	//The lengths of the triangle's three sides.
	private float a = 0.0f;
	private float b = 0.0f;
	private float c = 0.0f;

	/**
	 * Creates a Triangle object with three side lengths.
	 *
	 * @param sa the length of side a
	 * @param sb the length of side b
	 * @param sc the length of side c
	 */
	public Triangle(float sa, float sb, float sc) {
		this.a = sa; 
		this.b = sb;
		this.c = sc;
	}
	
	public float getA() {
		return a;
	}
	public void setA(float sa) {
		this.a = sa;
	}
	public float getB() {
		return b;
	}
	public void setB(float sb) {
		this.b = sb;
	}
	public float getC() {
		return c; 
	}
	public void setC(float sc) {
		this.c = sc;
	}
}
