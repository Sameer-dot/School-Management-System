package gui;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class TeacherViewInfo_GUI extends JFrame {

	private JPanel contentPane;
	private JTable table_1;

	@SuppressWarnings({ })
	public TeacherViewInfo_GUI() {
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
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Teacher View Information");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalGlue_2 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_2);
		
		Box horizontalBox_3 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_3);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setPreferredSize(new Dimension(300, 0));
		horizontalStrut_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox_3.add(horizontalStrut_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("Name:      ");
		lblNewLabel_1_2.setMaximumSize(new Dimension(100, 25));
		lblNewLabel_1_2.setForeground(Color.BLACK);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_3.add(lblNewLabel_1_2);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setMaximumSize(new Dimension(20, 50));
		horizontalBox_3.add(horizontalStrut_3);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_3.add(lblNewLabel_2_1_1);
		
		Component horizontalGlue_1_2 = Box.createHorizontalGlue();
		horizontalBox_3.add(horizontalGlue_1_2);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		Box horizontalBox_1_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1_1);
		
		Component horizontalStrut_2_1 = Box.createHorizontalStrut(20);
		horizontalStrut_2_1.setPreferredSize(new Dimension(300, 0));
		horizontalStrut_2_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1_1.add(horizontalStrut_2_1);
		
		JLabel lblNewLabel_2 = new JLabel("UserName:");
		lblNewLabel_2.setMinimumSize(new Dimension(25, 13));
		lblNewLabel_2.setMaximumSize(new Dimension(100, 25));
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		horizontalBox_1_1.add(lblNewLabel_2);
		
		Component horizontalStrut_1_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1_1.setMaximumSize(new Dimension(20, 50));
		horizontalBox_1_1.add(horizontalStrut_1_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1_1.add(lblNewLabel_2_2);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox_1_1.add(horizontalGlue_3);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue);
		
		JScrollPane scrollPane = new JScrollPane();
		horizontalBox_2.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Class", "Subject"
			}
		) {
			@SuppressWarnings("rawtypes")
			Class[] columnTypes = new Class[] {
				String.class, String.class
			};
			@SuppressWarnings({ "unchecked", "rawtypes" })
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
			boolean[] columnEditables = new boolean[] {
				false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		scrollPane.setViewportView(table_1);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_2);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
		
		
	}

}
