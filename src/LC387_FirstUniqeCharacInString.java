public class LC387_FirstUniqeCharacInString {
	/*
	 Give a String s, return the first non-repeating character in it and return this index of array
	 IF not exist , return -1  
	 */
	public static void main(String[] args) {
		
	}
	public int firstUniqChar(String s) {
		char [] arr = s.toCharArray();
		int [] count = new int [123];
		
		/*Tao ra 1 con tro chay, neu ky tu cua con tro trung voi 
		ky tu trong bang ma ascII thi bien dem tang len 1 */
		for(int i = 0 ; i < arr.length; i ++) {
			char c = arr[i];
			int index = (int)c;
			count[index]++;
		}
		/* Tao 1 con tro khac, so sanh phan tu trong bien count voi mang ban dau
		 * In ra phan tu co so count = 1 o vi tri dau tien tim dc trong mang
		 */
		for( int i = 0 ; i < arr.length; i++) {
			char c = arr[i];
			int index = (int)c;
			if(count[index] == 1) {
				return i;
			}
		}
		return -1;
	} 
}
