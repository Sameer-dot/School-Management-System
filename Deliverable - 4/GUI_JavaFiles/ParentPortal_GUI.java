package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ParentPortal_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ParentPortal_GUI frame = new ParentPortal_GUI();
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
	public ParentPortal_GUI() {
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
		
		JLabel lblNewLabel = new JLabel("Parent Portal");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.WHITE);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setPreferredSize(new Dimension(0, 150));
		verticalBox.add(horizontalBox_1);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_2);
		
		JButton btnNewButton_2 = new JButton("View Info");
		horizontalBox_1.add(btnNewButton_2);
		btnNewButton_2.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_2.setMinimumSize(new Dimension(50, 20));
		btnNewButton_2.setPreferredSize(new Dimension(150, 100));
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_1);
		
		JButton btnNewButton_4 = new JButton("View Task");
		btnNewButton_4.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_4.setMinimumSize(new Dimension(50, 20));
		btnNewButton_4.setPreferredSize(new Dimension(150, 100));
		horizontalBox_1.add(btnNewButton_4);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut);
		
		JButton btnNewButton_1 = new JButton("View Attendence");
		horizontalBox_1.add(btnNewButton_1);
		btnNewButton_1.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setPreferredSize(new Dimension(150, 100));
		btnNewButton_1.setMinimumSize(new Dimension(50, 20));
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_3);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setPreferredSize(new Dimension(0, 150));
		verticalBox.add(horizontalBox_2);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_4);
		
		JButton btnViewReport = new JButton("View Report");
		btnViewReport.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnViewReport.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnViewReport.setPreferredSize(new Dimension(150, 100));
		btnViewReport.setMinimumSize(new Dimension(50, 20));
		horizontalBox_2.add(btnViewReport);
		
		Component horizontalStrut_2_1 = Box.createHorizontalStrut(20);
		horizontalStrut_2_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2.add(horizontalStrut_2_1);
		
		JButton btnNewButton_5 = new JButton("Apply for Leave");
		horizontalBox_2.add(btnNewButton_5);
		btnNewButton_5.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_5.setMinimumSize(new Dimension(50, 20));
		btnNewButton_5.setPreferredSize(new Dimension(150, 100));
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2.add(horizontalStrut_2);
		
		JButton btnNewButton_3 = new JButton("Change Password");
		horizontalBox_2.add(btnNewButton_3);
		btnNewButton_3.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_3.setPreferredSize(new Dimension(150, 100));
		btnNewButton_3.setMinimumSize(new Dimension(50, 20));
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_5);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		horizontalBox_3.setPreferredSize(new Dimension(0, 150));
		verticalBox.add(horizontalBox_3);
		
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_6);
		
		JButton btnNewButton_6 = new JButton("Log Out");
		btnNewButton_6.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_6.setBackground(Color.RED);
		btnNewButton_6.setPreferredSize(new Dimension(150, 100));
		btnNewButton_6.setMinimumSize(new Dimension(50, 20));
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_3.add(btnNewButton_6);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_7);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		}
}
