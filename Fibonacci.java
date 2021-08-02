import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n");
		int n = scanner.nextInt();
		System.out.println(fib(n));

	}

	public static int fib(int n) {
//		int F0 = 0;
//		int F1 = 1;
//		int Fn = 1;
//		if (n < 0) {
//			return -1;
//		} else if (n == 0 || n == 1)
//			return n;
//		else
//			for (int i = 2; i < n; i++) {
//				F0 = F1;
//				F1 = Fn;
//				Fn = F0 + F1;
//			}
//		Quy nap Fibonacci
		if(n <=2) {
			return 1;
		} else {
			int Fn = fib(n-1) + fib(n-2);
			return Fn;
		}
	}
}
