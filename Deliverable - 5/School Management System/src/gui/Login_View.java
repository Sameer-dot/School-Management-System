package gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Main_Control;
import user.AdminPortal;
import user.ParentPortal;
import user.Portal;
import user.StudentPortal;
import user.TeacherPortal;
import user.UserType;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class Login_View extends JFrame {

	private JPanel contentPane;
	private JTextField unameTxtField;
	private JButton loginBtn;
	private UserType userType;
	private JPasswordField passwordField;
	private JLabel loginLabel;

	public Login_View(JFrame prevFrm, Main_Control mainControl) {
		JFrame frm = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton backBtn = new JButton("<");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prevFrm.setBounds(frm.getLocation().x, frm.getLocation().y, frm.getWidth(), frm.getHeight());
				prevFrm.setVisible(true);
				dispose();
			}
		});
		backBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(backBtn);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		loginLabel = new JLabel("Login");
		loginLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		loginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		loginLabel.setForeground(Color.BLACK);
		contentPane.add(loginLabel, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue);
		
		JLabel unameLabel = new JLabel("Username: ");
		unameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		unameLabel.setForeground(Color.BLACK);
		horizontalBox.add(unameLabel);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut);
		
		unameTxtField = new JTextField();
		unameTxtField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		unameTxtField.setPreferredSize(new Dimension(200, 30));
		unameTxtField.setMinimumSize(new Dimension(100, 5));
		unameTxtField.setMaximumSize(new Dimension(300, 100));
		horizontalBox.add(unameTxtField);
		unameTxtField.setColumns(20);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_1);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_2);
		
		JLabel passLabel = new JLabel("Password: ");
		passLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		passLabel.setForeground(Color.BLACK);
		horizontalBox_1.add(passLabel);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_1);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(20);
		passwordField.setMinimumSize(new Dimension(100, 5));
		passwordField.setPreferredSize(new Dimension(200, 30));
		passwordField.setMaximumSize(new Dimension(300, 100));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1.add(passwordField);
		
		Component horizontalGlue_1_1 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_1_1);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_1);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_3);
		
		loginBtn = new JButton("Login");
		loginBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JFrame nextFrm = null;
//				Portal portal = null;
				
				if (userType.equals(UserType.Student)) {
//					portal = new StudentPortal();
					nextFrm = new StudentPortal_GUI(prevFrm, mainControl);
				}
				else if (userType.equals(UserType.Teacher)) {
//					portal = new TeacherPortal();
					nextFrm = new TeacherPortal_GUI(prevFrm);
				}
				else if (userType.equals(UserType.Admin)) {
//					portal = new AdminPortal();
					nextFrm = new AdminPortal_GUI(prevFrm, mainControl);
				}
				else if (userType.equals(UserType.Parent)) {
//					portal = new ParentPortal();
					nextFrm = new ParentPortal_GUI(prevFrm);
				}
//				mainControl.setPortal(portal);
				
				if (mainControl.login(unameTxtField.getText(), new String(passwordField.getPassword()), userType)) {
					JOptionPane.showMessageDialog(frm,"Login Successfull!");
					
					nextFrm.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
					nextFrm.setVisible(true);
					setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(frm,"Login Failed!");
				}
			}
		});
		loginBtn.setPreferredSize(new Dimension(100, 50));
		loginBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_2.add(loginBtn);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_4);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
	}
	
	public void addLoginListener(ActionListener a) {
		loginBtn.addActionListener(a);
	}
	
	public void setUserType(UserType userType) {
		this.userType = userType;
		loginLabel.setText(userType.name() + ' ' + loginLabel.getText());
	}
	
	public UserType getUserType() {
		return userType;
	}
	
	public void addListener(ActionListener a) {
		loginBtn.addActionListener(a);
	}
}
