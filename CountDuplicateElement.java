import java.util.Scanner;

public class CountDuplicateElement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Nhap vao so luong phan tu ");
		int size = input.nextInt();
		int arr[] = new int[size];
		int count = 1;
		for (int i = 0; i < size; i++) {
			arr[i] = input.nextInt();
			for (int j = i + 1; j < size - 1; j++) {
				if(arr[j] == arr[i]) {
					count++;
				}
				System.out.println("Phan tu " + arr[j] + " lap lai " + count + " Lan");
			}
		}
		
	}
}
