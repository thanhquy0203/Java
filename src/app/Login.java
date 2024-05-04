package app;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

import ConnectDB.ConnectDB;
import DAO.KhachHang_DAO;
import DAO.TaiKhoan_DAO;
import Entity.TaiKhoan;

public class Login {

	private JFrame frame;
	private JTextField nhapTK;
	private JPasswordField nhapMK;
	private JLabel lblNewLabel_2;
	private JPanel panel;
	private JLabel lblNewLabel_3;
	private TaiKhoan_DAO tk_dao;
	static String tk;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		try {
			ConnectDB.getInstance().connect();
			System.out.println("Connected!!");
		} catch(SQLException e) {
			e.printStackTrace();
		}
		tk_dao=new TaiKhoan_DAO();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 481, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setBounds(20, 50, 230, 182);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tài khoản");
		lblNewLabel.setBounds(20, 74, 57, 14);
		panel.add(lblNewLabel);
		
		nhapTK = new JTextField();
		nhapTK.setBounds(92, 71, 116, 20);
		panel.add(nhapTK);
		nhapTK.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Mật khẩu");
		lblNewLabel_1.setBounds(20, 105, 57, 14);
		panel.add(lblNewLabel_1);
		
		nhapMK = new JPasswordField();
		nhapMK.setBounds(92, 102, 116, 20);
		panel.add(nhapMK);
		
		JButton dangNhap = new JButton("Đăng nhập");
		dangNhap.setBounds(53, 137, 116, 23);
		panel.add(dangNhap);
		
		lblNewLabel_3 = new JLabel("Quán cà phê abc");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(10, 11, 210, 46);
		panel.add(lblNewLabel_3);
		dangNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				List<TaiKhoan> list = tk_dao.getAllTableTaiKhoan();
				for(TaiKhoan taiKhoan : list) {
					if(nhapTK.getText().equals(taiKhoan.getTaiKhoan()) && new String(nhapMK.getPassword()).equals(taiKhoan.getMatKhau())) {
						JOptionPane.showMessageDialog(null,"Đăng nhập thành công");
						tk = nhapTK.getText();
						frame.dispose();
						ThanhToan thanhToan = new ThanhToan();
						thanhToan.setLocationRelativeTo(null);
						thanhToan.setVisible(true);
						return;
					}
				}
				JOptionPane.showMessageDialog(null, "Tài khoản hoặc mật khẩu sai!");
			}
		});
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/image/loginBackground.jpg")));
		lblNewLabel_2.setBounds(0, 0, 465, 280);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
