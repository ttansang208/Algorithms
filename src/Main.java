import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Nhap vao so luong phan tu ");
//		while (true) {
//			int n = scanner.nextInt();
//			String arr[] = new String[n];
//			System.out.println("Nhap vao tung phan tu ");
//			
//			for (int i = 0; i < n; i++) {
//				arr[i] = scanner.nextLine();
//			}
//			System.out.println("Cac phan tu vua nhap :");
//			
//			for (String a : arr) {
//				System.out.printf(" " + a);
//			}

//			 List< Double> list = new ArrayList<>();
//			 list.add(-16.0);
//			 list.add(3.0);
//			 list.add(1.0);
//			 list.add(7.0);
//			 Collections.sort(list);
//			 Collections.reverse(list);
//			 for(Double x : list) {
//				 System.out.println("Sorted " + x);
//			 }

		System.out.println("Nhap vao do dai cua mang ");
		int n = scanner.nextInt();
		String[] arr = new String[n];
		System.out.println("Nhap vao tung phan tu cua mang ");
		for (int a = 0; a <= n; a++) {
			arr[a] = scanner.nextLine();
		}
		
		int count = 0;
		System.out.println("Nhap vao phan tu ban muon tim ");
		String value = scanner.nextLine();
		System.out.println("Cac phan tu co chua ky tu can tim : ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].contains(value)) {
				count++;
			}
		}
		for (String x : arr) {
			System.out.println("Ky tu " + value + " xuat hien " + count + " lan va chua trong cac phan tu : " + x);
		}
	}
}
//}
