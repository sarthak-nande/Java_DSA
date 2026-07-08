package bitmagic;

public class FindKthBitSetOrNot {
	
	public static boolean solution1(int n, int k) {
		int x = 1;
		for(int i=0;i<k-1;i++) {
			x = x * 2;
		}
		if((n&x) != 0 ) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean solution2(int n, int k) {
		int x = 1;
		
		x = 1<<(k-1);
		
		if((n&x) != 0 ) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean solution3(int n, int k) {
			
			for(int i=0;i<k-1;i++) {
				n = n/2;
			}
			
			if((n&1) != 0 ) {
				return true;
			} else {
				return false;
			}
		}
	
	public static boolean solution4(int n, int k) {
		
		n = n>>(k-1);
		
		if((n&1) != 0 ) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		if(solution3(2,2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
