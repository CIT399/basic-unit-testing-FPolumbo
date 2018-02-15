
/* Programmer: Frank Polumbo
 * Date: 2/15/2018
 * Purpose: To test the Telephone class's isFormatted method.
 * 
 */

import static org.junit.Assert.*;

// Class used to test
public class CharTest {

	@org.junit.Test
	public void test() {
		
		//Creates Steve as a string and tests its format.
		String str1 = "Steve";
		assertEquals(Telephone.isFormatted(str1), false);
	}

	@org.junit.Test
	public void test1() {

		//Creates a String and tests its format.		
		String str2 = "545687()434";
		assertEquals(Telephone.isFormatted(str2), true);
	}

	@org.junit.Test
	public void test2() {

		//Creates a String and tests its format.
		String str3 = "(570)456-8765";
		assertEquals(Telephone.isFormatted(str3), true);
	}

}
