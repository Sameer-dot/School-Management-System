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
import java.awt.TextArea;
import javax.swing.JMenuBar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

public class AssignTask_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AssignTask_GUI frame = new AssignTask_GUI();
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
	public AssignTask_GUI() {
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
		
		JLabel lblNewLabel_1 = new JLabel("Class:       ");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_1.add(lblNewLabel_1);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		horizontalStrut_5.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_5);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select Class"}));
		comboBox_1.setToolTipText("\r\n");
		comboBox_1.setPreferredSize(new Dimension(200, 30));
		comboBox_1.setMinimumSize(new Dimension(100, 5));
		comboBox_1.setMaximumSize(new Dimension(300, 400));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_1.setBackground(Color.WHITE);
		horizontalBox_1.add(comboBox_1);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_2);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Subject:   ");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_2.add(lblNewLabel_1_1);
		
		Component horizontalStrut_5_1 = Box.createHorizontalStrut(20);
		horizontalStrut_5_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_2.add(horizontalStrut_5_1);
		
		JComboBox comboBox_1_1 = new JComboBox();
		comboBox_1_1.setModel(new DefaultComboBoxModel(new String[] {"Select Subject"}));
		comboBox_1_1.setToolTipText("\r\n");
		comboBox_1_1.setPreferredSize(new Dimension(200, 30));
		comboBox_1_1.setMinimumSize(new Dimension(100, 5));
		comboBox_1_1.setMaximumSize(new Dimension(300, 400));
		comboBox_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		comboBox_1_1.setBackground(Color.WHITE);
		horizontalBox_2.add(comboBox_1_1);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_5);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		verticalBox_1.add(verticalGlue_2);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_3);
		
		Component horizontalGlue_6 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_6);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Title: ");
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_3.add(lblNewLabel_1_1_1);
		
		Component horizontalStrut_5_2 = Box.createHorizontalStrut(20);
		horizontalStrut_5_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox_3.add(horizontalStrut_5_2);
		
		textField_2 = new JTextField();
		textField_2.setPreferredSize(new Dimension(200, 30));
		textField_2.setMinimumSize(new Dimension(100, 5));
		textField_2.setMaximumSize(new Dimension(200, 30));
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setColumns(20);
		horizontalBox_3.add(textField_2);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_7);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_2);
		
		Box horizontalBox_6 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_6);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_6.add(horizontalGlue_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Description:   ");
		lblNewLabel_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_6.add(lblNewLabel_1_1_2);
		
		Component horizontalStrut_5_3 = Box.createHorizontalStrut(20);
		horizontalStrut_5_3.setMaximumSize(new Dimension(20, 0));
		horizontalBox_6.add(horizontalStrut_5_3);
		
		TextArea textArea = new TextArea();
		horizontalBox_6.add(textArea);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_6.add(horizontalGlue_3);
		
		Component verticalStrut_5 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_5);
		
		Box horizontalBox_4 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_4);
		
		Component horizontalGlue_8 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_8);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Marks: ");
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_4.add(lblNewLabel_1_1_1_1);
		
		Component horizontalStrut_5_4 = Box.createHorizontalStrut(20);
		horizontalStrut_5_4.setMaximumSize(new Dimension(20, 0));
		horizontalBox_4.add(horizontalStrut_5_4);
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(200, 30));
		textField.setMinimumSize(new Dimension(100, 5));
		textField.setMaximumSize(new Dimension(200, 30));
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setColumns(20);
		horizontalBox_4.add(textField);
		
		Component horizontalGlue_9 = Box.createHorizontalGlue();
		horizontalBox_4.add(horizontalGlue_9);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_1);
		
		Box horizontalBox_7 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_7);
		
		Component horizontalGlue_13 = Box.createHorizontalGlue();
		horizontalBox_7.add(horizontalGlue_13);
		
		JButton btnNewButton_1 = new JButton("Assign");
		btnNewButton_1.setPreferredSize(new Dimension(100, 50));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_7.add(btnNewButton_1);
		
		Component horizontalGlue_12 = Box.createHorizontalGlue();
		horizontalBox_7.add(horizontalGlue_12);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox_1.add(verticalGlue_1);
		
		JLabel lblNewLabel = new JLabel("Assign Task");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
	}

}
