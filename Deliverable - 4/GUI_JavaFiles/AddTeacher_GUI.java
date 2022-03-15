package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
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
import java.awt.ScrollPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class AddTeacher_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddTeacher_GUI frame = new AddTeacher_GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddTeacher_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton_2 = new JButton("<");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(btnNewButton_2);
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
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(200, 30));
		textField.setMinimumSize(new Dimension(100, 5));
		textField.setMaximumSize(new Dimension(200, 30));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1.add(textField);
		textField.setColumns(20);
		
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
		
		textField_1 = new JTextField();
		textField_1.setPreferredSize(new Dimension(200, 30));
		textField_1.setMinimumSize(new Dimension(100, 5));
		textField_1.setMaximumSize(new Dimension(200, 30));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(20);
		horizontalBox_2.add(textField_1);
		
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
		
		textField_2 = new JTextField();
		textField_2.setPreferredSize(new Dimension(200, 30));
		textField_2.setMinimumSize(new Dimension(100, 5));
		textField_2.setMaximumSize(new Dimension(200, 30));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(20);
		horizontalBox_3.add(textField_2);
		
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Subject"}));
		comboBox.setToolTipText("\r\n");
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setPreferredSize(new Dimension(200, 30));
		comboBox.setMinimumSize(new Dimension(100, 5));
		comboBox.setMaximumSize(new Dimension(200, 30));
		horizontalBox_4.add(comboBox);
		
		Component horizontalStrut_5_1_3 = Box.createHorizontalStrut(20);
		horizontalStrut_5_1_3.setMaximumSize(new Dimension(20, 0));
		horizontalBox_4.add(horizontalStrut_5_1_3);
		
		JButton btnNewButton = new JButton("Add Subject");
		horizontalBox_4.add(btnNewButton);
		btnNewButton.setPreferredSize(new Dimension(100, 50));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		Component horizontalGlue_9 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_9);
		
		Box horizontalBox_5 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_5);
		
		Component horizontalGlue_10 = Box.createHorizontalGlue();
		horizontalBox_5.add(horizontalGlue_10);
		
		Component horizontalGlue_11 = Box.createHorizontalGlue();
		horizontalBox_5.add(horizontalGlue_11);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_2);
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_6);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_6.add(horizontalGlue_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setMinimumSize(new Dimension(25, 25));
		scrollPane_1.setMaximumSize(new Dimension(10000, 10000));
		horizontalBox_6.add(scrollPane_1);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Assigned Subjects"
			}
		));
		scrollPane_1.setViewportView(table);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_6.add(horizontalGlue_3);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_5);
		
		Box horizontalBox_7 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_7);
		
		Component horizontalGlue_13 = Box.createHorizontalGlue();
		horizontalBox_7.add(horizontalGlue_13);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setPreferredSize(new Dimension(100, 50));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_7.add(btnNewButton_1);
		
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

}
