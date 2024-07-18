package baiTap;

/**
 * Câu 5. Tính và in số năm chờ đợi ít nhất của a X để đủ tiền mua 1 ô tô.
 * Giả sử lãi suất tiết kiệm không đổi, a X ko rút bớt tiền, ko gửi thêm tiền
 * trong thời gian chờ đợi.
 */
public class Cau5 {

	public static void main(String[] args) {
		long tienGui = 100000000L; //Gửi: 100 triệu
		long tienOTo = 1039000000L;//Tiền mua ô tô MERCEDES C180 AMG 2021: 1,039,000,000 tỷ đồng		
		long tongTien = tienGui;
		double laiSuat = 6;			//Lãi suất: 6%/năm
		int namGui = 0;
		
		//Tính số năm gửi và tổng tiền. 
		//Nếu số tiền < tiền mua ô tô thì tiếp tục gửi tiền
		while (tongTien < tienOTo) {
			namGui++;
			tongTien += tongTien * 6/100;			
		}
		
		System.out.println("Kết quả: Sau ít nhất " + namGui + " năm, anh X sẽ đủ tiền mua ô tô MERCEDES C180 AMG 2021.");
	}
	
}
