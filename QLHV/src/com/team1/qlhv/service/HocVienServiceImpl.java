package com.team1.qlhv.service;

import java.util.List;

import com.team1.qlhv.dao.HocVienDAO;
import com.team1.qlhv.dao.HocVienDAOImpl;
import com.team1.qlhv.model.HocVien;

public class HocVienServiceImpl implements HocVienService{
	private HocVienDAO hocvienDao = null;
	public HocVienServiceImpl() {
		hocvienDao = new HocVienDAOImpl();
	}
	@Override
	public List<HocVien> getList() {
		return hocvienDao.getList();
	}

}
