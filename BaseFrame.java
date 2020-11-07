package frame;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import db.DbManager;

public class BaseFrame extends JFrame {

	protected DbManager dbManager = new DbManager();
	
	public BaseFrame(String title, int width, int height) {
		setTitle(title);
		setSize(width, height);
		setLocationRelativeTo(null);
	}
	
	protected void iMessage(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	protected void eMessage(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Error", JOptionPane.ERROR_MESSAGE);
	}
}
