package arrays;

public class StockBuyAndSell {
	
	public static int profit(int arr[]) {
		int profit = 0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[i-1]) {
				profit = profit + (arr[i] - arr[i-1]);
			}
		}
		
		return profit;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,5,3,8,12};
		
		int profit = profit(arr);
		
		System.out.println(profit);
	}

}
