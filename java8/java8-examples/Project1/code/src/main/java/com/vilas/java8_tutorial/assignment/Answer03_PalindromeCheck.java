package com.vilas.java8_tutorial.assignment;
/*
 PerformOperation isPalindrome(): 
	The lambda expression must return 
		true if a number is a palindrome or 
		false if it is not.
		
 */
public class Answer03_PalindromeCheck {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println(checkPalindrome().isPalindrome("malayalam"));
		System.out.println(checkPalindrome().isPalindrome("vilas"));
	}
	
    public static PerformOperation2 checkPalindrome() {
    	
    	return (String s) -> {
		        for (int i = 0; i < s.length() / 2; i++) {
		            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
		                return false;
		            }
		        }
		        return true;
		};
    	
    }
}

interface PerformOperation2{
	boolean isPalindrome(String s);
}
