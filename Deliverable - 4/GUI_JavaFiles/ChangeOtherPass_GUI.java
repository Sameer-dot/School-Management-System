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
import javax.swing.JTextPane;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import java.awt.Color;

public class ChangeOtherPass_GUI extends JFrame {

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
					ChangeOtherPass_GUI frame = new ChangeOtherPass_GUI();
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
	public ChangeOtherPass_GUI() {
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
		
		JLabel lblNewLabel = new JLabel("Change Other Password");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalStrut_4 = Box.createVerticalStrut(20);
		verticalStrut_4.setPreferredSize(new Dimension(0, 100));
		verticalBox.add(verticalStrut_4);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setPreferredSize(new Dimension(200, 30));
		textField.setMinimumSize(new Dimension(100, 5));
		textField.setMaximumSize(new Dimension(200, 30));
		horizontalBox.add(textField);
		textField.setColumns(20);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut_1);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.setPreferredSize(new Dimension(100, 50));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox.add(btnNewButton);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_1);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(295);
		horizontalStrut_5.setPreferredSize(new Dimension(300, 0));
		horizontalStrut_5.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_5);
		
		JLabel lblNewLabel_2 = new JLabel("Username: ");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_1.add(lblNewLabel_2);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1.add(lblNewLabel_3);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_3);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		Box horizontalBox_1_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1_1);
		
		Component horizontalStrut_5_1 = Box.createHorizontalStrut(295);
		horizontalStrut_5_1.setPreferredSize(new Dimension(300, 0));
		horizontalStrut_5_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1_1.add(horizontalStrut_5_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Name:       ");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_1_1.add(lblNewLabel_2_1);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1_1.add(horizontalStrut_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1_1.add(lblNewLabel_3_1);
		
		Component horizontalGlue_3_1 = Box.createHorizontalGlue();
		horizontalBox_1_1.add(horizontalGlue_3_1);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_2);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_4);
		
		JLabel lblNewLabel_1 = new JLabel("New Password:     ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.BLACK);
		horizontalBox_2.add(lblNewLabel_1);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2.add(horizontalStrut_2);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setPreferredSize(new Dimension(200, 30));
		textField_1.setMinimumSize(new Dimension(100, 5));
		textField_1.setMaximumSize(new Dimension(200, 30));
		horizontalBox_2.add(textField_1);
		textField_1.setColumns(20);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_5);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_2);
		
		Box horizontalBox_2_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2_1);
		
		Component horizontalGlue_4_1 = Box.createHorizontalGlue();
		horizontalBox_2_1.add(horizontalGlue_4_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Confirm Password: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setForeground(Color.BLACK);
		horizontalBox_2_1.add(lblNewLabel_1_1);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2_1.add(horizontalStrut_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setPreferredSize(new Dimension(200, 30));
		textField_2.setMinimumSize(new Dimension(100, 5));
		textField_2.setMaximumSize(new Dimension(200, 30));
		textField_2.setColumns(20);
		horizontalBox_2_1.add(textField_2);
		
		Component horizontalGlue_5_1 = Box.createHorizontalGlue();
		horizontalBox_2_1.add(horizontalGlue_5_1);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut_3);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_6);
		
		JButton btnNewButton_1 = new JButton("Change");
		btnNewButton_1.setPreferredSize(new Dimension(100, 50));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_3.add(btnNewButton_1);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_7);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
	}

}
