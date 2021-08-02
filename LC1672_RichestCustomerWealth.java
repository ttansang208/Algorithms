public class LC1672_RichestCustomerWealth {
	public static int maximumWealth(int[][] arr) {
		int cus = arr.length;
		int bank = arr[0].length;
		int[] totalSum = new int[cus];

		for (int i = 0; i < cus; i++) {
			int cusSum = 0;
			for (int j = 0; j < bank; j++) {
				cusSum += arr[i][j];
			}
			totalSum[i] = cusSum;
		}

		int max = 0;
		for (int i = 0; i < cus; i++) {
			System.out.println("TotalSum " + totalSum[i]);
			if (totalSum[i] > max) {
				max = totalSum[i];
			}
		}

		return max;
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 3, 2, 1 } };
//		int rows = arr.length;
//		int cols = arr[0].length;
//		System.out.println("rows " + rows);
//		System.out.println("cols " + cols);
//		for(int i = 0 ; i < arr.length; i++) {
//			for(int j = 0; j < arr[0].length;j++) {
//				System.out.print	(arr[i][j]);
//			}
//			System.out.println();
//		}
		maximumWealth(arr);
	}
}
