package lesson63;

import java.util.Queue;
import java.util.LinkedList;

public class ViduQueue {
	public static void main (String[] args) {
		Queue<String> danhsachSV = new LinkedList<String>();
		
		danhsachSV.offer("TITV 1");
		danhsachSV.offer("Nguyen Van A");
		danhsachSV.offer("Nguyen Van B");
		danhsachSV.offer("TITV 2");
		
		while(true) {
			String ten = danhsachSV.poll();
			if(ten==null) {
				break;
			}
		
		
		//peek => lấy ra nhưng không xóa
		
		System.out.println(ten);
		
		
		}
		
		
	}

}
