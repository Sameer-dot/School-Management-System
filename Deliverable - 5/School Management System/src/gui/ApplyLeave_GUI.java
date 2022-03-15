package gui;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Box;
import javax.swing.JComboBox;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import java.awt.TextArea;

public class ApplyLeave_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplyLeave_GUI frame = new ApplyLeave_GUI();
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
	public ApplyLeave_GUI() {
		setForeground(Color.GRAY);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton_1 = new JButton("<");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(btnNewButton_1);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Apply for Leave");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		Component horizontalGlue_3_1 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_3_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Subjects: ");
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_2.add(lblNewLabel_1_2);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2.add(horizontalStrut_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Subject"}));
		comboBox.setPreferredSize(new Dimension(200, 30));
		comboBox.setMinimumSize(new Dimension(100, 5));
		comboBox.setMaximumSize(new Dimension(200, 30));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_2.add(comboBox);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_5);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		Box horizontalBox_3_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3_1);
		
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		horizontalBox_3_1.add(horizontalGlue_6);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Title: ");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_3_1.add(lblNewLabel_1_1_1);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_3_1.add(horizontalStrut_1);
		
		textField_1 = new JTextField();
		textField_1.setPreferredSize(new Dimension(200, 30));
		textField_1.setMinimumSize(new Dimension(100, 5));
		textField_1.setMaximumSize(new Dimension(200, 30));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(20);
		horizontalBox_3_1.add(textField_1);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_3_1.add(horizontalGlue_7);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_6);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_6.add(horizontalGlue_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Description: ");
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_6.add(lblNewLabel_1_1_2);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox_6.add(horizontalStrut);
		
		TextArea textArea_1 = new TextArea();
		horizontalBox_6.add(textArea_1);
		
		Component horizontalGlue_3_2 = Box.createHorizontalGlue();
		horizontalBox_6.add(horizontalGlue_3_2);
		
		Component verticalGlue_3 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_3);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_3);
		
		JButton btnNewButton = new JButton("Send");
		btnNewButton.setPreferredSize(new Dimension(100, 50));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_3.add(btnNewButton);
		
		Component horizontalGlue_1_2 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_1_2);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalStrut_1.setPreferredSize(new Dimension(0, 50));
		verticalBox.add(verticalStrut_1);
	}

}
