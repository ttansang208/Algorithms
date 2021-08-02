import java.util.Arrays;

public class LC912_MErgeSort {
	public static void main(String[] args) {
		LC912_MErgeSort x = new LC912_MErgeSort();
		int[] a= {1,3,5};
		int[] b= {2,4,6};
		System.out.println(Arrays.toString(x.merge(a,b)));
	}
	
	//Hàm trộn 2 mảng đã sắp xếp
		public static int[] merge(int[] arr1, int[] arr2) {
			// Tron arr1 và arr2 vao khi đã sắp xếp xong
			int n = arr1.length + arr2.length; // tao 1 mang moi có số pt = arr1 + arr2
			int[] result = new int[n];

			int iResult = 0, 
				iArr1 = 0, 
				iArr2 = 0; // tao ra 3 con tro cua 3 mang
			while (iResult < n) {
				if (iArr1 < arr1.length && iArr2 < arr2.length) { //kiem tra xem 2 mang co ton tai size > 0 hay ko
					if (arr1[iArr1] < arr2[iArr2]) { // neu iArr1 < iArr2
						result[iResult] = arr1[iArr1]; // thay the iResult = iArr1 
						iResult++; // sau khi thay the, tang con tro cua mang ketqua va mang thu1 len +1
						iArr1++;
					} else {
						result[iResult] = arr2[iArr2];
						iResult++;
						iArr2++; // lam tuong tu va tang con tro cua mang thu2
					}
				}else {
					// kiem tra xem 1 trong 2 mang co rong hay ko
					if(iArr1 < arr1.length) {
						result[iResult] = arr1[iArr1]; 
						iResult++;  
						iArr1++;
					}else {
						result[iResult] = arr2[iArr2]; 
						iResult++;  
						iArr2++;
					}
				}
			}
			return result;
		}
		
	// Hàm có nhiệm vụ chia mảng ra thành các mảng nhỏ hơn => chia cho tới khi thành mảng có 1 pt
	// Sau đó gộp các mảng đã sắp xếp lại và trộn vào
		
		
		public int[] sortArray(int[] nums) {
			return mergeSort(nums, 0, nums.length - 1);
		}
	public static int[] mergeSort(int[] arr, int iL, int iR) {
		// Dieu kien dung` : khi cac phan tu trong 1 mang dc chia ra thanh cac mang co 1
		// phan tu
		if (iL > iR)
			return new int[0];
		if (iL == iR) {
			int[] singleElement = { arr[iL] };
			return singleElement;
		}
		
		// B3 Chia ra
		int iM = (iL + iR) / 2;
		System.out.println("chia " + iL + "-" + iR);
		int[] arr1 = mergeSort(arr, iL, iM); // chia mang ben trai đến khi nào thanh mảng có 1 pt
		int[] arr2 = mergeSort(arr, iM + 1, iR); // ... phai	
		
		int[] result= merge(arr1, arr2);
		return result;
	}
	
	
	
	
	/* Cách 2 : tạo ra 1 mảng tạm có độ dài bằng mảng của đề bài
	 public int[] sortArray(int[] nums) {
        int [] temp  = new int[nums.length];
        mergeSort(nums, temp, 0, nums.length - 1);
        return nums;
    }
    private void mergeSort(int[] nums, int[] temp, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(nums, temp, start, mid);
        mergeSort(nums, temp, mid + 1, end);
        merge(nums, temp, start, mid, end);

    }
    private void merge(int[] nums, int[] temp, int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        int index = left;
        while (left <= mid && right <= end) {
            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
            }
        }
        while (left <= mid) {
            temp[index++] = nums[left++];
        }
        while (right <= end) {
             temp[index++] = nums[right++];
        }
        
        for (int i = start; i <= end; i++) {
            nums[i] = temp[i];
        }
        
    } 
	 */
}
