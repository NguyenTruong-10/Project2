package com.team1.qlhv.bean;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DanhMucBean {
	private String kind;
	private JPanel jPanel;
	private JLabel jLabel;
	
	public DanhMucBean(String kind, JPanel jPanel, JLabel jLabel) {
		super();
		this.kind = kind;
		this.jPanel = jPanel;
		this.jLabel = jLabel;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public JPanel getjPanel() {
		return jPanel;
	}
	public void setjPanel(JPanel jPanel) {
		this.jPanel = jPanel;
	}
	public JLabel getjLabel() {
		return jLabel;
	}
	public void setjLabel(JLabel jLabel) {
		this.jLabel = jLabel;
	}
	
}
