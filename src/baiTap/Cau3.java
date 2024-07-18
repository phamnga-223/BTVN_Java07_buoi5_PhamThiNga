package baiTap;

import java.util.Scanner;

/**
 * Câu 3: Chương trình tính tổng các số lẻ nguyên dương < n được nhập từ người dùng.
 * Chỉ cho nhập n > 0. 
 * Y/c nhập lại nếu ko đúng y/c.
 */
public class Cau3 {
	
	public static void main(String[] args) {
		int sum = 0;
		
		//B1: Người dùng nhập n, kiểm tra n
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.println("Xin vui lòng nhập số nguyên dương n > 0");
			n = scanner.nextInt();
		} while (n <= 0);
		
		//B2: Tính tổng các số lẻ nguyên dương < n
		for (int i = 1; i < n; i+=2) {
			sum += i;
		}
		
		//B3: In ra kết quả
		System.out.println("Tổng các số lẻ nguyên dương < n là: " + sum);
	}
	
}
