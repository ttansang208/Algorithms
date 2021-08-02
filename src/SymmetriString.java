import java.util.Scanner;

public class SymmetriString {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("nhap vao chuoi ");
			String n = sc.nextLine();
			String[] arr = new String[n.length()];
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] != arr[arr.length - 1 - i]) {
					System.out.printf("Day khong phai chuoi doi xung");
				} else
					System.out.printf("CHUOI DOI XUNG");
			}
		}
	}
}
