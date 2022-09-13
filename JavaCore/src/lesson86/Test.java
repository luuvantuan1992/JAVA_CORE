package lesson86;

import javax.swing.UIManager;

import lesson86.TimKiemView;

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