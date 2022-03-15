package gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import main.Main_Control;
import user.Portal;

import javax.swing.Box;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class StudentViewInfo_GUI extends JFrame {

	private JPanel contentPane;
	private JTable subjectsTable;

	public StudentViewInfo_GUI(JFrame prevFrm, Main_Control mainControl) {
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
		
		JLabel lblNewLabel = new JLabel("Student View Information");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(300, 0));
		horizontalStrut_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut_2);
		
		JLabel nameLabel = new JLabel("Name:      ");
		nameLabel.setMaximumSize(new Dimension(100, 25));
		nameLabel.setForeground(Color.BLACK);
		nameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox.add(nameLabel);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 50));
		horizontalBox.add(horizontalStrut);
		
		JLabel nameTxtLabel = new JLabel("");
		nameTxtLabel.setForeground(Color.BLACK);
		nameTxtLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox.add(nameTxtLabel);
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_1);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		Component horizontalStrut_2_1 = Box.createHorizontalStrut(20);
		horizontalStrut_2_1.setPreferredSize(new Dimension(300, 0));
		horizontalStrut_2_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_2_1);
		
		JLabel usernameLabel = new JLabel("UserName:");
		usernameLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		usernameLabel.setForeground(Color.BLACK);
		usernameLabel.setMinimumSize(new Dimension(25, 13));
		usernameLabel.setMaximumSize(new Dimension(100, 25));
		horizontalBox_1.add(usernameLabel);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 50));
		horizontalBox_1.add(horizontalStrut_1);
		
		JLabel usernameTxtLabel = new JLabel("");
		usernameTxtLabel.setForeground(Color.BLACK);
		usernameTxtLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1.add(usernameTxtLabel);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_3);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_2);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_4);
		
		JScrollPane scrollPane = new JScrollPane();
		horizontalBox_2.add(scrollPane);
		
		subjectsTable = new JTable();
		subjectsTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Subjects"
			}
		) {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class
			};
			@SuppressWarnings("unchecked")
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		scrollPane.setViewportView(subjectsTable);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_5);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);

		Portal portal = mainControl.getStudentInfo();
		usernameTxtLabel.setText(portal.getUsername());
		nameTxtLabel.setText(portal.getName());
	}
}
