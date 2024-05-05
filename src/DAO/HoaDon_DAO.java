package DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import ConnectDB.ConnectDB;
import Entity.HoaDon;
import Entity.KhachHang;
import Entity.NhanVien;
import Entity.The;

public class HoaDon_DAO {
	public ArrayList<HoaDon> getAllTableHoaDon() {
		ArrayList<HoaDon> dshd = new ArrayList<HoaDon>();
		try {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			String sql = "select * from HOADON";
			Statement statement = con.createStatement();
			//thuc thi cau lenh sql tra ve doi tuong result
			ResultSet rs = statement.executeQuery(sql);
			//duyet tren ket qua tra ve
			while(rs.next()) {
				String maHD = rs.getString(1);
				Double tongTien= rs.getDouble(2);
				LocalDate ngayBan = rs.getDate(3).toLocalDate();
				NhanVien maNV = new NhanVien(rs.getString(4));
				KhachHang maKH = new KhachHang(rs.getString(5));
				The soT = new The(rs.getInt(6));
				HoaDon hd = new HoaDon(maHD, tongTien, ngayBan, maNV, maKH, soT);
				dshd.add(hd);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dshd;
	}
	
	public boolean insert(HoaDon hd) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		int n =0;
		try {
			stmt = con.prepareStatement("insert into" + " HOADON values (?,?,?,?,?,?)");
			stmt.setString(1, hd.getMaHoaDon());
			stmt.setDouble(2, hd.getTongTien());
			String ngayBanString = hd.getNgayBan().toString();
			stmt.setObject(3, ngayBanString);
			stmt.setString(4, hd.getMaNhanVien().getMaNhanVien());
			stmt.setString(5, hd.getMaKhachHang().getMaKhachHang());
			stmt.setInt(6,hd.getSoThe().getSoThe());
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
