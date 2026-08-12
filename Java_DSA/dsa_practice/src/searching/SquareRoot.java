package searching;

public class SquareRoot {
	
	public static int solution(int x) {
		int low = 1, high = x, ans = -1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			int mSqu = mid*mid;
			
			if(mSqu==x) {
				return mid;
			}else if(mSqu>x) {
				high = mid - 1;
			}else {
				low = mid + 1;
				ans = mid;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int x = 25;
		
		int squareRoot = solution(x);
		
		System.out.println(squareRoot);
	}

}
