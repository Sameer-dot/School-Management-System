package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JMenuBar;

public class AddClass_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddClass_GUI frame = new AddClass_GUI();
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
	public AddClass_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(btnNewButton_1);
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
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(200, 30));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setMinimumSize(new Dimension(100, 5));
		textField.setMaximumSize(new Dimension(200, 30));
		horizontalBox.add(textField);
		textField.setColumns(20);
		
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
		
		textField_1 = new JTextField();
		textField_1.setPreferredSize(new Dimension(200, 30));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setMinimumSize(new Dimension(100, 5));
		textField_1.setMaximumSize(new Dimension(200, 30));
		textField_1.setColumns(20);
		horizontalBox_1.add(textField_1);
		
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
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Subject", "Teacher"
			}
		));
		scrollPane.setViewportView(table);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_4);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_2);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Subject"}));
		comboBox.setPreferredSize(new Dimension(200, 30));
		comboBox.setMinimumSize(new Dimension(100, 5));
		comboBox.setMaximumSize(new Dimension(300, 100));
		horizontalBox_3.add(comboBox);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox_3.add(horizontalStrut);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Teacher"}));
		comboBox_1.setPreferredSize(new Dimension(200, 30));
		comboBox_1.setMinimumSize(new Dimension(100, 5));
		comboBox_1.setMaximumSize(new Dimension(300, 100));
		horizontalBox_3.add(comboBox_1);
		
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_6);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_2);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_4);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_7);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setPreferredSize(new Dimension(100, 50));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_4.add(btnNewButton);
		
		Component horizontalGlue_8 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_8);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
	}

}
