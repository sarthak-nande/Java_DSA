package recusrion;

public class SumOfNatualNumbers {
	
	public static int sumUp(int n) {
		
		if(n==0) {
			return 0;
		}
		
		return n+sumUp(n-1);
	}
	
	public static int sumUp2(int n, int k) {
			
			if(n==0) {
				return 0;
			}
			
			return sumUp2(n-1, n+k);
		}
	
	public static void main(String args[]) {
		int ans = sumUp(5);
		
		System.out.println(ans);
		
		System.out.println(sumUp2(5, 0));
	}

}
