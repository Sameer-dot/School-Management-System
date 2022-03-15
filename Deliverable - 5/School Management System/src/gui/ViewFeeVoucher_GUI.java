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
import javax.swing.JMenuBar;
import javax.swing.JButton;

public class ViewFeeVoucher_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewFeeVoucher_GUI frame = new ViewFeeVoucher_GUI();
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
	public ViewFeeVoucher_GUI() {
		setForeground(Color.GRAY);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton = new JButton("<");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(btnNewButton);
		contentPane = new JPanel();
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("View Fee Voucher");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(50, 0));
		horizontalBox.add(horizontalStrut_2);
		
		JLabel lblNewLabel_1 = new JLabel("Username: ");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox.add(lblNewLabel_1);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox.add(lblNewLabel_2);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setPreferredSize(new Dimension(50, 0));
		horizontalBox_1.add(horizontalStrut_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Name: ");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_1.add(lblNewLabel_1_1);
		
		Component horizontalStrut_5_1 = Box.createHorizontalStrut(20);
		horizontalStrut_5_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_5_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1.add(lblNewLabel_2_1);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_1);
		
		Box horizontalBox_1_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1_1);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setPreferredSize(new Dimension(50, 0));
		horizontalBox_1_1.add(horizontalStrut_3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Father's Name: ");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_1_1.add(lblNewLabel_1_1_1);
		
		Component horizontalStrut_5_2 = Box.createHorizontalStrut(20);
		horizontalStrut_5_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1_1.add(horizontalStrut_5_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1_1.add(lblNewLabel_2_1_1);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_1_1.add(horizontalGlue_2);
		
		Box horizontalBox_1_1_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1_1_1);
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		horizontalStrut_4.setPreferredSize(new Dimension(50, 0));
		horizontalBox_1_1_1.add(horizontalStrut_4);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Date: ");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_1_1_1.add(lblNewLabel_1_1_1_1);
		
		Component horizontalStrut_5_3 = Box.createHorizontalStrut(20);
		horizontalStrut_5_3.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1_1_1.add(horizontalStrut_5_3);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1_1_1.add(lblNewLabel_2_1_1_1);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_1_1_1.add(horizontalGlue_3);
		
		Box horizontalBox_1_1_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1_1_2);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setPreferredSize(new Dimension(50, 0));
		horizontalBox_1_1_2.add(horizontalStrut);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Fee: ");
		lblNewLabel_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_1_1_2.add(lblNewLabel_1_1_1_2);
		
		Component horizontalStrut_5_4 = Box.createHorizontalStrut(20);
		horizontalStrut_5_4.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1_1_2.add(horizontalStrut_5_4);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("");
		lblNewLabel_2_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1_1_2.add(lblNewLabel_2_1_1_2);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_1_1_2.add(horizontalGlue_4);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
	}

}
