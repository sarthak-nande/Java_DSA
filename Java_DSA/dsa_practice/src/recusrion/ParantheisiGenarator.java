package recusrion;

import java.util.ArrayList;
import java.util.List;

public class ParantheisiGenarator {
	
	public static void generate(List<String> result, String currentStr, int openCount, int closeCount, int n) {
		if(currentStr.length() == n*2) {
			result.add(currentStr);
			return;
		}
		
		if(openCount<n) {
			generate(result, currentStr + "(", openCount+1, closeCount, n);
		}
		
		if(closeCount<openCount) {
			generate(result, currentStr + ")", openCount, closeCount+1, n);
		}
		
	}
	
	public static void main(String[] args) {
		
		List<String> result = new ArrayList<>();
		
		generate(result, "", 0, 0, 3);
		
		System.out.println(result);  
		
	}


}
