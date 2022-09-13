package lesson87;

import javax.swing.UIManager;

import lesson87.MouseExampleView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MouseExampleView();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
}
