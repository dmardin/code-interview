package palindrome.s1;

import palindrome.IPalindrome;

public class Palindrome implements IPalindrome {

	private String palindrome;
	
	public Palindrome(String palindrome) {
		this.palindrome = palindrome;
	}
	
	public boolean check() {
		palindrome = palindrome.replaceAll("[. ,:!/]", "");
		palindrome = palindrome.toLowerCase();
		
		boolean isPalindrome = false;
		if (palindrome.length() % 2 == 0) {
			int length = palindrome.length() / 2;
			isPalindrome = isPalindrome(isPalindrome, length);
		} else {
			int length = Math.abs((palindrome.length() / 2) - 1);
			isPalindrome = isPalindrome(isPalindrome, length);
		}
		
		return isPalindrome;
	}
	
	private boolean isPalindrome(boolean isPalindrome, int length) {
		for (int i = 0; i < length; i++) {
			if (palindrome.charAt(i) == palindrome.charAt(palindrome.length() - 1 - i)) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
}
