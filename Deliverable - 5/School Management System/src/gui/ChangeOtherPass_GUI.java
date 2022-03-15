package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Main_Control;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChangeOtherPass_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField searchUserTxtField;
	private JTextField passwordField;
	private JTextField confirmPasswordField;

	public ChangeOtherPass_GUI(JFrame prevFrm, Main_Control mainControl) {
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
		
		JLabel lblNewLabel = new JLabel("Change Other Password");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		verticalStrut_4.setPreferredSize(new Dimension(0, 100));
		verticalBox.add(verticalStrut_4);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue);
		
		searchUserTxtField = new JTextField();
		searchUserTxtField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		searchUserTxtField.setPreferredSize(new Dimension(200, 30));
		searchUserTxtField.setMinimumSize(new Dimension(100, 5));
		searchUserTxtField.setMaximumSize(new Dimension(200, 30));
		horizontalBox.add(searchUserTxtField);
		searchUserTxtField.setColumns(20);
		
		Component horizontalStrut_1_2 = Box.createHorizontalStrut(20);
		horizontalStrut_1_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut_1_2);
		
//		JComboBox<subjectComboItem> usertypeCombo = new JComboBox<subjectComboItem>();
//		usertypeCombo.setPreferredSize(new Dimension(200, 30));
//		usertypeCombo.setMinimumSize(new Dimension(100, 5));
//		usertypeCombo.setMaximumSize(new Dimension(300, 100));
//		usertypeCombo.setFont(new Font("Tahoma", Font.PLAIN, 12));
//		horizontalBox.add(usertypeCombo);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut_1);
		
		JButton searchBtn = new JButton("Search");
		searchBtn.setPreferredSize(new Dimension(100, 50));
		searchBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox.add(searchBtn);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_1);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(295);
		horizontalStrut_5.setPreferredSize(new Dimension(300, 0));
		horizontalStrut_5.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_5);
		
		JLabel lblNewLabel_2 = new JLabel("Username: ");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_1.add(lblNewLabel_2);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut);
		
		JLabel usernameTxtLabel = new JLabel("");
		usernameTxtLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1.add(usernameTxtLabel);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_3);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		Box horizontalBox_1_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1_1);
		
		Component horizontalStrut_5_1 = Box.createHorizontalStrut(295);
		horizontalStrut_5_1.setPreferredSize(new Dimension(300, 0));
		horizontalStrut_5_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1_1.add(horizontalStrut_5_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Name:       ");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_1_1.add(lblNewLabel_2_1);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1_1.add(horizontalStrut_4);
		
		JLabel nameTxtLabel = new JLabel("");
		nameTxtLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1_1.add(nameTxtLabel);
		
		Component horizontalGlue_3_1 = Box.createHorizontalGlue();
		horizontalBox_1_1.add(horizontalGlue_3_1);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_2);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_4);
		
		JLabel lblNewLabel_1 = new JLabel("New Password:     ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.BLACK);
		horizontalBox_2.add(lblNewLabel_1);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2.add(horizontalStrut_2);
		
		passwordField = new JTextField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setPreferredSize(new Dimension(200, 30));
		passwordField.setMinimumSize(new Dimension(100, 5));
		passwordField.setMaximumSize(new Dimension(200, 30));
		horizontalBox_2.add(passwordField);
		passwordField.setColumns(20);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_5);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_2);
		
		Box horizontalBox_2_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2_1);
		
		Component horizontalGlue_4_1 = Box.createHorizontalGlue();
		horizontalBox_2_1.add(horizontalGlue_4_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Confirm Password: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setForeground(Color.BLACK);
		horizontalBox_2_1.add(lblNewLabel_1_1);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2_1.add(horizontalStrut_3);
		
		confirmPasswordField = new JTextField();
		confirmPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		confirmPasswordField.setPreferredSize(new Dimension(200, 30));
		confirmPasswordField.setMinimumSize(new Dimension(100, 5));
		confirmPasswordField.setMaximumSize(new Dimension(200, 30));
		confirmPasswordField.setColumns(20);
		horizontalBox_2_1.add(confirmPasswordField);
		
		Component horizontalGlue_5_1 = Box.createHorizontalGlue();
		horizontalBox_2_1.add(horizontalGlue_5_1);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_3);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_6);
		
		JButton btnNewButton_1 = new JButton("Change");
		btnNewButton_1.setPreferredSize(new Dimension(100, 50));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_3.add(btnNewButton_1);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_7);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
	}

}
