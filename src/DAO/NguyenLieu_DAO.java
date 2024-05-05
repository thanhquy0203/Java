package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ConnectDB.ConnectDB;
import Entity.NguyenLieu;

public class NguyenLieu_DAO {
	public ArrayList<NguyenLieu> getAllTableKhachHang() {
		ArrayList<NguyenLieu> dsnl = new ArrayList<NguyenLieu>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "select * from NGUYENLIEU";
			Statement statement = con.createStatement();
			//thuc thi cau lenh sql tra ve doi tuong result
			ResultSet rs = statement.executeQuery(sql);
			//duyet tren ket qua tra ve
			while(rs.next()) {
				String maNL = rs.getString(1);
				String tenNL = rs.getString(2);
				int soLuong  = rs.getInt(3);
				NguyenLieu nl = new NguyenLieu(maNL, tenNL, soLuong);
				dsnl.add(nl);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dsnl;
	}
	
//	public static void updateNguyenLieu(NguyenLieu nl) {
//		try (
//				Connection con = ConnectDB.getConnection();
//				PreparedStatement update = con.prepareStatement("update NGUYENLIEU "
//						+ "set tenNguyenLieu = ?, soLuong = ?"
//						+ "where maNguyenLieu = ?");
//				){
//			update.setString(1, nl.getTenNguyenLieu());
//			update.setInt(2, nl.getSoLuong());
//			update.setString(3, nl.getMaNguyenLieu());
//			update.executeUpdate();
//			
//		}catch (Exception e) {
//			e.printStackTrace();
//			
//		}
//	}

	public boolean create(NguyenLieu nl) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("insert into" + 
					" NGUYENLIEU values(?, ?, ?)");
			stmt.setString(1,nl.getMaNguyenLieu());
			stmt.setString(2,nl.getTenNguyenLieu());
			stmt.setInt(3, nl.getSoLuong());

			
			n = stmt.executeUpdate();
		} catch (SQLException e) {
			throw new IllegalArgumentException("Mã đã tồn tại");
		}
		finally {
			try {
					stmt.close();
			} catch (SQLException e) { 
				// TODO Auto-generated catch block 
				e.printStackTrace();
			}
		}
		return n > 0;
		
	}

	public boolean update(NguyenLieu nl) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("update NGUYENLIEU set tenNguyenLieu =?, soLuong =? where maNguyenLieu =? ");
			stmt.setString(1, nl.getTenNguyenLieu());
			stmt.setInt(2, nl.getSoLuong());
			stmt.setString(3, nl.getMaNguyenLieu());
			n = stmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
			
		}
		finally {
			try {
				stmt.close();
			}
			catch (SQLException e) {
				e.printStackTrace();
			 }
			}
		return n >0;
	}
	
}
