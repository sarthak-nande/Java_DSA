package bitmagic;

public class TwoOddOccuring {
	
	public static int[] solution(int nums[]) {
		int res[] = new int[2];
		
		int x = nums[0];
		
		for(int i=1;i<nums.length;i++) {
			x = x ^ nums[i];
		}
		
		int k = (x & ~(x-1));
		
		int res1=0, res2=0;
		
		for(int i=0;i<nums.length;i++) {
			if((k&nums[i]) != 0) {
				res1 = res1 & nums[i];
			} else {
				res2 = res2 & nums[i];
			}
		}
		
		res[0] = res1;
		res[1] = res2;
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int nums[] = {1,2,1,3,2,5};
		
		int res[] = new int[2];
		
		res = solution(nums);
		
		for(int i=0;i<2;i++) {
			System.out.println(res[i]);
		}
		
	}

}
