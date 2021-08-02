import java.util.Scanner;

public class sumfirstandlastelement {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap vao kich thuoc mang :");
	int size = scanner.nextInt();
	int arr[] = new int [size];
	int sum = 0;
	System.out.println("Nhap vao tung phan tu trong mang");
	for(int i = 0; i < size ; i++ ) {
		arr[i] = scanner.nextInt();
		sum = arr[0] + arr[size-1];
	}
	System.out.println("Tong phan tu dau va cuoi la : " + sum);
}
}
