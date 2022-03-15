package gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import main.Main_Control;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AdminPortal_GUI extends JFrame {

	private JPanel contentPane;

	public AdminPortal_GUI(JFrame prevFrm, Main_Control mainControl) {
		JFrame frm = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Admin Portal");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setPreferredSize(new Dimension(0, 150));
		verticalBox.add(horizontalBox_1);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_2);
		
		JButton addStudentBtn = new JButton("Add Student");
		addStudentBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddStudent_GUI nextFrm = new AddStudent_GUI(frm, mainControl);
				nextFrm.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				nextFrm.setVisible(true);
				setVisible(false);
			}
		});
		horizontalBox_1.add(addStudentBtn);
		addStudentBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		addStudentBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addStudentBtn.setMinimumSize(new Dimension(50, 20));
		addStudentBtn.setPreferredSize(new Dimension(150, 100));
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut);
		
		JButton addClassBtn = new JButton("Add Class");
		addClassBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddClass_GUI nextFrm = new AddClass_GUI(frm, mainControl);
				nextFrm.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				nextFrm.setVisible(true);
				setVisible(false);
			}
		});
		horizontalBox_1.add(addClassBtn);
		addClassBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		addClassBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addClassBtn.setPreferredSize(new Dimension(150, 100));
		addClassBtn.setMinimumSize(new Dimension(50, 20));
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_1);
		
		JButton addSubjectBtn = new JButton("Add Subject");
		addSubjectBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddSubject_GUI nextFrm = new AddSubject_GUI(frm, mainControl);
				nextFrm.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				nextFrm.setVisible(true);
				setVisible(false);
			}
		});
		addSubjectBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		addSubjectBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addSubjectBtn.setMinimumSize(new Dimension(50, 20));
		addSubjectBtn.setPreferredSize(new Dimension(150, 100));
		horizontalBox_1.add(addSubjectBtn);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_3);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setPreferredSize(new Dimension(0, 150));
		verticalBox.add(horizontalBox_2);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_4);
		
		JButton addTeacherBtn = new JButton("Add Teacher");
		addTeacherBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddTeacher_GUI nextFrm = new AddTeacher_GUI(frm, mainControl);
				nextFrm.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				nextFrm.setVisible(true);
				setVisible(false);
			}
		});
		horizontalBox_2.add(addTeacherBtn);
		addTeacherBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		addTeacherBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addTeacherBtn.setPreferredSize(new Dimension(150, 100));
		addTeacherBtn.setMinimumSize(new Dimension(50, 20));
		
		Component horizontalStrut_1_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2.add(horizontalStrut_1_1);
		
		JButton btnViewReport = new JButton("Add Parent");
		btnViewReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddParent_GUI nextFrm = new AddParent_GUI(frm, mainControl);
				nextFrm.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				nextFrm.setVisible(true);
				setVisible(false);
			}
		});
		btnViewReport.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnViewReport.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnViewReport.setPreferredSize(new Dimension(150, 100));
		btnViewReport.setMinimumSize(new Dimension(50, 20));
		horizontalBox_2.add(btnViewReport);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2.add(horizontalStrut_2);
		
		JButton btnNewButton_5 = new JButton("Change Other Pass");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangeOtherPass_GUI nextFrm = new ChangeOtherPass_GUI(frm, mainControl);
				nextFrm.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				nextFrm.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_5.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_5.setMinimumSize(new Dimension(50, 20));
		btnNewButton_5.setPreferredSize(new Dimension(150, 100));
		horizontalBox_2.add(btnNewButton_5);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_5);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		horizontalBox_3.setPreferredSize(new Dimension(0, 150));
		verticalBox.add(horizontalBox_3);
		
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_6);
		
		JButton logoutBtn = new JButton("Log Out");
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prevFrm.setBounds(frm.getLocation().x, frm.getLocation().y, frm.getWidth(), frm.getHeight());
				prevFrm.setVisible(true);
				dispose();
			}
		});
		logoutBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		logoutBtn.setBackground(Color.RED);
		logoutBtn.setPreferredSize(new Dimension(150, 100));
		logoutBtn.setMinimumSize(new Dimension(50, 20));
		logoutBtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_3.add(logoutBtn);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_7);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
	}

}
