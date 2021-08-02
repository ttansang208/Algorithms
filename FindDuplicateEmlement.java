import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateEmlement {
	public static void main(String[] args) {	
		int[] arr = {7,15,-2,6,9,8,4,3,7};	
		findDuplicate2(arr);
	}
	
	
	static int findDuplicateElement(int[]arr) {		
		for(int i = 0; i < arr.length; i++) {
			for( int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("First elemt dupplicate is : " + arr[i]);
				}
			}		
		}
		return 1;
	}
	
	static void findDuplicate2(int [] arr) {
		Set<Integer> element = new HashSet<>();
		for(int i = 0 ; i < arr.length; i++) {
			if(element.contains(arr[i])) {
				System.out.println("First element dupplicate is" + arr[i] + "position" + i);
			}
		}
	}
	
	
		
}
