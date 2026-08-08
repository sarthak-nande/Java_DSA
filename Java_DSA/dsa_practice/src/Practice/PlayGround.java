package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlayGround {
	
	public static long solve(int N, int lower, int upper, int[] a) {
        long[] p = new long[N + 1];
        for (int i = 0; i < N; i++) {
            p[i + 1] = p[i] + a[i];
        }
        
        // 1. Calculate prefix comforts assuming NO resets happen
        int[] pref_comfort = new int[N + 1];
        long current_floor = 0;
        for (int i = 1; i <= N; i++) {
            pref_comfort[i] = pref_comfort[i - 1];
            long diff = p[i] - current_floor;
            if (diff >= lower && diff <= upper) {
                pref_comfort[i]++;
            }
            current_floor = Math.min(current_floor, p[i]);
        }
        
        // 2. Build a Sparse Table for O(1) Range Minimum Queries on prefix sums
        int LOG = 32 - Integer.numberOfLeadingZeros(N + 1);
        long[][] st = new long[LOG][N + 1];
        for (int i = 0; i <= N; i++) {
            st[0][i] = p[i];
        }
        for (int j = 1; j < LOG; j++) {
            for (int i = 0; i + (1 << j) <= N + 1; i++) {
                st[j][i] = Math.min(st[j - 1][i], st[j - 1][i + (1 << (j - 1))]);
            }
        }
        
        int[] diffArray = new int[N + 2];
        
        // 3. For each event i, find which reset points k (where k < i) make it comfortable
        for (int i = 1; i <= N; i++) {
            long A = p[i] - upper;
            long B = p[i] - lower;
            
            // Binary search for the smallest k where the floor is >= A
            int low = 0, high = i - 1;
            int k_min = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                int len = (i - 1) - mid + 1;
                int j = 31 - Integer.numberOfLeadingZeros(len);
                long min_val = Math.min(st[j][mid], st[j][(i - 1) - (1 << j) + 1]);
                
                if (min_val >= A) {
                    k_min = mid;
                    high = mid - 1; // Try going further left
                } else {
                    low = mid + 1;
                }
            }
            
            // Binary search for the largest k where the floor is <= B
            low = 0; high = i - 1;
            int k_max = -1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                int len = (i - 1) - mid + 1;
                int j = 31 - Integer.numberOfLeadingZeros(len);
                long min_val = Math.min(st[j][mid], st[j][(i - 1) - (1 << j) + 1]);
                
                if (min_val <= B) {
                    k_max = mid;
                    low = mid + 1; // Try going further right
                } else {
                    high = mid - 1;
                }
            }
            
            // Register the valid range of resets using the difference array
            if (k_min != -1 && k_max != -1 && k_min <= k_max) {
                diffArray[k_min]++;
                diffArray[k_max + 1]--;
            }
        }
        
        // 4. Resolve the difference array and find the maximum sum
        int[] score = new int[N + 1];
        int current_score = 0;
        for (int k = 0; k <= N; k++) {
            current_score += diffArray[k];
            score[k] = current_score;
        }
        
        long max_comfort = 0;
        for (int k = 0; k <= N; k++) {
            max_comfort = Math.max(max_comfort, (long) pref_comfort[k] + score[k]);
        }
        
        return max_comfort;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int N = sc.nextInt();
            int lower = sc.nextInt();
            int upper = sc.nextInt();
            
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }
            
            long result = solve(N, lower, upper, a);
            System.out.println(result);
        }
        
        sc.close();
    }
}
