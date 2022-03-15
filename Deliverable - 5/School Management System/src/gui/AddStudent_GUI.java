package gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import clas.SchoolClass;

import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JButton;

import main.Main_Control;
import subject.SchoolSubject;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AddStudent_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTxtField;
	private JTextField nameTxtField;
	private JPasswordField passField;
	private JComboBox<classComboItem> classCombo;
	private JButton addBtn;
	
	@SuppressWarnings({ "rawtypes", "unchecked" })	
	public AddStudent_GUI(JFrame prevFrm, Main_Control mainControl) {
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
		contentPane.add(verticalBox_1);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox_1.add(verticalGlue);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_1);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_1);
		
		JLabel lblNewLabel_1 = new JLabel("Username:       ");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_1.add(lblNewLabel_1);
		
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
		
		JLabel lblNewLabel_1_1 = new JLabel("Name:              ");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_2.add(lblNewLabel_1_1);
		
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
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password:        ");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_3.add(lblNewLabel_1_1_1);
		
		passField = new JPasswordField();
		passField.setPreferredSize(new Dimension(200, 30));
		passField.setMinimumSize(new Dimension(100, 5));
		passField.setMaximumSize(new Dimension(200, 30));
		passField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		passField.setColumns(20);
		horizontalBox_3.add(passField);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_7);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_1);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_4);
		
		Component horizontalGlue_8 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_8);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Select Class:    ");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_4.add(lblNewLabel_1_1_1_1);
		
		
		classCombo = new JComboBox<classComboItem>();
		addComboClass(mainControl.getClasses());
		classCombo.setToolTipText("\r\n");
		classCombo.setBackground(Color.WHITE);
		classCombo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		classCombo.setPreferredSize(new Dimension(200, 30));
		classCombo.setMinimumSize(new Dimension(100, 5));
		classCombo.setMaximumSize(new Dimension(200, 30));
		horizontalBox_4.add(classCombo);
		
		Component horizontalGlue_9 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_9);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_3);
		
		Box horizontalBox_7 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_7);
		
		Component horizontalGlue_13 = Box.createHorizontalGlue();
		horizontalBox_7.add(horizontalGlue_13);
		
		addBtn = new JButton("Add");
		addBtn.setEnabled(false);
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainControl.addStudent(nameTxtField.getText(), usernameTxtField.getText(), new String(passField.getPassword()), ((classComboItem)classCombo.getSelectedItem()).getName());
				JOptionPane.showMessageDialog(frm, "Student Added Successfully!");
			}
		});
		addBtn.setPreferredSize(new Dimension(100, 50));
		addBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_7.add(addBtn);
		
		classCombo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (classCombo.getSelectedIndex() != 0) {
					addBtn.setEnabled(true);
				}
				else {
					addBtn.setEnabled(false);
				}
			}
		});
		
		Component horizontalGlue_12 = Box.createHorizontalGlue();
		horizontalBox_7.add(horizontalGlue_12);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox_1.add(verticalGlue_1);
		
		JLabel lblNewLabel = new JLabel("Add Student");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
	}
	
	private class classComboItem{
		private String name;
		private int roomNo;
		
		public classComboItem(String name, int roomNo) {
			setName(name);
			setRoomNo(roomNo);
		}

		public String getName() {
			return name;
		}
		
		public int getRoomNo() {
			return roomNo;
		}
		
		public void setName(String name) {
			this.name = name;
		}

		public void setRoomNo(int roomNo) {
			this.roomNo = roomNo;
		}
		
		public String toString() {
			if (getRoomNo() != 0) {				
				return getName() + " - " + getRoomNo();
			}
			else {
				return getName();
			}
		}
	}
	
	private void addComboClass(ArrayList<SchoolClass> classes) {
		classCombo.addItem(new classComboItem("Select Class", 0));
		for (SchoolClass schoolClass: classes) {
			classCombo.addItem(new classComboItem(schoolClass.getName(), schoolClass.getRoomNo()));
		}
	}

}
