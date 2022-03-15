package gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import main.Main_Control;
import subject.SchoolSubject;
import subject.Subject;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AddTeacher_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTxtField;
	private JTextField nameTxtField;
	private JPasswordField passwordField;
	private JTable subjectsTable;
	private JComboBox<subjectComboItem> subjectCombo;
	private JButton addSubjectBtn;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public AddTeacher_GUI(JFrame prevFrm, Main_Control mainControl) {
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
		
		Box verticalBox_1 = Box.createVerticalBox();
		contentPane.add(verticalBox_1, BorderLayout.CENTER);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox_1.add(verticalGlue);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_1);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_1);
		
		JLabel lblNewLabel_1 = new JLabel("Username: ");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_1.add(lblNewLabel_1);
		
		Component horizontalStrut_5_1 = Box.createHorizontalStrut(20);
		horizontalStrut_5_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_5_1);
		
		usernameTxtField = new JTextField();
		usernameTxtField.setPreferredSize(new Dimension(200, 30));
		usernameTxtField.setMinimumSize(new Dimension(100, 5));
		usernameTxtField.setMaximumSize(new Dimension(200, 30));
		usernameTxtField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1.add(usernameTxtField);
		usernameTxtField.setColumns(20);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_2);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name:       ");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_2.add(lblNewLabel_1_1);
		
		Component horizontalStrut_5_1_1 = Box.createHorizontalStrut(20);
		horizontalStrut_5_1_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2.add(horizontalStrut_5_1_1);
		
		nameTxtField = new JTextField();
		nameTxtField.setPreferredSize(new Dimension(200, 30));
		nameTxtField.setMinimumSize(new Dimension(100, 5));
		nameTxtField.setMaximumSize(new Dimension(200, 30));
		nameTxtField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		nameTxtField.setColumns(20);
		horizontalBox_2.add(nameTxtField);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_5);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_4);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_3);
		
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_6);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password: ");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_3.add(lblNewLabel_1_1_1);
		
		Component horizontalStrut_5_1_2 = Box.createHorizontalStrut(20);
		horizontalStrut_5_1_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox_3.add(horizontalStrut_5_1_2);
		
		passwordField = new JPasswordField();
		passwordField.setPreferredSize(new Dimension(200, 30));
		passwordField.setMinimumSize(new Dimension(100, 5));
		passwordField.setMaximumSize(new Dimension(200, 30));
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passwordField.setColumns(20);
		horizontalBox_3.add(passwordField);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_7);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		verticalBox_1.add(verticalGlue_2);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_4);
		
		Component horizontalGlue_8 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_8);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Assign Subject:  ");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_4.add(lblNewLabel_1_1_1_1);
		
		Component horizontalStrut_5_1_4 = Box.createHorizontalStrut(20);
		horizontalStrut_5_1_4.setMaximumSize(new Dimension(20, 0));
		horizontalBox_4.add(horizontalStrut_5_1_4);
		
		subjectCombo = new JComboBox();
		addComboSubjects(mainControl.getSubjects());
		subjectCombo.setBackground(Color.WHITE);
		subjectCombo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		subjectCombo.setPreferredSize(new Dimension(200, 30));
		subjectCombo.setMinimumSize(new Dimension(100, 5));
		subjectCombo.setMaximumSize(new Dimension(200, 30));
		horizontalBox_4.add(subjectCombo);
		
		Component horizontalStrut_5_1_3 = Box.createHorizontalStrut(20);
		horizontalStrut_5_1_3.setMaximumSize(new Dimension(20, 0));
		horizontalBox_4.add(horizontalStrut_5_1_3);
		
		addSubjectBtn = new JButton("Add Subject");
		addSubjectBtn.setEnabled(false);
		addSubjectBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				subjectComboItem item = (subjectComboItem) subjectCombo.getSelectedItem();
				
				DefaultTableModel model = (DefaultTableModel) subjectsTable.getModel();
				model.addRow(new String[] {item.getName(), item.getCode()});
				
				subjectCombo.removeItemAt(subjectCombo.getSelectedIndex());
				subjectCombo.setSelectedIndex(0);
			}
		});
		horizontalBox_4.add(addSubjectBtn);
		addSubjectBtn.setPreferredSize(new Dimension(100, 50));
		addSubjectBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));

		subjectCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (subjectCombo.getSelectedIndex() == 0) {
					addSubjectBtn.setEnabled(false);
				}
				else {
					addSubjectBtn.setEnabled(true);
				}
			}
		});
		
		Component horizontalGlue_9 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_9);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_2);
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_5);
		
		Component horizontalGlue_10 = Box.createHorizontalGlue();
		horizontalBox_5.add(horizontalGlue_10);
		
		JLabel lblNewLabel_2 = new JLabel("Assigned Subjects");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_5.add(lblNewLabel_2);
		
		Component horizontalGlue_11 = Box.createHorizontalGlue();
		horizontalBox_5.add(horizontalGlue_11);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_1);
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_6);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_6.add(horizontalGlue_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setMinimumSize(new Dimension(25, 25));
		scrollPane_1.setMaximumSize(new Dimension(10000, 10000));
		horizontalBox_6.add(scrollPane_1);
		
		subjectsTable = new JTable(new DefaultTableModel(null, new String[]{"Subject Name", "Subject Code"}));
		scrollPane_1.setViewportView(subjectsTable);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_6.add(horizontalGlue_3);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_5);
		
		Box horizontalBox_7 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_7);
		
		Component horizontalGlue_13 = Box.createHorizontalGlue();
		horizontalBox_7.add(horizontalGlue_13);
		
		JButton addBtn = new JButton("Add");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> list = new ArrayList<>();
				for(int i = 0;i<subjectsTable.getModel().getRowCount();i++){
				    list.add((String) subjectsTable.getModel().getValueAt(i,1));
				}
				mainControl.addTeacher(nameTxtField.getText(), usernameTxtField.getText(), new String(passwordField.getPassword()), list);
				JOptionPane.showMessageDialog(frm, "Teacher Added Successfully!");
			}
		});
		addBtn.setPreferredSize(new Dimension(100, 50));
		addBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_7.add(addBtn);
		
		Component horizontalGlue_12 = Box.createHorizontalGlue();
		horizontalBox_7.add(horizontalGlue_12);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox_1.add(verticalGlue_1);
		
		JLabel lblNewLabel = new JLabel("Add Teacher");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
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
	
	private void addComboSubjects(ArrayList<SchoolSubject> subjects) {
		subjectCombo.addItem(new subjectComboItem("Select Subject", null));
		for (SchoolSubject subject: subjects) {
			subjectCombo.addItem(new subjectComboItem(subject.getName(), subject.getCode()));
		}
	}

}
