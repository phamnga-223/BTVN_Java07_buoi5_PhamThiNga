package baiTap;

/**
 * Câu 2: Tìm số nguyên dương n nhỏ nhất sao cho
 * 1 + 2 + ... + n > 10000
 */
public class Cau2 {

	public static void main(String[] args) {
		int sum = 1;
		int n = 1;
		
		//B1: Tính tổng các số, nếu tổng <= 10000 thì tiếp tục tính tổng và tăng n
		do {
			n++;
			sum += n;
		} while (sum <= 10000);
		
		//B2: In ra kết quả
		System.out.println("Số nguyên dương n nhỏ nhất thỏa mãn là: " + n);
		System.out.println("Tổng là: " + sum);
	}
	
}
