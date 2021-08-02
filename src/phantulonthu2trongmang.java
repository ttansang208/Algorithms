import java.util.Arrays;
import java.util.Scanner;

public class phantulonthu2trongmang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int temp = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			}
//			for (int j = i + 1; j < n - 1; j++) {
//				if (arr[i] < arr[j]) {
//					arr[i] = arr[j];
//					arr[j] = temp;
//					temp = arr[i];
//				}
//			}
//		}
		Arrays.sort(arr);
		MaxDelete(arr, n);
		for (int x : arr)
			System.out.print(" " + x);
	}

	static void MaxDelete(int arr[], int size) {
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		--size;
	}

}
