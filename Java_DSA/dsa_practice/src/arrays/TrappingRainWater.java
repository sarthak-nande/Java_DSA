package arrays;

public class TrappingRainWater {
	
	public static int basicSolution(int arr[]) {
		int res = 0;
		
		for(int i=1;i<arr.length-1;i++) {
			int lMax = arr[i];
			
			for(int j=0;j<i;j++) {
				lMax = Math.max(lMax, arr[j]);
			}
			
			int rMax = arr[i];
			
			for(int j=i+1;j<arr.length;j++) {
				rMax = Math.max(rMax, arr[j]);
			}
			
			res = res + Math.min(lMax, rMax) - arr[i];
		}
		return res;
	}
	
	public static int advanceSolution(int arr[]) {
		int res = 0;
		int lMax[] = new int[arr.length];
		int rMax[] = new int[arr.length];
		
		
		lMax[0] = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			lMax[i] = Math.max(arr[i], lMax[i-1]);
		}
		
		rMax[arr.length-1] = arr[arr.length-1];
		
		for(int i=arr.length-2;i>=0;i--) {
			rMax[i] = Math.max(arr[i], rMax[i+1]);
		}
		
		for(int i=1;i<arr.length-1;i++) {
			res = res + ((Math.min(lMax[i], rMax[i])) - arr[i]);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {3,0,1,2,5};
		
		int ans = advanceSolution(arr);
		
		System.out.println(ans);
		
	}

}
