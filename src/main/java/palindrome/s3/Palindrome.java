package palindrome.s3;

import palindrome.IPalindrome;

public class Palindrome implements IPalindrome {

	private String palindrome;
	
	public Palindrome(String palindrome) {
		this.palindrome = palindrome;
	}
	public boolean check() {
		palindrome = palindrome.replaceAll("[. !,:/]", "");
		palindrome = palindrome.toLowerCase();
		String r = "";
		for(int i = palindrome.length() -1; i >= 0; i--) {
			r = r + palindrome.charAt(i);
		}
		return palindrome.equals(r);
	}
}
