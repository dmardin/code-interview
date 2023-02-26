package palindrome.s2;

import palindrome.IPalindrome;

public class Palindrome implements IPalindrome {

	private String palindrome;
	
	public Palindrome(String palindrome) {
		this.palindrome = palindrome;
	}
	
	public boolean check() {
		palindrome = palindrome.replaceAll("[. !,:/]", "");
		palindrome = palindrome.toLowerCase();
		String reverse = new StringBuilder(palindrome).reverse().toString();
		return palindrome.equals(reverse);
	}
	
}
