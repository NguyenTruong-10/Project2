package com.team1.qlhv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.team1.qlhv.model.HocVien;

public class HocVienDAOImpl implements HocVienDAO{
	@Override
	public List<HocVien> getList(){
		Connection connection = DBConnect.getConnection();
		String sql = "Select * from hoc_vien";
		List<HocVien> list = new ArrayList<HocVien>();
		try {
			PreparedStatement ps = connection.prepareCall(sql);
			ResultSet re = ps.executeQuery();
			while(re.next()) {
				HocVien hocVien = new HocVien();
				hocVien.setMa_hoc_vien(re.getInt("ma_hoc_vien"));
				hocVien.setHo_ten(re.getString("ho_ten"));
				hocVien.setDia_chi(re.getString("dia_chi"));
				hocVien.setNgay_sinh(re.getDate("ngay_sinh"));
				hocVien.setGioi_tinh(re.getBoolean("gioi_tinh"));
				hocVien.setSo_dien_thoai(re.getString("so_dien_thoai"));
				hocVien.setTinh_trang(re.getBoolean("tinh_trang"));
				list.add(hocVien);
			}
			ps.close();
			re.close();
			connection.close();
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
//	public static void main(String[] args) {
//		HocVienDAO hocVienDAO = new HocVienDAOImpl();
//		System.out.println(hocVienDAO.getList());
//	}
}
