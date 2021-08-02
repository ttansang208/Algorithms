import java.util.Scanner;

public class ASCII {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao ky tu");
		Character key = scanner.nextLine().charAt(0);
		String s="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("Nhap vao so");
		int num = scanner.nextInt();
		for(int i = key; i < s.length(); i++) {
			char c = s.charAt(i + num);
			System.out.println(c);
		}
		convert(key,num);
	}

	static Character convert(Character key, int num) {		
		int value = num;
		key = (char) num;
		return key;
	}
}
