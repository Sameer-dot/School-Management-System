package gui;
import java.awt.BorderLayout;

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
import javax.swing.JButton;

import main.Main_Control;

import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class AddSubject_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField nameTxt;
	private JTextField codeTxt;

	public AddSubject_GUI(JFrame prevFrm, Main_Control mainControl) {
		JFrame frm = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JButton backBtn = new JButton("<");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				prevFrm.setBounds(frm.getLocation().x, frm.getLocation().y, frm.getWidth(), frm.getHeight());
				prevFrm.setVisible(true);
				dispose();
			}
		});
		backBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		menuBar.add(backBtn);
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
		
		nameTxt = new JTextField();
		nameTxt.setPreferredSize(new Dimension(200, 30));
		nameTxt.setMinimumSize(new Dimension(100, 5));
		nameTxt.setMaximumSize(new Dimension(200, 30));
		nameTxt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_1.add(nameTxt);
		nameTxt.setColumns(20);
		
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
		
		codeTxt = new JTextField();
		codeTxt.setPreferredSize(new Dimension(200, 30));
		codeTxt.setMinimumSize(new Dimension(100, 5));
		codeTxt.setMaximumSize(new Dimension(200, 30));
		codeTxt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		codeTxt.setColumns(20);
		horizontalBox_2.add(codeTxt);
		
		Component horizontalGlue_5 = Box.createHorizontalGlue();
		horizontalBox_2.add(horizontalGlue_5);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		verticalBox_1.add(verticalStrut_1);
		
		Box horizontalBox_7 = Box.createHorizontalBox();
		verticalBox_1.add(horizontalBox_7);
		
		Component horizontalGlue_13 = Box.createHorizontalGlue();
		horizontalBox_7.add(horizontalGlue_13);
		
		JButton addBtn = new JButton("Add");
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainControl.addSubject(nameTxt.getText(), codeTxt.getText());
				JOptionPane.showMessageDialog(frm,"Subject Added!");
			}
		});
		addBtn.setPreferredSize(new Dimension(100, 50));
		addBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		horizontalBox_7.add(addBtn);
		
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
