public class LC414_ThirdmaximumNumber {
	/*
	 * Given integer array nums, return the third maximum number in this array. If
	 * the third maximum does not exist, return the maximum number.
	 */

	public static void main(String[] args) {
		int [] arr = {6,7,3,4};
		System.out.println(thirdMax(arr));
	}

	public static int thirdMax(int[] arr) {
		//Tạo 3 biến 
        Integer max = null;
        Integer second_max = null;
        Integer third_max = null;
        
        for ( Integer num : arr) {
            if(num.equals(max) || num.equals(second_max) ||num.equals(third_max)){
                continue;
            }
            /*nếu chưa có max hoặc số num > max
            thì số thứ 3 = số thứ 2, số thứ 2 = max , gán số max = num,
            */
            if(max == null || num > max){
                third_max = second_max;
                second_max = max;
                max = num;
            } else if(second_max == null || num > second_max){
                third_max = second_max;
                second_max = num;
            } else if(third_max == null || num > third_max){
                third_max = num;
            }
        }
        if(third_max == null){
            return max;
        }
        return third_max;
    }

}
