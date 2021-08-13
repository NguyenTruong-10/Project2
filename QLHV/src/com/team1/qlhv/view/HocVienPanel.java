package com.team1.qlhv.view;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.SystemColor;

public class HocVienPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField jtextSearch;

	/**
	 * Create the panel.
	 */
	public HocVienPanel() {
		setBackground(SystemColor.menu);
		setLayout(null);
		JPanel jpnRoot = new JPanel();
		jpnRoot.setBounds(10, 10, 697, 409);
		add(jpnRoot);
		jpnRoot.setLayout(null);
		JButton btnAdd = new JButton("+ Th\u00EAm m\u1EDBi");
		btnAdd.setFont(new Font("Arial", Font.PLAIN, 14));
		btnAdd.setBounds(566, 5, 121, 38);
		jpnRoot.add(btnAdd);
		
		jtextSearch = new JTextField();
		jtextSearch.setFont(new Font("Arial", Font.PLAIN, 14));
		jtextSearch.setBounds(10, 6, 269, 37);
		jpnRoot.add(jtextSearch);
		jtextSearch.setColumns(10);
		
		JPanel jpnView = new JPanel();
		jpnView.setBounds(10, 53, 677, 346);
		jpnRoot.add(jpnView);
		jpnView.setLayout(null);
		
		

	}
}
