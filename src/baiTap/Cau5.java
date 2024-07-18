package baiTap;

import java.util.Scanner;

/**
 * Câu 5. Tính và in số năm chờ đợi ít nhất của a X để đủ tiền mua 1 ô tô.
 * Giả sử lãi suất tiết kiệm không đổi, a X ko rút bớt tiền, ko gửi thêm tiền
 * trong thời gian chờ đợi.
 */
public class Cau5 {

	static final double laiSuat = 6; //Lãi suất: 6%/năm
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//B1: Nhập số tiền gửi, số tiền cần mua ô tô
		System.out.println("Xin vui lòng nhập số tiền gửi và tiền cần mua ô tô:");
		System.out.print("Tiền gửi: ");
		long tienGui = scanner.nextLong(); //Tiền gửi
		System.out.print("Tiền cần mua ô tô: ");
		long tienOTo = scanner.nextLong();//Tiền cần mua ô tô	
		
		//Kiểm tra số tiền nhập vào
		if (tienGui <= 0 || tienOTo <= 0) {
			System.out.println("Số tiền nhập vào không hợp lệ!");
			return;
		}
		
		long tongTien = tienGui;		
		int namGui = 0;
		
		//B2: Tính số năm gửi và tổng tiền. 
		//Nếu số tiền < tiền mua ô tô thì tiếp tục gửi tiền
		while (tongTien < tienOTo) {
			namGui++;
			tongTien += tongTien * laiSuat/100;			
		}
		
		System.out.println("Kết quả: Sau ít nhất " + namGui + " năm, anh X sẽ đủ tiền mua ô tô.");
	}
	
}
