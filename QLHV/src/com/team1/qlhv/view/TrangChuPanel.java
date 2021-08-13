package com.team1.qlhv.view;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;

public class TrangChuPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TrangChuPanel() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(10, 10, 938, 549);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 99, 71));
		panel_1.setBounds(10, 10, 299, 210);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("100");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1.setBounds(213, 27, 45, 28);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 63, 123, 100);
		panel_1.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(TrangChuPanel.class.getResource("/com/team1/qlhv/images/baseline_event_white_48dp.png")));
		
		JLabel lblNewLabel_2 = new JLabel("Kh\u00F3a h\u1ECDc");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2.setBounds(167, 103, 91, 41);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBackground(new Color(30, 144, 255));
		panel_1_1.setBounds(319, 10, 299, 210);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("100");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_1_1.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1_1.setBounds(213, 27, 45, 28);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("H\u1ECDc Vi\u00EAn");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setForeground(new Color(255, 250, 250));
		lblNewLabel_2_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(167, 103, 91, 41);
		panel_1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(TrangChuPanel.class.getResource("/com/team1/qlhv/images/baseline_face_white_48dp.png")));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(10, 63, 123, 100);
		panel_1_1.add(lblNewLabel_5);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBackground(new Color(50, 205, 50));
		panel_1_2.setBounds(628, 10, 299, 210);
		panel.add(panel_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("100");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_1_2.setFont(new Font("Arial", Font.BOLD, 24));
		lblNewLabel_1_2.setBounds(213, 27, 45, 28);
		panel_1_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("H\u1ED9p Th\u01B0");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setForeground(new Color(255, 250, 250));
		lblNewLabel_2_2.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_2_2.setBounds(167, 103, 91, 41);
		panel_1_2.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(TrangChuPanel.class.getResource("/com/team1/qlhv/images/baseline_mail_outline_white_48dp.png")));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(10, 64, 123, 100);
		panel_1_2.add(lblNewLabel_7);
		
	}

}
