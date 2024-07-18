package baiTap;

import java.util.Scanner;

/**
 * Câu 4: Chương trình nhập n và tính tổng
 * S(n) = x + x^2 + x^3 + ... + x^n
 */
public class Cau4 {

	public static void main(String[] args) {
		int x = 3;
		
		//B1: Người dùng nhập n
		System.out.println("Xin vui lòng nhập n: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		//B2: Tính tổng
		tinhTong(x, n);
	}
	
	public static void tinhTong(int x, int n) {
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += Math.pow(x, i);
		}
		
		System.out.println("Tổng là: " + sum);
	}
	
}
