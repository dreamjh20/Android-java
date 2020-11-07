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
		super("로그인", 300, 200);
		
		setLayout(null);
		
		JLabel lbTitle = new JLabel("관리자 로그인", JLabel.CENTER);
		JLabel lbName = new JLabel("이름");
		JLabel lbPasswd = new JLabel("비밀번호");

		JButton btnOk = new JButton("확인");
		JButton btnClose = new JButton("종료");
		
		JPanel pnlCenter = new JPanel(new GridLayout(2, 2, -80, 10));
		JPanel pnlSouth = new JPanel();
		
		pnlCenter.add(lbName);
		pnlCenter.add(tfName);
		pnlCenter.add(lbPasswd);
		pnlCenter.add(tfPasswd);
		
		pnlSouth.add(btnOk);
		pnlSouth.add(btnClose);
		
		lbTitle.setFont(new Font("굴림", Font.PLAIN, 24));
		
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
			eMessage("빈칸을 채워주세요.");
		} else {
			try {
				ResultSet rs = dbManager.executeQuery("SELECT * FROM admin WHERE name = ? AND passwd = ?", name, passwd);
				
				if (rs.next()) {
					//String jumin = rs.getString(4);
					iMessage("로그인 성공");
				} else {
					eMessage("로그인 실패");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
