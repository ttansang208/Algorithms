import java.util.Scanner;

public class addandremove {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number of array :");
		int size = scanner.nextInt();
		int arr[] = new int[size];
		
		System.out.println("Every element :");
		for (int i = 0; i < size ; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Type value to add");
		int value = scanner.nextInt();
		addElement(arr, size, value);
	}
	
	public static int addElement(int[] arr, int size, int value) {
		if (size < 0 || size > arr.length) {
			return -1;
		} else {
			size ++;
			arr[size-1] = value;
		}
		return size + 1;
	}
	public static int remove(int[] arr, int size) {
		return size - 1;
	}
	
}
