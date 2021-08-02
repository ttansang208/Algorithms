public class Quicksort {
	public static void main(String[] args) {
		int arr[] = {9,-1,5,4,3,6,-8};
		quickSort(arr, 0, arr.length-1);
		for(int x : arr) {
			System.out.print(x+ " ");
		}		
	}
	public static void quickSort(int[] arr, int L, int R) {
		if(L >= R) {
			return;
		}
		int key = arr[(L+R)/2];
		
		int k = partition(arr,L,R,key);
		
		quickSort(arr, L, k-1);
		quickSort(arr, k+1, R);
	}
	
	private static int partition(int[] arr, int L, int R, int key) {
		while( L <= R) {
			while(arr[L] < key) L++;
			while(arr[R] > key) R--;
			if(L <= R) {
				int tmp = arr[L];
				arr[L] = arr[R];
				arr[R] = tmp;
				L++;R--;
			}
		}
		return L;
	}
	
}
