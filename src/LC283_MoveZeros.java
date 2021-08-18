public class LC283_MoveZeros {
	public void MoveZeros(int[] nums) {
		int n = nums.length;
		int curIdx = 0;
		for(int i = 0 ; i <= n-1 ; i ++) {
			if(nums[i] != 0) {
				nums[curIdx] = nums[i];
				curIdx++;
			}
		}
		while(curIdx <= n-1) {
			nums[curIdx] = 0;
			curIdx++;
		}
	}
}
