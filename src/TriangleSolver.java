/**
 * This class is part of the Triangle classification Project
 * It determines what type of Triangle an object is 
 * 
 * @author seand
 */
public class TriangleSolver {

	public String solveTriangle(Triangle t) { 
		
		//Retrieves the three side Lengths from the Triangle object
		float sideA = t.getA(); 
		float sideB = t.getB(); 
		float sideC = t.getC(); 
		
		//An Equilateral triangle has three equal sides
		if (areEqual(sideA, sideB) && areEqual(sideB, sideC)) {
			return "Equilateral"; 
		}
		
		//An isosceles triangle has at least two equal sides
		else if (areEqual(sideA, sideB) || areEqual(sideA, sideC) || areEqual(sideB, sideC)) {
			return "Isosceles"; 
		}
		
		//A scalene has no equal sides
		else {
			return "Scalene";
		}
	}
	
	/**
	 * Compares two float values using a small tolerance.
	 *
	 * @param a the first float value
	 * @param b the second float value
	 * @return true if the values are close enough to be considered equal; otherwise return false
	 */
	
	public boolean areEqual(float a, float b) {
		float tolerance = 0.0001f;
		return Math.abs(a - b) < tolerance; 
	}
}	