package GUI;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.Font;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SpringLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.Insets;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class TeacherPortal_GUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TeacherPortal_GUI frame = new TeacherPortal_GUI();
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
	public TeacherPortal_GUI() {
		setForeground(Color.GRAY);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton btnNewButton_7 = new JButton("<");
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(btnNewButton_7);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setFont(new Font("Tahoma", Font.PLAIN, 12));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Teacher Portal");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);
		
		Box verticalBox = Box.createVerticalBox();
		contentPane.add(verticalBox, BorderLayout.CENTER);
		
		Component verticalGlue = Box.createVerticalGlue();
		verticalBox.add(verticalGlue);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setPreferredSize(new Dimension(0, 150));
		verticalBox.add(horizontalBox);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_2);
		
		JButton btnNewButton = new JButton("View Information");
		btnNewButton.setMinimumSize(new Dimension(50, 20));
		btnNewButton.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton.setPreferredSize(new Dimension(150, 100));
		btnNewButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox.add(btnNewButton);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut);
		
		JButton btnNewButton_1 = new JButton("Assign Task");
		btnNewButton_1.setMinimumSize(new Dimension(50, 20));
		btnNewButton_1.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_1.setPreferredSize(new Dimension(150, 100));
		btnNewButton_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox.add(btnNewButton_1);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setMaximumSize(new Dimension(20, 0));
		horizontalBox.add(horizontalStrut_1);
		
		JButton btnNewButton_2 = new JButton("Mark Attendance");
		btnNewButton_2.setMinimumSize(new Dimension(50, 20));
		btnNewButton_2.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_2.setPreferredSize(new Dimension(150, 23));
		btnNewButton_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox.add(btnNewButton_2);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_3);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		horizontalBox_1.setPreferredSize(new Dimension(0, 150));
		verticalBox.add(horizontalBox_1);
		
		Component horizontalGlue_4 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_4);
		
		JButton btnNewButton_3 = new JButton("Make Report");
		btnNewButton_3.setMinimumSize(new Dimension(50, 20));
		btnNewButton_3.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_3.setPreferredSize(new Dimension(150, 100));
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1.add(btnNewButton_3);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		horizontalStrut_2.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_2);
		
		JButton btnNewButton_4 = new JButton("View Leaves");
		btnNewButton_4.setMinimumSize(new Dimension(50, 20));
		btnNewButton_4.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_4.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_4.setPreferredSize(new Dimension(150, 23));
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1.add(btnNewButton_4);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		horizontalStrut_3.setMaximumSize(new Dimension(20, 0));
		horizontalBox_1.add(horizontalStrut_3);
		
		JButton btnNewButton_5 = new JButton("Change Password");
		btnNewButton_5.setMinimumSize(new Dimension(50, 20));
		btnNewButton_5.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_5.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_5.setPreferredSize(new Dimension(150, 23));
		horizontalBox_1.add(btnNewButton_5);
		
		Component horizontalGlue_7 = Box.createHorizontalGlue();
		horizontalBox_1.add(horizontalGlue_7);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		horizontalBox_2.setPreferredSize(new Dimension(0, 150));
		verticalBox.add(horizontalBox_2);
		
		Component horizontalGlue_8 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_8);
		
		JButton btnNewButton_6 = new JButton("Logout");
		btnNewButton_6.setBackground(Color.RED);
		btnNewButton_6.setMinimumSize(new Dimension(50, 20));
		btnNewButton_6.setBorder(new EmptyBorder(50, 10, 50, 10));
		btnNewButton_6.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnNewButton_6.setPreferredSize(new Dimension(150, 100));
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_2.add(btnNewButton_6);
		
		Component horizontalGlue_9 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_9);
		
		Component verticalGlue_1 = Box.createVerticalGlue();
		verticalBox.add(verticalGlue_1);
	}
}
