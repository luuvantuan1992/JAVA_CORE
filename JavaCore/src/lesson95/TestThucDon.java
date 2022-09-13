package lesson95;

import javax.swing.UIManager;

import lesson95.ThucDonView;

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