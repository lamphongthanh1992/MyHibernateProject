package spring_group.hibernate_project;

import java.util.List;

import pojo.SinhVien;
import dao.SinhVienDAO;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		List<SinhVien> ds = SinhVienDAO.layDanhSachSinhVien();
		for (int i = 0; i < ds.size(); i++) {
			SinhVien sv = ds.get(i);
			System.out.println("MSSV: " + sv.getMaSinhVien());
			System.out.println("Họ và tên: " + sv.getHoVaTen());
			System.out.println("Ngày sinh: " + sv.getNgaySinh());
			System.out.println("Địa chỉ: " + sv.getDiaChi());
		}
	}
}
