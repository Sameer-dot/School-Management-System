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

public class AddSubject_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddSubject_GUI frame = new AddSubject_GUI();
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
	public AddSubject_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(btnNewButton);
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
		
		JLabel lblNewLabel_1 = new JLabel("Name: ");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_1.add(lblNewLabel_1);
		
		Component horizontalStrut_5_1_1 = Box.createHorizontalStrut(20);
		horizontalStrut_5_1_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_5_1_1);
		
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
		
		JLabel lblNewLabel_1_1 = new JLabel("Code:   ");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_2.add(lblNewLabel_1_1);
		
		Component horizontalStrut_5_1_1_1 = Box.createHorizontalStrut(20);
		horizontalStrut_5_1_1_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2.add(horizontalStrut_5_1_1_1);
		
		textField_1 = new JTextField();
		textField_1.setPreferredSize(new Dimension(200, 30));
		textField_1.setMinimumSize(new Dimension(100, 5));
		textField_1.setMaximumSize(new Dimension(200, 30));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(20);
		horizontalBox_2.add(textField_1);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_5);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_1);
		
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
		
		JLabel lblNewLabel = new JLabel("Add Subject");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
	}

}
