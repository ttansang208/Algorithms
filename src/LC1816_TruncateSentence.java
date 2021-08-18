public class LC1816_TruncateSentence {
	public static String truncateSentence(String s, int k) {
		String[] arr = s.split(" ");
		StringBuilder result = new StringBuilder();
		for(int i = 0 ; i < k ; i++) {
			if( i ==0 ) {
				result.append(arr[i]);
			} else {
				result.append(" " + arr[i]);
			}
		}
		return result.toString();
	}
	/*
	 int countSpace = 0;
        int index = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                countSpace++;
            }
            if(countSpace == k - 1) {
                index = i + 1;
            }
        }
        return s.substring(0, index); 
	 */
}
