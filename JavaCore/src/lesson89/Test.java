package lesson89;

import javax.swing.UIManager;

import lesson89.MenuExampleView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MenuExampleView();
		} catch (Exception ex) {
			ex.printStackTrace();
		}	
	}
}