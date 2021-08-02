public class LC27_RemoveElement {
	 public static int removeElement(int[] nums, int val) {
		 // Tạo ra thêm 1 con trỏ k chứa giá trị không trùng với value trong mảng
		 	int k = 0;
		 	for(int i=0; i<nums.length;i++) {
		 		//Nếu phần tử trong mảng i khác với giá trị value
		 		if(nums[i] != val) {
		 			nums[i] = nums[k];
		 			k++;
		 		}
		 	}
	        return k;
	    }
	 public static void main(String[] args) {
		int[] nums = {1,1,0,5,4,6,5};
		int val =  1;
		// => output : 0,4,6 => k= 3
		removeElement(nums, val);
	}
	 
}
