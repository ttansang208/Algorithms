import java.lang.reflect.Array;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {5,2,6,7,7,45,65};
		bubbleSort(arr);
		for(int x : arr)
		System.out.print(" " +x);
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			boolean isSorted = true;
			
			for (int j = 0; j < arr.length - i - 1/*Vi moi lan sort xong i se giam di 1 so, va j = j +1 => j < n-i-1 */; j++) {
				if (arr[j] > arr[j + 1]) {
					isSorted = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			if(isSorted) {
				break;
			}
		}
	}
}
