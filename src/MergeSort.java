import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		MergeSort demo = new MergeSort();
		int [] x = {3,1,6};
		int [] y = {5,4,2};
		System.out.printf(Arrays.toString(demo.merge(x,y)));	
	}
	//B1 thuc hien tach mang ra thanh nhieu mang nho
	public static int [] mergeSort(int[] arr, int L , int R) {
		if(L > R) return new int[0];
		if( L == R) {
			int []single = {arr[L]};
			return single;
		}
		int Mid = (L + R)/2;
		int[] arr1 = mergeSort(arr,L,Mid);
		int[] arr2 = mergeSort(arr,Mid+1,R);
		int[] result =merge(arr1,arr2);
		return result;
	}
	//B2 goi de quy
	static int[] mergeSortArray(int[] nums) {
		return mergeSort(nums, 0, nums.length-1);
	}
	
	//B3 sap xep cac phan tu trong cac mang da duoc chia
	static int[] merge(int [] arr1, int[] arr2) {
		int n = arr1.length + arr2.length;
		int[] result = new int [n];
		int iRs=0,
			i1=0,
			i2=0;
		while(iRs < n) {
			if(i1 < arr1.length && i2 < arr2.length) {
				if(arr1[i1] < arr2[i2]) {
					result[iRs] = arr1[i1];
					iRs++;i1++;
				}else {
					result[iRs] = arr2[i2];
					iRs++;i2++;
				}
			}else {
				if(i1 < arr1.length) {
					result[iRs] = arr1[i1];
					iRs++;i1++;
				} else {
					result[iRs] = arr2[i2];
					iRs++;i2++;
				}
			}
		}
		return result;
	}
	
}
