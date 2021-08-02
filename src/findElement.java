import java.util.Scanner;

public class findElement {
	public static void main(String[] args) {
		int n = 1000;
		int [] arr = new int [n];
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap vao tung phan tu cua mang");
		for(int x =990; x < n ; x ++) {
			arr[x] = sc.nextInt();
		}
		System.out.println("Nhap gia tri muon tim");
		int value = sc.nextInt();
		int result = linearSearch(arr, n, value);	
		if(result == -1) {
			System.out.println("Khong tim thay gia tri nay ");
		} else {
			System.out.println("Tim thay gia tri " +value + " o vi tri "+ result);
		}
	}

	static int linearSearch(int[] arr, int n,int value) {
		for(int i = 0; i < n; i ++ ) {
			if(arr[i] == value) {
				return i;
			}
		} return -1;
	}
	
}
