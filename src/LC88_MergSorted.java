//import java.util.Iterator;
//public class LC88_MergSorted {
//	public static void main(String[] args) {
//		int n1[] = { 2, 3, 4, 5, 0, 0 ,0};
//		int n2[] = { 7, 1, 6 };
//		merge(n1, 4, n2, 3);	
//	}
//
////	public static void merge(int[] n1, int m, int[] n2, int n) {
////		for (int aI : n2) {
////			addE(aI, n1, m);
////			m++;
////		}
////	}
//
//	private static void addE(int x, int[] a, int m) {
//		/*
//		  tạo 1 biến k để so sánh với phần tử của mảng thứ 2. Nếu phần tử
//		  mảng 2 < k thì chèn nó vào trc k
//		 */
//		boolean findK = false;
//		for (int k = 0; k < m; k++) {
//			if (a[k] > x) {
//				findK = true;
//				for (int i = m - 1; i >= k; i--) {
//					a[i + 1] = a[i];
//				}
//				a[k] = x;
//				break;
//			}
//		}
////		 Nếu nó ko có k thỏa mãn thì chèn phần tử đó
////		  vào cuối mảng
//		if (findK == false) {
//			a[m] = x;
//		}
//	}
//	
//	/*
//	 Sử dụng 2 con trỏ
//	 	
//	 */
//
//	public static void merge(int[] n1, int m, int[] n2, int n) {
//		int i = m - 1;
//		int j = n - 1;
//		int k = m+n - 1;
//		while (k >= 0) {
//			if( j < 0 ) {
//				n1[k] = n1[i];
//				i--;
//			}else if( i < 0) {
//				n1[k] = n2[j];
//				j--;
//			}else if( n1[i] > n2[j]) {
//				n1[k] = n1[i];
//				i--;
//			}else {
//				n1[k] = n2[j];
//				j--;
//			}
//			k--;
//		}
//	}
//}
