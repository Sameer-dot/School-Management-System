package gui;
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

import main.Main_Control;

import javax.swing.JMenuBar;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class ViewReport_GUI extends JFrame {

	private JPanel contentPane;
	private JTable table;

	public ViewReport_GUI(JFrame prevFrm, Main_Control mainControl) {
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
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_4);
		
		Component horizontalGlue_8 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_8);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Subject:  ");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_4.add(lblNewLabel_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Subject"}));
		comboBox.setToolTipText("\r\n");
		comboBox.setBackground(Color.WHITE);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox.setPreferredSize(new Dimension(200, 30));
		comboBox.setMinimumSize(new Dimension(100, 5));
		comboBox.setMaximumSize(new Dimension(300, 400));
		horizontalBox_4.add(comboBox);
		
		Component horizontalGlue_9 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_9);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_1);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue);
		
		JScrollPane scrollPane = new JScrollPane();
		horizontalBox_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name", "Teacher Name", "Total Marks", "Obtain Marks", "Remarks"
			}
		));
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scrollPane.setViewportView(table);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_1);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_1);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_2);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_3);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.setPreferredSize(new Dimension(100, 50));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_2.add(btnNewButton_1);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_2);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox_1.add(verticalGlue_1);
		
		JLabel lblNewLabel = new JLabel("View Report");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
	}

}
