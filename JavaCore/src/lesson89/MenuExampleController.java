package lesson89;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lesson89.MenuExampleView;

public class MenuExampleController implements ActionListener{
	private MenuExampleView menuExampleView;
	
	
	
	public MenuExampleController(MenuExampleView menuExampleView) {
		this.menuExampleView = menuExampleView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String button = e.getActionCommand();
		
		if(button.equals("Open")) {
			this.menuExampleView.setTextJLabel("Bạn đã click JmenuItem Open");
		}else if(button.equals("Exit")) {
			//this.menuExampleView.setTextJLabel("Bạn đã click JmenuItem Exit");
			System.exit(0);
		}else if(button.equals("Welcome")) {
			this.menuExampleView.setTextJLabel("Bạn đã click JmenuItem Welcome");
		}
	}

}
