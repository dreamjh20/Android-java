package frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;

public class LoginFrame extends BaseFrame {

	private JTextField tfName = new JTextField();
	private JPasswordField tfPasswd = new JPasswordField();
	
	public LoginFrame() {
		super("�α���", 300, 200);
		
		setLayout(null);
		
		JLabel lbTitle = new JLabel("������ �α���", JLabel.CENTER);
		JLabel lbName = new JLabel("�̸�");
		JLabel lbPasswd = new JLabel("��й�ȣ");

		JButton btnOk = new JButton("Ȯ��");
		JButton btnClose = new JButton("����");
		
		JPanel pnlCenter = new JPanel(new GridLayout(2, 2, -80, 10));
		JPanel pnlSouth = new JPanel();
		
		pnlCenter.add(lbName);
		pnlCenter.add(tfName);
		pnlCenter.add(lbPasswd);
		pnlCenter.add(tfPasswd);
		
		pnlSouth.add(btnOk);
		pnlSouth.add(btnClose);
		
		lbTitle.setFont(new Font("����", Font.PLAIN, 24));
		
		lbTitle.setBounds(0, 0, 285, 30);
		pnlCenter.setBounds(50, 50, 200, 50);
		pnlSouth.setBounds(0, 120, 285, 40);
		
		add(lbTitle);
		add(pnlCenter);
		add(pnlSouth);
		
//		btnOk.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				
//			}
//		});
		
		btnOk.addActionListener(e -> login());
	}

	public static void main(String[] args) {
//		LoginFrame frame = new LoginFrame();
//		frame.setVisible(true);
		
		new LoginFrame().setVisible(true);
	}

	private void login() {
		String name = tfName.getText();
		String passwd = tfPasswd.getText();
		
		if (name.isEmpty() || passwd.isEmpty()) {
			eMessage("��ĭ�� ä���ּ���.");
		} else {
			try {
				ResultSet rs = dbManager.executeQuery("SELECT * FROM admin WHERE name = ? AND passwd = ?", name, passwd);
				
				if (rs.next()) {
					//String jumin = rs.getString(4);
					iMessage("�α��� ����");
				} else {
					eMessage("�α��� ����");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
