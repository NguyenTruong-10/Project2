package com.team1.qlhv.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.team1.qlhv.bean.DanhMucBean;
import com.team1.qlhv.controller.ChuyenManHinhController;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;

public class MainJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainJFrame frame = new MainJFrame();
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
	public MainJFrame() {
		setTitle("Quan ly hoc vien");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1239, 579);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel jpnRoot = new JPanel();
		jpnRoot.setBounds(0, 0, 1223, 542);
		contentPane.add(jpnRoot);
		jpnRoot.setLayout(null);
		
		JPanel jpnMenu = new JPanel();
		jpnMenu.setBackground(new Color(102, 102, 102));
		jpnMenu.setBounds(0, 0, 255, 532);
		jpnRoot.add(jpnMenu);
		jpnMenu.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 51, 51));
		panel_3.setBounds(0, 0, 255, 69);
		jpnMenu.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblQunLHc = new JLabel("QU\u1EA2N L\u00DD H\u1ECCC VI\u00CAN");
		lblQunLHc.setIcon(new ImageIcon(MainJFrame.class.getResource("/com/team1/qlhv/images/baseline_supervised_user_circle_white_24dp.png")));
		lblQunLHc.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblQunLHc.setForeground(new Color(255, 255, 255));
		lblQunLHc.setHorizontalAlignment(SwingConstants.CENTER);
		lblQunLHc.setBounds(0, 10, 255, 49);
		panel_3.add(lblQunLHc);
		
		JPanel jpnThongKe = new JPanel();
		jpnThongKe.setBackground(new Color(51, 153, 51));
		jpnThongKe.setBounds(10, 453, 235, 69);
		jpnMenu.add(jpnThongKe);
		jpnThongKe.setLayout(null);
		
		JLabel jlbThongKe = new JLabel("Th\u1ED1ng K\u00EA D\u1EEF Li\u1EC7u");
		jlbThongKe.setIcon(new ImageIcon(MainJFrame.class.getResource("/com/team1/qlhv/images/baseline_pie_chart_white_24dp.png")));
		jlbThongKe.setHorizontalAlignment(SwingConstants.LEFT);
		jlbThongKe.setForeground(Color.WHITE);
		jlbThongKe.setFont(new Font("Tahoma", Font.BOLD, 17));
		jlbThongKe.setBounds(10, 10, 215, 49);
		jpnThongKe.add(jlbThongKe);
		
		JPanel jpnTrangChu = new JPanel();
		jpnTrangChu.setBackground(new Color(51, 153, 51));
		jpnTrangChu.setBounds(10, 79, 235, 69);
		jpnMenu.add(jpnTrangChu);
		jpnTrangChu.setLayout(null);
		
		JLabel jlbTrangChu = new JLabel("M\u00E0n H\u00ECnh Ch\u00EDnh");
		jlbTrangChu.setHorizontalAlignment(SwingConstants.LEFT);
		jlbTrangChu.setIcon(new ImageIcon(MainJFrame.class.getResource("/com/team1/qlhv/images/baseline_important_devices_white_24dp.png")));
		jlbTrangChu.setFont(new Font("Tahoma", Font.BOLD, 17));
		jlbTrangChu.setForeground(new Color(255, 255, 255));
		jlbTrangChu.setBounds(10, 10, 215, 49);
		jpnTrangChu.add(jlbTrangChu);
		
		JPanel jpnHocVien = new JPanel();
		jpnHocVien.setBackground(new Color(51, 153, 51));
		jpnHocVien.setBounds(10, 172, 235, 69);
		jpnMenu.add(jpnHocVien);
		jpnHocVien.setLayout(null);
		
		JLabel jlbHocVien = new JLabel("Qu\u1EA3n L\u00FD H\u1ECDc Vi\u00EAn");
		jlbHocVien.setIcon(new ImageIcon(MainJFrame.class.getResource("/com/team1/qlhv/images/baseline_account_circle_white_24dp.png")));
		jlbHocVien.setHorizontalAlignment(SwingConstants.LEFT);
		jlbHocVien.setForeground(Color.WHITE);
		jlbHocVien.setFont(new Font("Tahoma", Font.BOLD, 17));
		jlbHocVien.setBounds(10, 10, 215, 49);
		jpnHocVien.add(jlbHocVien);
		
		JPanel jpnKhoaHoc = new JPanel();
		jpnKhoaHoc.setBackground(new Color(51, 153, 51));
		jpnKhoaHoc.setBounds(10, 264, 235, 69);
		jpnMenu.add(jpnKhoaHoc);
		jpnKhoaHoc.setLayout(null);
		
		JLabel jlbKhoaHoc = new JLabel("Qu\u1EA3n L\u00FD Kh\u00F3a H\u1ECDc");
		jlbKhoaHoc.setIcon(new ImageIcon(MainJFrame.class.getResource("/com/team1/qlhv/images/baseline_dns_white_24dp.png")));
		jlbKhoaHoc.setHorizontalAlignment(SwingConstants.LEFT);
		jlbKhoaHoc.setForeground(Color.WHITE);
		jlbKhoaHoc.setFont(new Font("Tahoma", Font.BOLD, 17));
		jlbKhoaHoc.setBounds(10, 10, 215, 49);
		jpnKhoaHoc.add(jlbKhoaHoc);
		
		JPanel jpnLopHoc = new JPanel();
		jpnLopHoc.setBackground(new Color(51, 153, 51));
		jpnLopHoc.setBounds(10, 357, 235, 69);
		jpnMenu.add(jpnLopHoc);
		jpnLopHoc.setLayout(null);
		
		JLabel jlbLopHoc = new JLabel("Qu\u1EA3n L\u00FD L\u1EDBp H\u1ECDc");
		jlbLopHoc.setIcon(new ImageIcon(MainJFrame.class.getResource("/com/team1/qlhv/images/baseline_home_white_24dp.png")));
		jlbLopHoc.setHorizontalAlignment(SwingConstants.LEFT);
		jlbLopHoc.setForeground(Color.WHITE);
		jlbLopHoc.setFont(new Font("Tahoma", Font.BOLD, 17));
		jlbLopHoc.setBounds(10, 10, 215, 49);
		jpnLopHoc.add(jlbLopHoc);
		
		JPanel jpnView = new JPanel();
		jpnView.setBounds(265, 0, 950, 532);
		jpnRoot.add(jpnView);
		GridBagLayout gbl_jpnView = new GridBagLayout();
		gbl_jpnView.columnWidths = new int[]{0};
		gbl_jpnView.rowHeights = new int[]{0};
		gbl_jpnView.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_jpnView.rowWeights = new double[]{Double.MIN_VALUE};
		jpnView.setLayout(gbl_jpnView);
		
		
		ChuyenManHinhController controller = new ChuyenManHinhController(jpnView);
		controller.setView(jpnTrangChu,jlbTrangChu);
		List<DanhMucBean> listItem = new ArrayList<DanhMucBean>();
		listItem.add(new DanhMucBean("TrangChu", jpnTrangChu, jlbTrangChu));
		listItem.add(new DanhMucBean("HocVien", jpnHocVien, jlbHocVien));
		listItem.add(new DanhMucBean("KhoaHoc", jpnKhoaHoc, jlbKhoaHoc));
		listItem.add(new DanhMucBean("LopHoc", jpnLopHoc, jlbLopHoc));
		listItem.add(new DanhMucBean("ThongKe", jpnThongKe, jlbThongKe));
		controller.setEvent(listItem);
	}
}
