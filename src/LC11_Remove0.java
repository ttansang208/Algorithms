import java.util.Scanner;

public class LC11_Remove0 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao n");
		int size = scanner.nextInt();
		int arr[] = new int [size];
		System.out.println("nhap vao cac phan tu ");
		for(int i =0; i < size;i++) {
			arr[i] = scanner.nextInt();
		}
		remove(arr,size);
		for( int x : arr) {
			System.out.println(" " + x);
		}
	}
	
	public static void remove(int[]arr, int size) {
		for(int i = 0 ; i < size; i++) {
			if(arr[i] == 0) {
				arr[i] = arr[i+1];
			}
			size--;
		}
	}
}
