package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ConnectDB.ConnectDB;
import Entity.NguyenLieu;

public class NguyenLieu_DAO {
//	public ArrayList<NguyenLieu> getAllTableKhachHang() {
//		ArrayList<NguyenLieu> dsnl = new ArrayList<NguyenLieu>();
//		try {
//			ConnectDB.getInstance();
//			Connection con = ConnectDB.getConnection();
//			String sql = "select * from NGUYENLIEU";
//			Statement statement = con.createStatement();
//			//thuc thi cau lenh sql tra ve doi tuong result
//			ResultSet rs = statement.executeQuery(sql);
//			//duyet tren ket qua tra ve
//			while(rs.next()) {
//				String maKH = rs.getString(1);
//				String tenKH = rs.getString(2);
//				String diaChi = rs.getString(3);
//				String soDienThoai = rs.getString(4);
//				double chiTieu = rs.getDouble(5);
//				NguyenLieu nl = new NguyenLieu(maKH, tenKH, diaChi, soDienThoai, chiTieu);
//				dsnl.add(nl);
//			}
//		}catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return dsnl;
//	}
}
