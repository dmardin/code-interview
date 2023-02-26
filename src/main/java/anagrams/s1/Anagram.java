package anagrams.s1;

import java.util.Arrays;

import anagrams.IAnagram;

public class Anagram implements IAnagram {


	@Override
	public boolean isAnagram(String one, String two) {
		char[] charArrayOne = one.toCharArray();
		char[] charArrayTwo = two.toCharArray();
		
		Arrays.sort(charArrayOne);
		Arrays.sort(charArrayTwo);
		
		return Arrays.equals(charArrayOne, charArrayTwo);
	}

}
