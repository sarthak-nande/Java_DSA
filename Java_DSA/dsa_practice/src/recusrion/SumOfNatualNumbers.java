package recusrion;

public class SumOfNatualNumbers {
	
	public static int sumUp(int n) {
		
		if(n==0) {
			return 0;
		}
		
		return n+sumUp(n-1);
	}
	
	
	public static void main(String args[]) {
		int ans = sumUp(5);
		
		System.out.println(ans);
		
	}

}
