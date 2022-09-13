package lesson96;

import javax.swing.UIManager;

import lesson96.ThucDonView;

public class TestThucDon {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new ThucDonView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}