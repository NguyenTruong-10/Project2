package com.team1.qlhv.controller;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.team1.qlhv.bean.DanhMucBean;
import com.team1.qlhv.view.*;
public class ChuyenManHinhController {
	private JPanel jpnRoot;
	private String kindSelected = "";
	private List<DanhMucBean> listBean = null;
	public ChuyenManHinhController(JPanel jpnRoot) {
		this.jpnRoot = jpnRoot;
	}
	public void setView(JPanel jpnItem, JLabel jlbItem) {
		kindSelected = "TrangChu";
		jpnItem.setBackground(new Color(96,100,191));
		jlbItem.setBackground(new Color(96,100,191));
		jpnRoot.removeAll();
		jpnRoot.setLayout(new BorderLayout());
		jpnRoot.add(new TrangChuPanel());
		jpnRoot.validate();
		jpnRoot.repaint();
	}
	public void setEvent(List<DanhMucBean> listBean) {
		this.listBean = listBean;
		for(DanhMucBean it : listBean) {
			it.getjLabel().addMouseListener(new LabelEvent(it.getKind(),it.getjPanel(),it.getjLabel()));
			it.getjPanel().addMouseListener(new LabelEvent(it.getKind(),it.getjPanel(),it.getjLabel()));
		}
	}
	class LabelEvent implements MouseListener{
		private JPanel node;
		private String kind;
		private JPanel jpnItem;
		private JLabel jlbItem;
		
		public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
			super();
			this.kind = kind;
			this.jpnItem = jpnItem;
			this.jlbItem = jlbItem;
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			switch(kind) {
			case "TrangChu":
				node = new TrangChuPanel();
				break;
			case "HocVien":
				node = new HocVienPanel();
				break;
			case "KhoaHoc":
				node = new KhoaHocPanel();
				break;
			case "LopHoc":
				node = new LopHocPanel();
				break;
			case "ThongKe":
				node = new ThongKePanel();
				break;
			default:
				break;
			}
			jpnRoot.removeAll();
			jpnRoot.setLayout(new BorderLayout());
			jpnRoot.add(node);
			jpnRoot.validate();
			jpnRoot.repaint();
			setChangeBackground(kind);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
//			jpnItem.setBackground(new Color(96,100,191));
//			jlbItem.setBackground(new Color(96,100,191));
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			kindSelected = kind;
			jpnItem.setBackground(new Color(96,100,191));
			jlbItem.setBackground(new Color(96,100,191));
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if(kindSelected.equalsIgnoreCase(kind)) {
				jpnItem.setBackground(new Color(76,175,80));
				jlbItem.setBackground(new Color(76,175,80));
			}
		}
	}
	private void setChangeBackground(String kind) {
		for(DanhMucBean item : listBean) {
			if(item.getKind().equalsIgnoreCase(kind)) {
				item.getjPanel().setBackground(new Color(96,100,191));
				item.getjLabel().setBackground(new Color(96,100,191));
			}
		}
	}
}
