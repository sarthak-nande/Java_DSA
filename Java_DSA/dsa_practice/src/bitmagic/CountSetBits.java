package bitmagic;

public class CountSetBits {
	
	public static int solution1(int n) {
		int count = 0;
		while(n>0) {
			if(n%2==1) {
				count = count + 1;
			}
			n = n/2;
		}
		return count;
	}
	
	public static int solution2(int n) {
		int count = 0;
		while(n>0) {
			n = n&(n-1);
			count = count + 1;
			
		}
		return count;
	}

	public static void main(String args[]) {
		System.out.println(solution1(10));
	}
}
