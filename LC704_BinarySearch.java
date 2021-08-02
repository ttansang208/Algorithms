public class LC704_BinarySearch {
	public static void main(String[] args) {
		int[] nums = { -7, -2, 0, 3, 6, 9 };
		System.out.println(BinarySearch(nums, 9));

	}
	// Dung vong lap
//	public static int BinarySearch(int[] nums, int target) {
//		int size = nums.length;
//		int iLeft=0;
//        int iRight =size-1;
//        while(iLeft <= iRight) {
//        	int iMid = (iLeft + iRight) /2;
//        	if(target == nums[iMid]) {
//        		return iMid;
//        	} else if(target > nums[iMid]) {
//        		iLeft = iMid +1;        		
//        	} else iRight = iMid-1;
//        }
//		return -1;
//    }

	public static int BinarySearch1(int[] nums, int target, int iL, int iR) {
		if (iL > iR) {
			return -1;
		} else {
			int iM = (iL + iR) / 2;
			if (target == nums[iM]) {
				return iM;
			} else if (target > nums[iM]) {
				return BinarySearch1(nums, target, iM + 1, iR);
			} else {
				return BinarySearch1(nums, target, iL, iM - 1);
			}
		}
	}

	public static int BinarySearch(int[] nums, int target) {
		int size = nums.length;
		return BinarySearch1(nums, target, 0, size - 1);
	}
}
