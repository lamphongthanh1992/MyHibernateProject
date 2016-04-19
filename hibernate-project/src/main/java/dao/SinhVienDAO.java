package dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import pojo.SinhVien;
import util.HibernateUtil;

public class SinhVienDAO {
	public static List<SinhVien> layDanhSachSinhVien() {
		List<SinhVien> ds = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		try {
			String hql = "select sv from SinhVien sv";
			Query query = session.createQuery(hql);
			ds = query.list();
		} catch (HibernateException ex) {
			System.err.println(ex);
		} finally {
			session.close();
		}
		return ds;
	}
}
