package gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Main_Control;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

@SuppressWarnings("serial")
public class ChangePass_GUI extends JFrame {

	private JPanel contentPane;
	private JPasswordField oldPassField;
	private JPasswordField newPassField;
	private JPasswordField confirmPassField;

	public ChangePass_GUI(JFrame prevFrm, Main_Control mainControl) {
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
		
		JLabel lblNewLabel = new JLabel("Change Password");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue);
		
		JLabel lblNewLabel_1 = new JLabel("Old Password:       ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.BLACK);
		horizontalBox.add(lblNewLabel_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut);

		oldPassField = new JPasswordField();
		oldPassField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		oldPassField.setPreferredSize(new Dimension(200, 30));
		oldPassField.setMinimumSize(new Dimension(100, 5));
		oldPassField.setMaximumSize(new Dimension(200, 30));
		horizontalBox.add(oldPassField);
		oldPassField.setColumns(20);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_1);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("New Password:     ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setForeground(Color.BLACK);
		horizontalBox_1.add(lblNewLabel_1_1);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_1);
		
		newPassField = new JPasswordField();
		newPassField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		newPassField.setPreferredSize(new Dimension(200, 30));
		newPassField.setMinimumSize(new Dimension(100, 5));
		newPassField.setMaximumSize(new Dimension(200, 30));
		newPassField.setColumns(20);
		horizontalBox_1.add(newPassField);
		
		Component horizontalGlue_1_1 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_1_1);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_1);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Confirm Password: ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setForeground(Color.BLACK);
		horizontalBox_2.add(lblNewLabel_1_2);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2.add(horizontalStrut_2);
		
		confirmPassField = new JPasswordField();
		confirmPassField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		confirmPassField.setPreferredSize(new Dimension(200, 30));
		confirmPassField.setMinimumSize(new Dimension(100, 5));
		confirmPassField.setMaximumSize(new Dimension(200, 30));
		confirmPassField.setColumns(20);
		horizontalBox_2.add(confirmPassField);
		
		Component horizontalGlue_1_2 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_1_2);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_2);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_4);
		
		JButton changeBtn = new JButton("Change");
		changeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String oldPass = new String(oldPassField.getPassword());
				String newPass = new String(newPassField.getPassword());
				String confirmPass = new String(confirmPassField.getPassword());

				if (!mainControl.getPassword().equals(oldPass)) {
					JOptionPane.showMessageDialog(frm,"Incorrect Old Password!");			
				}
				else {
					if (newPass.equals(confirmPass)) {
						mainControl.changePassword(newPass);
						JOptionPane.showMessageDialog(frm,"Password Changed Successfully!");	
						
						prevFrm.setBounds(frm.getLocation().x, frm.getLocation().y, frm.getWidth(), frm.getHeight());
						prevFrm.setVisible(true);
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(frm,"Password Not Matched!");				
					}
				}
			}
		});
		changeBtn.setPreferredSize(new Dimension(100, 50));
		horizontalBox_3.add(changeBtn);
		
		Component horizontalGlue_1_3 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_1_3);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
	}

}
