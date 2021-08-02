
public class capsonhan3chuso {
	public static void main(String[] args) {
		for (double a = 1; a <= 3; a++) {
			for (double c = 1; c <= 9; c++) {
				for (double b = 1; b <= 4; b++)
					if (b == Math.sqrt(a * c)) {
						int x = (int) Math.round(a);
						int y = (int) Math.round(b);
						int z = (int) Math.round(c);
						String s = String.valueOf(x) + String.valueOf(y) + String.valueOf(z) ;
						System.out.println("Cac so co 3 chu so thoa man dieu kien de bai : " + s);
					}
			}
		}
	}
}