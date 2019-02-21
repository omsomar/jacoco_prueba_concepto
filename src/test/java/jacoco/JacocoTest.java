package jacoco;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * class that implements the tests to the methods contained in Jacoco. 
 * Here the jacoco lib tests are implemented to obtain a good score in software quality for release to production.
 * @author osolarte
 *
 */
public class JacocoTest {

	Jacoco jacoco = new Jacoco();
	boolean expected = true;
	String input = "noon";
	
	@Test()
	public void isPalindromeTest() {
		assertEquals(expected, jacoco.isPalindrome(input));
	}
	
	@Test()
	public void isNotPalindromeTest() {
		assertEquals(false, jacoco.isPalindrome("abc"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void isPalindromeExceptionTest() {
		assertEquals(true, jacoco.isPalindrome(null));
	}

}
