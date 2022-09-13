package lesson49;

import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhập vào chuỗi: ");
		s = sc.nextLine();
		System.out.println("------");
		
		// Hàm length() => lấy độ dài chuỗi
		
		System.out.println(s.length());
		int doDai = s.length();
		
		// Hàm charAt(vi tri) => lấy ra 1 ký tự tại vị trí
		
		for(int i=0;i<=s.length();i++);
		byte[] arrayBytes = s.getBytes();
		for (byte b : arrayBytes) {
			System.out.println(b);
		}
	}
}

