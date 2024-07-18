package baiTap;

import java.util.Random;
import java.util.Scanner;

/**
 * Câu 1: Chương trình trò chơi oản tù tì (bao, kéo, kim).
 * Người và máy chơi với nhau. Nhấn số khác 0 để chơi tiếp, nhấn 0 để dừng.
 * Tính xem ai thắng nhiều nhất, tỉ số là bao nhiêu?
 */
public class Cau1 {

	static final int KEO = 0;
	static final int BUA = 1;
	static final int BAO = 2;
	
	public static void main(String[] args) {
		int stop;
		int userChoose; int computerChoose;
		int user = 0; int computer = 0;
		
		Random rn = new Random();
		Scanner scanner = new Scanner (System.in);
		do {
			//B1: Người dùng nhập lựa chọn
			System.out.println("Xin vui lòng đưa ra lựa chọn: \n 0: Kéo \n 1: Búa \n 2: Bao");
			userChoose = scanner.nextInt();
			if (userChoose != 0 && userChoose != 1 && userChoose != 2) {
				System.out.println("Lựa chọn không hợp lệ!");
				return;
			}
	
			//B2: Lựa chọn của máy
			computerChoose = rn.nextInt(3);
			switch (computerChoose) {
			case 0: {
				System.out.println("Máy chọn KÉO");
				break;
			}
			case 1: {
				System.out.println("Máy chọn BÚA");
				break;
			}
			case 2: {
				System.out.println("Máy chọn BAO");
				break;
			}
			default:
				System.out.println("Lựa chọn của máy không hợp lệ! (" + computerChoose + ")");
				break;
			}
			
			//B3: Thi đấu
			String winner = winner("Bạn", "Máy", userChoose, computerChoose);
			switch (winner) {
				case "Bạn": 
					user++; break;
				case "Máy":
					computer++; break;
				default:
					break;
			}
						
			//B4 : Người dùng có tiếp tục hay ko?
			System.out.println("------------*____*------------");
			System.out.println("Bạn có muốn tiếp tục không? \n 0: Dừng lại \n Khác 0: Tiếp tục");
			stop = scanner.nextInt();
		} while (stop != 0);
		
		//B5: Tìm người thắng nhiều nhất, đưa ra tỉ số
		if (user > computer) {
			System.out.println("Bạn thắng nhiều nhất với tỉ số: " + user + " - " + computer);
		} else if (user < computer) {
			System.out.println("Máy thắng nhiều nhất với tỉ số: " + computer + " - " + user);
		} else {
			System.out.println("Cả hai hòa với tỉ số: " + user + " - " + computer);
		}
	}
	
	public static String winner (String user1, String user2, int choose1, int choose2) {
		
		String winner = "";
		
		//B1: So sánh 2 lựa chọn
		if (choose1 == KEO) { //TH1: user1 chọn KÉO
			if (choose2 == BUA) {
				winner = user2;
			} else if (choose2 == BAO) {
				winner = user1;
			}
		} else if (choose1 == BUA) { //TH2: user1 chọn BÚA
			if (choose2 == KEO) {
				winner = user1;
			} else if (choose2 == BAO) {
				winner = user2;
			}
		} else {	//TH3: user1 chọn BAO
			if (choose2 == KEO) {
				winner = user2;
			} else if (choose2 == BUA) {
				winner = user1;
			}
		}
		
		//B2: Trả về kết quả
		if (winner == "") {
			System.out.println("Kết quả: HÒA");
		} else {
			System.out.println("Kết quả: " + winner + " thắng!");
		}
		
		return winner;
	}
	
}
