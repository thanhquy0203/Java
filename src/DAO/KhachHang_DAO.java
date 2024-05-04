package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ConnectDB.ConnectDB;
import Entity.KhachHang;

public class KhachHang_DAO {
	public ArrayList<KhachHang> getAllTableKhachHang() {
		ArrayList<KhachHang> dskh = new ArrayList<KhachHang>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "select * from KHACHHANG";
			Statement statement = con.createStatement();
			//thuc thi cau lenh sql tra ve doi tuong result
			ResultSet rs = statement.executeQuery(sql);
			//duyet tren ket qua tra ve
			while(rs.next()) {
				String maKH = rs.getString(1);
				String tenKH = rs.getString(2);
				String diaChi = rs.getString(3);
				String soDienThoai = rs.getString(4);
				int diem = rs.getInt(5);
				KhachHang kh = new KhachHang(maKH, tenKH, diaChi, soDienThoai, diem);
				dskh.add(kh);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dskh;
	}
}
