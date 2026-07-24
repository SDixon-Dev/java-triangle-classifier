/**
 * A custom test class for the Triangle and TriangleSolver classes.
 *
 * This file creates several Triangle objects,
 * passes them to the TriangleSolver class,
 * compares the actual result against the expected result.
 *
 * @author seand
 */
public class TriangleTest {

	public static void main(String[] args) {

		// Creates one TriangleSolver object that will be reused for every test.
		TriangleSolver solver = new TriangleSolver();

		System.out.println("Triangle Recognition Tests");
		System.out.println("----------------------------------------");

		/*
		 * Each call to runTest() supplies:
		 *
		 * Test name,
		 * A Triangle object containing three side lengths,
		 * The expected triangle classification.
		 */

		runTest(
				"Test 1: Equilateral triangle",
				new Triangle(3.0f, 3.0f, 3.0f),
				"Equilateral",
				solver
		);

		runTest(
				"Test 2: Isosceles triangle where A equals B",
				new Triangle(5.0f, 5.0f, 3.0f),
				"Isosceles",
				solver
		);

		runTest(
				"Test 3: Isosceles triangle where A equals C",
				new Triangle(5.0f, 3.0f, 5.0f),
				"Isosceles",
				solver
		);

		runTest(
				"Test 4: Isosceles triangle where B equals C",
				new Triangle(3.0f, 5.0f, 5.0f),
				"Isosceles",
				solver
		);

		runTest(
				"Test 5: Scalene triangle",
				new Triangle(3.0f, 4.0f, 5.0f),
				"Scalene",
				solver
		);

		runTest(
				"Test 6: Equilateral triangle using decimal values",
				new Triangle(2.5f, 2.5f, 2.5f),
				"Equilateral",
				solver
		);

		System.out.println("----------------------------------------");
		System.out.println("Testing complete.");
	}

	/**
	 * Runs one triangle classification test.
	 *
	 * Asks TriangleSolver to classify the supplied Triangle,
	 * compares the actual result with the expected result,
	 * prints whether the test passed or failed.
	 *
	 * @param testName a description of the test
	 * @param triangle the Triangle object being tested
	 * @param expected the expected triangle classification
	 * @param solver the TriangleSolver object used to classify the triangle
	 */
	private static void runTest(
			String testName,
			Triangle triangle,
			String expected,
			TriangleSolver solver) {

		// Calls solveTriangle() and stores the returned classification.
		String actual = solver.solveTriangle(triangle);

		System.out.println(testName);
		System.out.println("Side A: " + triangle.getA());
		System.out.println("Side B: " + triangle.getB());
		System.out.println("Side C: " + triangle.getC());
		System.out.println("Expected result: " + expected);
		System.out.println("Actual result:   " + actual);

		/*
		 * equals() compares the text stored in the two String objects.
		 *
		 * If the actual output matches the expected output, the test passes.
		 */
		if (expected.equals(actual)) {
			System.out.println("Result: PASSED");
		}
		else {
			System.out.println("Result: FAILED");
		}

		// Prints a separator between tests.
		System.out.println("----------------------------------------");
	}
}