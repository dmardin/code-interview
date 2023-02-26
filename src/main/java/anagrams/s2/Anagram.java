package anagrams.s2;

import java.util.Arrays;

import anagrams.IAnagram;

public class Anagram implements IAnagram {

	@Override
	public boolean isAnagram(String one, String two) {
		int[] array = one.chars().sorted().toArray();
		int[] array2 = two.chars().sorted().toArray();
		
		return Arrays.equals(array, array2);
	}

}
