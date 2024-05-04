package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;

import ConnectDB.ConnectDB;
import Entity.Ban;
import Entity.HoaDon;
import Entity.KhachHang;
import Entity.NhanVien;

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
				Ban maB = new Ban(rs.getString(6));
				HoaDon hd = new HoaDon(maHD, tongTien, ngayBan, maNV, maKH, maB);
				dshd.add(hd);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return dshd;
	}
}
