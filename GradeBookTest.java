import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author arman
 *
 */
class GradeBookTest {

	private GradeBook g1;
	private GradeBook g2;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);

		g1.addScore(41);
		g1.addScore(33);
		g1.addScore(75);

		g2.addScore(89);
		g2.addScore(64);
		g2.addScore(13);
		g2.addScore(19);

	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	public void tearDown() throws Exception {
		g1 = null;
		g2 = null;

	}

	// Test class
	@Test
	public void testAddScore() {

		// Check if it contains the same numbers
		assertTrue(g1.toString().contains("41.0 33.0 75.0"));
		// Check if it contains the same numbers
		assertTrue(g2.toString().contains("89.0 64.0 13.0 19.0"));
		// Check size g1 has 3 numbers
		assertEquals(3, g1.getScoreSize(), .001);
		// Check size g2 has 4 numbers
		assertEquals(4, g2.getScoreSize(), .001);

	}

	@Test
	public void testSum() {

		// Total sum score is 149
		assertEquals(41.0 + 33.0 + 75.0, g1.sum(), 0.001);
		// Total sum score is 185
		assertEquals(89.0 + 64.0 + 13.0 + 19.0, g2.sum(), 0.001);

	}

	@Test
	public void testMinimum() {
		// Smallest number is 33
		assertEquals(33, g1.minimum(), 0.001);
		// Smallest number is 13
		assertEquals(13, g2.minimum(), 0.001);

	}

	@Test
	public void testFinalScore() {
		// Checks if sum - minimum is equal to 116 the final score
		assertEquals(116, g1.finalScore(), 0.001);
		// Checks if sum - minimum is equal to 172 the final score
		assertEquals(172, g2.finalScore(), 0.001);

	}

}
