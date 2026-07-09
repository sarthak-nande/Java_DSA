package bitmagic;

public class OneOddOccuring {
	
	public static int solution(int nums[]) {
		int res = 0;
		
		for(int i=0;i<nums.length;i++) {
			res = res ^ nums[i];
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int nums[] = {2,2,1,8,8};
		
		System.out.println(solution(nums));
		
	}

}
