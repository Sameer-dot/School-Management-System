package gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Main_Control;
import user.UserType;

import javax.swing.JButton;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Main_View extends JFrame {

	private JPanel contentPane;
	private JButton adminBtn;
	private JButton stdBtn;
	private JButton teachBtn;
	private JButton parentBtn;

	public Main_View(Main_Control mainControl) {
		JFrame frm = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue);
		
		adminBtn = new JButton(UserType.Admin.name());
		adminBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Login_View loginPage = new Login_View(frm, mainControl);
				loginPage.setUserType(UserType.Admin);
				loginPage.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				loginPage.setVisible(true);
				setVisible(false);
			}
		});
		adminBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		adminBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		adminBtn.setMinimumSize(new Dimension(50, 20));
		adminBtn.setPreferredSize(new Dimension(150, 100));
		horizontalBox.add(adminBtn);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut);
		
		stdBtn = new JButton(UserType.Student.name());
		stdBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Login_View loginPage = new Login_View(frm, mainControl);
				loginPage.setUserType(UserType.Student);
				loginPage.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				loginPage.setVisible(true);
				setVisible(false);
			}
		});
		stdBtn.setPreferredSize(new Dimension(150, 100));
		stdBtn.setMinimumSize(new Dimension(50, 20));
		stdBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		stdBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		horizontalBox.add(stdBtn);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_1);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_2);
		
		teachBtn = new JButton(UserType.Teacher.name());
		teachBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Login_View loginPage = new Login_View(frm, mainControl);
				loginPage.setUserType(UserType.Teacher);
				loginPage.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				loginPage.setVisible(true);
				setVisible(false);
			}
		});
		teachBtn.setPreferredSize(new Dimension(150, 100));
		teachBtn.setMinimumSize(new Dimension(50, 20));
		teachBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		teachBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		horizontalBox_1.add(teachBtn);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_1);
		
		parentBtn = new JButton(UserType.Parent.name());
		parentBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Login_View loginPage = new Login_View(frm, mainControl);
				loginPage.setUserType(UserType.Parent);
				loginPage.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				loginPage.setVisible(true);
				setVisible(false);
			}
		});
		parentBtn.setPreferredSize(new Dimension(150, 100));
		parentBtn.setMinimumSize(new Dimension(50, 20));
		parentBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		parentBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		horizontalBox_1.add(parentBtn);
		
		Component horizontalGlue_1_1 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_1_1);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
	}
}
