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
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JMenuBar;

public class ChangePass_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePass_GUI frame = new ChangePass_GUI();
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
	public ChangePass_GUI() {
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
		
		JLabel lblNewLabel = new JLabel("Change Password");
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
		
		JLabel lblNewLabel_1 = new JLabel("Old Password:       ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.BLACK);
		horizontalBox.add(lblNewLabel_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setPreferredSize(new Dimension(200, 30));
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
		
		JLabel lblNewLabel_1_1 = new JLabel("New Password:     ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setForeground(Color.BLACK);
		horizontalBox_1.add(lblNewLabel_1_1);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setPreferredSize(new Dimension(200, 30));
		textField_1.setMinimumSize(new Dimension(100, 5));
		textField_1.setMaximumSize(new Dimension(200, 30));
		textField_1.setColumns(20);
		horizontalBox_1.add(textField_1);
		
		Component horizontalGlue_1_1 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_1_1);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_1);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Confirm Password: ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_2.setForeground(Color.BLACK);
		horizontalBox_2.add(lblNewLabel_1_2);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2.add(horizontalStrut_2);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setPreferredSize(new Dimension(200, 30));
		textField_2.setMinimumSize(new Dimension(100, 5));
		textField_2.setMaximumSize(new Dimension(200, 30));
		textField_2.setColumns(20);
		horizontalBox_2.add(textField_2);
		
		Component horizontalGlue_1_2 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_1_2);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_2);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_4);
		
		JButton btnNewButton = new JButton("Change");
		btnNewButton.setPreferredSize(new Dimension(100, 50));
		horizontalBox_3.add(btnNewButton);
		
		Component horizontalGlue_1_3 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_1_3);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
	}

}
