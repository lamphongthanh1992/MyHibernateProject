package pojo;

import java.util.Date;

public class SinhVien implements java.io.Serializable{
	private String maSinhVien; 
	private String hoVaTen; 
	private Date ngaySinh; 
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	private String diaChi; 
	public SinhVien() { } 
	public SinhVien(String maSinhVien) { 
		this.maSinhVien = maSinhVien; 
	} 
	public SinhVien(String maSinhVien, String hoVaTen, Date ngaySinh, String diaChi) { 
		this.maSinhVien = maSinhVien; 
		this.hoVaTen = hoVaTen; 
		this.ngaySinh = ngaySinh; 
		this.diaChi = diaChi; 
	}
}
