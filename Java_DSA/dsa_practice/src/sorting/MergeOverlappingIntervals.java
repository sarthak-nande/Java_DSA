package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Interval implements Comparable<Interval>{
	
	int start;
	int end;

	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public int compareTo(Interval o) {
		return Integer.compare(this.start, o.end);
	}
	
}

public class MergeOverlappingIntervals {
	
	public static void merge(int arr[][]){
		
		List<Interval> intervals = new ArrayList<>();
		
		for(int temp[] : arr) {
			intervals.add(new Interval(temp[0], temp[1]));
		}
		
		Collections.sort(intervals);
		
		int res = 0;
		
		for(int i=1;i<arr.length;i++) {
			if(intervals.get(res).end >= intervals.get(i).start) {
				intervals.get(res).end = Math.max(intervals.get(res).end, intervals.get(i).end);
				intervals.get(res).start = Math.min(intervals.get(res).start, intervals.get(i).start);
			}else {
				res++;
				intervals.set(res, intervals.get(i));
			}
		}
		
		for(int i=0;i<=res;i++) {
			System.out.println(intervals.get(i).start + " " + intervals.get(i).end);
		}
		
	}

	public static void main(String[] args) {
		int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        
		merge(arr);
	}
}
