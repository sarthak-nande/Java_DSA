package mathematics;

public class PalindromNumber {
	
	public static boolean isNumberIsPalindrom(int num) {
		int rev = 0;
		int temp = num;
		
		while(temp>0) {
			int dr = temp%10;
			rev = rev*10 + dr;
			temp = temp/10;
		}
		
		if(rev == num) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String args[]) {
		int num = 11411;
		
		if(isNumberIsPalindrom(num)) {
			System.out.println("Number is Palindrome!");
		} else {
			System.out.println("Number is not Palindrome!");
		}
	}

}
