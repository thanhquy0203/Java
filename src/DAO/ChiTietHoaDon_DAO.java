package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import ConnectDB.ConnectDB;
import Entity.ChiTietHoaDon;
import Entity.HoaDon;

public class ChiTietHoaDon_DAO {
	public boolean insert(ChiTietHoaDon ct) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		int n =0;
		try {
			stmt = con.prepareStatement("insert into" + " CHITIETHOADON values (?,?,?,?)");
			stmt.setString(1, ct.getMaHoaDon().getMaHoaDon());
			stmt.setString(2, ct.getMaDoUong().getMaDoUong());
			stmt.setInt(3, ct.getSoLuong());
			stmt.setDouble(4, ct.getDonGia());
			n = stmt.executeUpdate();
		} catch(SQLException e) {
			throw new IllegalArgumentException(e);
		} finally {
			try {
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return n>0;
	}
}
