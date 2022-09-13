package lesson99;

import javax.swing.UIManager;

import lesson99.MyNotepadView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyNotepadView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}