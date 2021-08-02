import java.lang.reflect.Array;
import java.util.Arrays;

public class FindXin3Array {
	public static void main(String[] args) {
		int[] x = new int[5];
		
	}
	static void findElementCommon(int[] arrOne, int[] arrTwo, int[] arrThree) {
        // Sort 3 array
        Arrays.sort(arrOne);
        Arrays.sort(arrTwo);
        Arrays.sort(arrThree);
        int i = 0, j = 0, k = 0;
        while (i < arrOne.length && j < arrTwo.length && k < arrThree.length) {
            if (arrOne[i] == arrTwo[j] && arrTwo[j] == arrThree[k]) {
                System.out.println(arrOne[i]);
                i++;
                j++;
                k++;
            } else if (arrOne[i] < arrTwo[j]) {
                i++;
            } else if (arrTwo[j] < arrThree[k]) {
                j++;
            } else {
                k++;
            }
        }
    }
}
