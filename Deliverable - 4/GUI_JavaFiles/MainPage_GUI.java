package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;

public class MainPage_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage_GUI frame = new MainPage_GUI();
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
	public MainPage_GUI() {
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
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue);
		
		JButton btnNewButton_1 = new JButton("Admin");
		btnNewButton_1.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setMinimumSize(new Dimension(50, 20));
		btnNewButton_1.setPreferredSize(new Dimension(150, 100));
		horizontalBox.add(btnNewButton_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut);
		
		JButton btnNewButton_1_3 = new JButton("Student");
		btnNewButton_1_3.setPreferredSize(new Dimension(150, 100));
		btnNewButton_1_3.setMinimumSize(new Dimension(50, 20));
		btnNewButton_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_3.setBorder(new EmptyBorder(50, 10, 50, 10));
		horizontalBox.add(btnNewButton_1_3);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_1);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_2);
		
		JButton btnNewButton_1_4 = new JButton("Teacher");
		btnNewButton_1_4.setPreferredSize(new Dimension(150, 100));
		btnNewButton_1_4.setMinimumSize(new Dimension(50, 20));
		btnNewButton_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_4.setBorder(new EmptyBorder(50, 10, 50, 10));
		horizontalBox_1.add(btnNewButton_1_4);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_1);
		
		JButton btnNewButton_1_5 = new JButton("Parent");
		btnNewButton_1_5.setPreferredSize(new Dimension(150, 100));
		btnNewButton_1_5.setMinimumSize(new Dimension(50, 20));
		btnNewButton_1_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1_5.setBorder(new EmptyBorder(50, 10, 50, 10));
		horizontalBox_1.add(btnNewButton_1_5);
		
		Component horizontalGlue_1_1 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_1_1);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
	}

}
