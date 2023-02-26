package anagrams.s2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnagramTest {

	@Test
	void testAnagram1() throws Exception {
		Anagram anagram = new Anagram();
		assertTrue(anagram.isAnagram("lemon", "melon"));
	}
	
	@Test
	void testAnagram2() throws Exception {
		Anagram anagram = new Anagram();
		assertTrue(anagram.isAnagram("aaa", "aaa"));
	}

	@Test
	void testAnagram3() throws Exception {
		Anagram anagram = new Anagram();
		assertTrue(anagram.isAnagram("baa", "aba"));
	}
	
	@Test
	void testAnagram4() throws Exception {
		Anagram anagram = new Anagram();
		assertTrue(anagram.isAnagram("auto", "otua"));
	}

}
