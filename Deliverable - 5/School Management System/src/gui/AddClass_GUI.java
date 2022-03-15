package gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import main.Main_Control;
import subject.SchoolSubject;
import user.TeacherPortal;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AddClass_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField classNameTxtField;
	private JTextField roomNoTxtField;
	private JTable subTeachTable;
	private JComboBox<subjectComboItem> subjectsCombo;
	private JComboBox<teacherComboItem> teacherCombo;

	public AddClass_GUI(JFrame prevFrm, Main_Control mainControl) {
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
		
		JLabel lblNewLabel = new JLabel("Add Class");
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
		
		JLabel lblNewLabel_1 = new JLabel("Class Name:     ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.BLACK);
		horizontalBox.add(lblNewLabel_1);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut_1);
		
		classNameTxtField = new JTextField();
		classNameTxtField.setPreferredSize(new Dimension(200, 30));
		classNameTxtField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		classNameTxtField.setMinimumSize(new Dimension(100, 5));
		classNameTxtField.setMaximumSize(new Dimension(200, 30));
		horizontalBox.add(classNameTxtField);
		classNameTxtField.setColumns(20);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_1);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Room Number: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setForeground(Color.BLACK);
		horizontalBox_1.add(lblNewLabel_1_1);
		
		Component horizontalStrut_1_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_1_1);
		
		roomNoTxtField = new JTextField();
		roomNoTxtField.setPreferredSize(new Dimension(200, 30));
		roomNoTxtField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		roomNoTxtField.setMinimumSize(new Dimension(100, 5));
		roomNoTxtField.setMaximumSize(new Dimension(200, 30));
		roomNoTxtField.setColumns(20);
		horizontalBox_1.add(roomNoTxtField);
		
		Component horizontalGlue_1_1 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_1_1);
		
		Component verticalGlue_3 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_3);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_3);
		
		JScrollPane scrollPane = new JScrollPane();
		horizontalBox_2.add(scrollPane);
		
		subTeachTable = new JTable();
		subTeachTable.setModel(new DefaultTableModel(null, new String[]{"Subject Name", "Subject Code", "Teacher Name", "Teacher Username"}));
		scrollPane.setViewportView(subTeachTable);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_4);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_2);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_5);
		
		subjectsCombo = new JComboBox<subjectComboItem>();
		addComboSubjects(mainControl.getSubjects());
		subjectsCombo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		subjectsCombo.setPreferredSize(new Dimension(200, 30));
		subjectsCombo.setMinimumSize(new Dimension(100, 5));
		subjectsCombo.setMaximumSize(new Dimension(300, 100));
		horizontalBox_3.add(subjectsCombo);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox_3.add(horizontalStrut);
		
		teacherCombo = new JComboBox<teacherComboItem>();
		teacherCombo.addItem(new teacherComboItem("Select Teacher", null));
		teacherCombo.setEnabled(false);
		teacherCombo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		teacherCombo.setPreferredSize(new Dimension(200, 30));
		teacherCombo.setMinimumSize(new Dimension(100, 5));
		teacherCombo.setMaximumSize(new Dimension(300, 100));
		horizontalBox_3.add(teacherCombo);
		
		Component horizontalStrut_5_1_3 = Box.createHorizontalStrut(20);
		horizontalBox_3.add(horizontalStrut_5_1_3);
		horizontalStrut_5_1_3.setMaximumSize(new Dimension(20, 0));
		
		JButton addSubjectBtn = new JButton("Add Subject");
		addSubjectBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subjectComboItem subItem = (subjectComboItem) subjectsCombo.getSelectedItem();
				teacherComboItem teachItem = (teacherComboItem) teacherCombo.getSelectedItem();
				
				DefaultTableModel model = (DefaultTableModel) subTeachTable.getModel();
				model.addRow(new String[] {subItem.getName(), subItem.getCode(), teachItem.getName(), teachItem.getUsername()});
				
				subjectsCombo.removeItemAt(subjectsCombo.getSelectedIndex());
				teacherCombo.removeAllItems();
				teacherCombo.addItem(new teacherComboItem("Select Teacher", null));
				teacherCombo.setSelectedIndex(0);
				subjectsCombo.setSelectedIndex(0);
			}
		});
		horizontalBox_3.add(addSubjectBtn);
		addSubjectBtn.setPreferredSize(new Dimension(100, 50));
		addSubjectBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		addSubjectBtn.setEnabled(false);
		
		subjectsCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (subjectsCombo.getSelectedIndex() == 0) {
					teacherCombo.setEnabled(false);
				}
				else {
					addComboTeachers(mainControl.getTeachers(((subjectComboItem)subjectsCombo.getSelectedItem()).getCode()));
					teacherCombo.setEnabled(true);
					teacherCombo.setSelectedIndex(0);
				}
			}
		});
		
		teacherCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (teacherCombo.getSelectedIndex() == 0) {
					addSubjectBtn.setEnabled(false);
				}
				else {
					addSubjectBtn.setEnabled(true);
				}
			}
		});
		
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_6);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_2);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_4);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_7);
		
		JButton addBtn = new JButton("Add");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String[]> list = new ArrayList<>();
				
				for(int i = 0;i<subTeachTable.getModel().getRowCount();i++){
					list.add(new String[] {(String) subTeachTable.getModel().getValueAt(i,1), (String) subTeachTable.getModel().getValueAt(i, 3)});
				}
				
				mainControl.addClass(classNameTxtField.getText(), Integer.parseInt(roomNoTxtField.getText()), list);
				JOptionPane.showMessageDialog(frm, "Class Added Successfully!");
			}
		});
		addBtn.setPreferredSize(new Dimension(100, 50));
		addBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_4.add(addBtn);
		
		Component horizontalGlue_8 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_8);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
	}
	
	private class subjectComboItem{
		private String name;
		private String code;
		
		public subjectComboItem(String name, String code) {
			setName(name);
			setCode(code);
		}

		public String getName() {
			return name;
		}
		
		public String getCode() {
			return code;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public void setCode(String code) {
			this.code = code;
		}
		
		public String toString() {
			if (getCode() != null) {				
				return getName() + " - " + getCode();
			}
			else {
				return getName();
			}
		}
	}
	
	private class teacherComboItem{
		private String username;
		private String name;
		
		public teacherComboItem(String name, String username) {
			setName(name);
			setUsername(username);
		}

		public String getUsername() {
			return username;
		}
		
		public String getName() {
			return name;
		}
		
		public void setUsername(String username) {
			this.username = username;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public String toString() {
			if (getUsername() != null) {				
				return getName() + " - " + getUsername();
			}
			else {
				return getName();
			}
		}
	}
	
	private void addComboSubjects(ArrayList<SchoolSubject> subjects) {
		subjectsCombo.addItem(new subjectComboItem("Select Subject", null));
		for (SchoolSubject subject: subjects) {
			subjectsCombo.addItem(new subjectComboItem(subject.getName(), subject.getCode()));
		}
	}

	private void addComboTeachers(ArrayList<TeacherPortal> teachers) {
		teacherCombo.removeAllItems();
		teacherCombo.addItem(new teacherComboItem("Select Teacher", null));
		for (TeacherPortal teacher: teachers) {
			teacherCombo.addItem(new teacherComboItem(teacher.getName(), teacher.getUsername()));
		}
		teacherCombo.setSelectedIndex(0);
	}
}
