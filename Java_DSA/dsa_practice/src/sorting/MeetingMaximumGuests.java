package sorting;

import java.util.Arrays;

public class MeetingMaximumGuests {
	
	public static int solution(int arrival[], int departure[]) {
		Arrays.sort(arrival);
		Arrays.sort(departure);
		
		int n = arrival.length;
		int m = departure.length;
		
		int i = 1, j = 0, res = 1, curr = 1;
		
		while(i<n && j<m) {
			if(arrival[i]<=departure[j]) {
				i++;
				curr++;
			}else {
				j++;
				curr--;
			}
			
			res = Math.max(res, curr);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arrival[] = {900,600,700};
		int departure[] = {1000,800,730};
		
		int ans = solution(arrival, departure);
		
		System.out.println(ans);
	}

}
