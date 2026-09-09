package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

public class MyHash {
	
	int BUCKET;
	ArrayList<LinkedList<Integer>> table;
	
	public MyHash(int b) {
		BUCKET = b;
		
		table = new ArrayList<LinkedList<Integer>>();
		
		for(int i=0;i<b;i++) {
			table.add(new LinkedList<Integer>());
		}
	}
	
	void insert(int key) {
		int i = key%BUCKET;
		table.get(i).add(key);
	}
	
	void remove(int key) {
		int i = key%BUCKET;
		table.get(i).remove((Integer) key);
	}
	
	void display() {
        for (int i = 0; i < BUCKET; i++) {
            System.out.print("Bucket " + i + ": ");
            for (int key : table.get(i)) {
                System.out.print(key + " -> ");
            }
            System.out.println("null");
        }
    }
	
	
	public static void main(String[] args) {
		MyHash hash = new MyHash(7);
        
        
        hash.insert(10); 
        hash.insert(20); 
        hash.insert(15); 
        hash.insert(7);  
        hash.insert(14);
        
        System.out.println("Hash table after insertions:");
        hash.display();
        
        
        System.out.println("\nRemoving 14...");
        hash.remove(14);
        
        System.out.println("Hash table after removal:");
        hash.display();
	}

}
