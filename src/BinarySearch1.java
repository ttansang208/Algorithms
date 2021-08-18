import java.util.Scanner;

public class BinarySearch1 {
	
	static int binarySearch(int[] arr, int target) {
		return bS(arr, target, 0, arr.length-1);
	}
	static int bS(int[] arr, int target, int L, int R) {
		if( L > R ) {
			return -1;
		} else {
			int M = (L+R)/2;
			if( target == arr[M]) {
				return M;
			} else if ( target > arr[M]) {
				return bS(arr,target, M+1, R);
			} else {
				return bS(arr, target, L, M-1);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int [1000];
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap gia tri cac phan tu");
		for( int i = 990 ; i < arr.length; i ++) {			
			arr[i] = sc.nextInt();
		}
		System.out.println("nhap gia tri can tim");
		int value = sc.nextInt();
		int rs = binarySearch(arr, value);
		if( rs == -1) {
			System.out.println("Khong tim thay");
		} else System.out.println("Tim thay gia tri " + value + " o vi tri " + rs );
	}
	}
