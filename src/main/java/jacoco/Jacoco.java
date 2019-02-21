package jacoco;

/**
 * class that contains example methods to implement the jacoco in the tests.<br><br>
 * 
 * Methods:<br>
 * {@link #isPalindrome(String)} <br>
 * {@link #reverse(String)}
 * 
 * @author osolarte
 *
 */
public class Jacoco {
	
	public boolean isPalindrome(String input) {
		
		if(input == null) {
			throw new IllegalArgumentException("the entry shouldn't be null");
		}
		
		if (input.equalsIgnoreCase(reverse(input))) {
			return true;
		} 
		return false;
		
	}
	
	private String reverse(String input) {
		StringBuilder rever = new StringBuilder();
		String[] inputArray = input.split("");
		for(int i = inputArray.length - 1; i >= 0; i--) {
			rever.append(inputArray[i]);
		}
		return rever.toString();
	}

	public static void main(String[] args) {
		System.out.println("Project executed successfull");
	}
	
}
