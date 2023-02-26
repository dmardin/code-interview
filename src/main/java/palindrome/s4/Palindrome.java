package palindrome.s4;

import palindrome.IPalindrome;

public class Palindrome implements IPalindrome {
	
	private String text;

	public Palindrome(String text) {
		this.text = text;
	}

	@Override
	public boolean check() {
		return isPalindrome(text);
	}
	
	private boolean isPalindrome(String text) {
		text = text.replaceAll("[. !,:/]", "");
		text = text.toLowerCase();
		
		if(text.length() <= 1)
			return true;
		else if(text.charAt(0) == text.charAt(text.length() - 1)) {
			String shortText = text.substring(1, text.length() - 1);
			return isPalindrome(shortText);	
		}
		else 
			return false;
	}

}
