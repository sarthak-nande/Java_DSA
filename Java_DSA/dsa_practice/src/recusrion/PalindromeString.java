package recusrion;

public class PalindromeString {
	
	public static boolean isPalindorome(String str, int start, int end) {
		if(start>=end) return true;
		
		return (str.charAt(start) == str.charAt(end) && isPalindorome(str, start+1, end-1));
	}
	
	public static void main(String args[]) {
		String str = "sarthak";
		if(isPalindorome(str, 0, str.length()-1)) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
	}

}
