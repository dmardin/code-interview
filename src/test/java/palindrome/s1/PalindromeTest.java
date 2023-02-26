package palindrome.s1;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	void test() {
//		Palindrome palindrome = new Palindrome("");
//		palindrome.check();
		
		Palindrome palindrome = new Palindrome("112211");
		assertTrue(palindrome.check());
	}
	
	@Test
	void test2() {
		Palindrome palindrome = new Palindrome("11211");
		assertTrue(palindrome.check());
	}
	
	@Test
	void test3() {
		Palindrome palindrome = new Palindrome("2");
		assertTrue(palindrome.check());
	}
	
	@Test
	void test4() {
		Palindrome palindrome = new Palindrome("22");
		assertTrue(palindrome.check());
	}
	
	@Test
	void test5() {
		Palindrome palindrome = new Palindrome("");
		palindrome.check();
	}
	
	@Test
	void test6() {
		Palindrome palindrome = new Palindrome("Ein Esel lese nie.");
		assertTrue(palindrome.check());
	}
	
	@Test
	void test7() {
		Palindrome palindrome = new Palindrome("Eine güldne, gute Tugend: Lüge nie!");
		assertTrue(palindrome.check());
	}
	
	@Test
	void test8() {
		Palindrome palindrome = new Palindrome("112");
		assertFalse(palindrome.check());
	}
	
	@Test
	void test9() {
		Palindrome palindrome = new Palindrome("110");
		assertFalse(palindrome.check());
	}
	
	@Test
	void test10() {
		Palindrome palindrome = new Palindrome("20/02/21 12:20:02");
		assertTrue(palindrome.check());
		
	}

}
