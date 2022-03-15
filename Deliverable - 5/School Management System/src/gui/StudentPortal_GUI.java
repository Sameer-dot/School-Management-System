package gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.Main_Control;

import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.Box;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class StudentPortal_GUI extends JFrame {

	private JPanel contentPane;

	public StudentPortal_GUI(JFrame prevFrm, Main_Control mainControl) {
		JFrame frm = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Student Portal");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setPreferredSize(new Dimension(0, 150));
		verticalBox.add(horizontalBox);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_2);
		
		JButton viewInfoBtn = new JButton("View Information");
		viewInfoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StudentViewInfo_GUI nextFrm = new StudentViewInfo_GUI(frm, mainControl);
				nextFrm.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				nextFrm.setVisible(true);
				setVisible(false);
			}
		});
		viewInfoBtn.setMinimumSize(new Dimension(50, 20));
		viewInfoBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		viewInfoBtn.setPreferredSize(new Dimension(150, 100));
		viewInfoBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		viewInfoBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox.add(viewInfoBtn);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut);
		
		JButton viewTaskBtn = new JButton("View Task");
		viewTaskBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewTask_GUI nextFrm = new ViewTask_GUI(frm, mainControl);
				nextFrm.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				nextFrm.setVisible(true);
				setVisible(false);
			}
		});
		viewTaskBtn.setMinimumSize(new Dimension(50, 20));
		viewTaskBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		viewTaskBtn.setPreferredSize(new Dimension(150, 100));
		viewTaskBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		viewTaskBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox.add(viewTaskBtn);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut_1);
		
		JButton viewAttendanceBtn = new JButton("View Attendance");
		viewAttendanceBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewAttendance_GUI nextFrm = new ViewAttendance_GUI(frm, mainControl);
				nextFrm.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				nextFrm.setVisible(true);
				setVisible(false);
			}
		});
		viewAttendanceBtn.setMinimumSize(new Dimension(50, 20));
		viewAttendanceBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		viewAttendanceBtn.setPreferredSize(new Dimension(150, 23));
		viewAttendanceBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		viewAttendanceBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox.add(viewAttendanceBtn);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_3);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setPreferredSize(new Dimension(0, 150));
		verticalBox.add(horizontalBox_1);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_4);
		
		JButton viewReportBtn = new JButton("View Report");
		viewReportBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewReport_GUI nextFrm = new ViewReport_GUI(frm, mainControl);
				nextFrm.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				nextFrm.setVisible(true);
				setVisible(false);
			}
		});
		viewReportBtn.setMinimumSize(new Dimension(50, 20));
		viewReportBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		viewReportBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		viewReportBtn.setPreferredSize(new Dimension(150, 100));
		viewReportBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1.add(viewReportBtn);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_2);
		
		JButton viewLeaveBtn = new JButton("View Leaves");
		viewLeaveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});

		viewLeaveBtn.setMinimumSize(new Dimension(50, 20));
		viewLeaveBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		viewLeaveBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		viewLeaveBtn.setPreferredSize(new Dimension(150, 23));
		viewLeaveBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1.add(viewLeaveBtn);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_3);
		
		JButton chngPassBtn = new JButton("Change Password");
		chngPassBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChangePass_GUI nextFrm = new ChangePass_GUI(frm, mainControl);
				nextFrm.setBounds(getLocation().x, getLocation().y, getWidth(), getHeight());
				nextFrm.setVisible(true);
				setVisible(false);
			}
		});
		chngPassBtn.setMinimumSize(new Dimension(50, 20));
		chngPassBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		chngPassBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		chngPassBtn.setPreferredSize(new Dimension(150, 23));
		horizontalBox_1.add(chngPassBtn);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_7);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setPreferredSize(new Dimension(0, 150));
		verticalBox.add(horizontalBox_2);
		
		Component horizontalGlue_8 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_8);
		
		JButton logoutBtn = new JButton("Logout");
		logoutBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainControl.logout();
				prevFrm.setBounds(frm.getLocation().x, frm.getLocation().y, frm.getWidth(), frm.getHeight());
				prevFrm.setVisible(true);
				dispose();
			}
		});
		logoutBtn.setBackground(Color.RED);
		logoutBtn.setMinimumSize(new Dimension(150, 100));
		logoutBtn.setBorder(new EmptyBorder(50, 10, 50, 10));
		logoutBtn.setAlignmentX(Component.CENTER_ALIGNMENT);
		logoutBtn.setPreferredSize(new Dimension(150, 100));
		logoutBtn.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_2.add(logoutBtn);
		
		Component horizontalGlue_9 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_9);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
	}
}
