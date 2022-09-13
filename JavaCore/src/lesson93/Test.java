package lesson93;

import javax.swing.UIManager;

import lesson93.MenuExampleView;

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
