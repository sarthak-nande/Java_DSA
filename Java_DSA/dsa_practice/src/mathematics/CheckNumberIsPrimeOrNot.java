package mathematics;

public class CheckNumberIsPrimeOrNot {
	
	//time complexity O(n)
	public static boolean naiveIsPrime(int num) {
		if(num == 1) return false;
		
		for(int i=2; i<num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	public static boolean effectiveSolution(int num) {
		if(num == 1) return false;
		
		for(int i=2; i*i<=num; i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean hardEffectiveSoltionWithExtraChecks(int num) {
		if(num == 1) return false;
		
		if(num==2 || num==3) return true;
		
		if(num%2==0 || num%3==0) return false;
		
		for(int i=5; i*i<=num; i=i+6) {
			if(num%i==0 || num%(i+2)==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		
		int num1 = 37;
		int num2 = 65;
		
		System.out.println("Is number is prime: " + naiveIsPrime(num1));
		System.out.println("Is number is prime: " + effectiveSolution(num1));
		System.out.println("Is number is prime: " + hardEffectiveSoltionWithExtraChecks(num1));
	}

}
