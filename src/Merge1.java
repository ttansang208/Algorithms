public class Merge1 {

//	static int[] mergeSortArray(int [] arr) {
//		return mergeSort(arr, 0, arr.length-1);
//	}
//	
//	//  Tách mảng lớn ra thành các mảng con
//	static int[] mergeSort(int[] arr, int L, int R) {
//		// DKien dung
//		if (L > R)
//			return new int[0];
//		if (L == R) {
//			int[] singleE = { arr[L] };
//			return singleE;
//		}
//		int M = (L + R) / 2;
//		int[] arr1 = mergeSort(arr, L, M - 1);
//		int[] arr2 = mergeSort(arr, M + 1, R);
//		int[] result = merge(arr1, arr2);
//		return result;
//	}
//		
//
//	static int[] merge(int[] arr1, int[] arr2) {
//		int n = arr1.length + arr2.length;
//		int[] result = new int[n];
//		int iR = 0, i1 = 0, i2 = 0;
//		while (iR < n) {
//			if (i1 < arr1.length && i2 < arr2.length) {
//				if (arr1[i1] < arr2[i2]) {
//					result[iR] = arr1[i1];
//					iR++;
//					i1++;
//				} else {
//					result[iR] = arr2[i2];
//					iR++;
//					i2++;
//				}
//			} else{
//				if(i1 < arr1.length) {
//					result[iR] = arr1[i1];
//					iR++;
//					i1++;
//				} else {
//					result[iR] = arr2[i2];
//					iR++;
//					i2++;
//				}
//			}
//		} return result;
//	}

	static int[] mergesortArray(int[] arr) {
		return mergeSort(arr, 0, arr.length - 1);
	}

	static int[] mergeSort(int[] arr, int L, int R) {
		if (L > R)
			return new int[0];
		else if (L == R) {
			int[] singleE = { arr[L] };
			return singleE;
		}
		int M = (L + R) / 2;
		int[] arr1 = mergeSort(arr, L, M - 1);
		int[] arr2 = mergeSort(arr, M + 1, R);
		int[] result = merge(arr1, arr2);
		return result;
	}

	private static int[] merge(int[] arr1, int[] arr2) {
		int n = arr1.length + arr2.length;
		int[] result = new int[n];
		int iR = 0, i1 = 0, i2 = 0;
		while (iR < n) {
			if (i1 < arr1.length && i2 < arr2.length) {
				if (arr1[i1] < arr2[i2]) {
					result[iR] = arr1[i1];
					iR++;
					i1++;
				} else {
					result[iR] = arr1[i2];
					iR++;
					i2++;
				}
			} else {
				if (i1 < arr1.length) {
					result[iR] = arr1[i1];
					iR++;
					i1++;
				} else {
					result[iR] = arr2[i2];
					iR++;
					i2++;
				}
			}
		}
		return result;
	}
}