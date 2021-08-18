public class LC66_PlusOne {
	public int[] plusOne(int[] digits) {
		int n = digits.length;
		//tạo biến số dư để chưa kết quả lớn hơn 10
		int plusNum = 1;
		//Biến i là phần tử cuối cùng của mảng để thao tác tính toán
		int i = n - 1;
		while (i >= 0 && plusNum > 0) {
			//biến tổng tạm = ptu cuối của mảng + số dư
			int Sumtmp = digits[i] + plusNum;
			// 14 % 10 => 4 => phần tử cuối sẽ = 4 => còn nợ 1
			digits[i] = Sumtmp % 10;
			//số
			plusNum = Sumtmp / 10;
			i--;
		}
		if(plusNum ==0) 
			return digits;
		
		int [] extra = new int [n +1];
			extra[0] = plusNum;
		
		for( i = 0 ; i < n; i ++) {
			extra[i+1] = digits[i];
		}
		return extra;
	}
}
