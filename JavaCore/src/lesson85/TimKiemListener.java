package lesson85;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import lesson85.TimKiemView;

public class TimKiemListener implements ActionListener{
	private TimKiemView timKiemView;
	
	
	
	public TimKiemListener(TimKiemView timKiemView) {
		this.timKiemView = timKiemView;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		this.timKiemView.timKiem();
	}

}



