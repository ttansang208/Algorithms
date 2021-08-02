public class LC1662_CheckIfTwoStringArrayAreEqiupvalent {
	/*cho 2 mang word1, word2. Yeu cau cong 2 chuoi ky tu cua mang
	va so sanh co giong nhau hay khong */
	
	public static void main(String[] args) {
		String [] word1 = {"ab","d"};
		String [] word2 = {"a","bc"};
		System.out.println(arrayStringAreEqual(word1, word2));
		}
	
	public static boolean arrayStringAreEqual(String[] word1, String[] word2) {
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		for(String s : word1) {
			sb1.append(s);
		}
		for(String s : word2) {
			sb2.append(s);
		}
		return sb1.toString().equals(sb2.toString());
	}
}
