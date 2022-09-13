package lesson85;

import javax.swing.UIManager;

import lesson85.TimKiemView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new TimKiemView();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
}