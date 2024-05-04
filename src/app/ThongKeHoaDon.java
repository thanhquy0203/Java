package app;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ThongKeHoaDon extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Container sideMenu;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThongKeHoaDon frame = new ThongKeHoaDon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ThongKeHoaDon() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1435, 782);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		ImageIcon imageIcon = new ImageIcon(ThanhToan.class.getResource("/image/logo1.jpg"));
		Image image = imageIcon.getImage();
		Image newimg = image.getScaledInstance(368, 239,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
		imageIcon = new ImageIcon(newimg);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(0, 0, 1646, 868);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		sideMenu = new JPanel();
		sideMenu.setBackground(new Color(128, 128, 128));
		sideMenu.setBounds(0, 69, 388, 675);
		panel_1.add(sideMenu);
		sideMenu.setLayout(null);
		
		JPanel body = new JPanel();
		body.setBorder(null);
		body.setBackground(Color.DARK_GRAY);
		body.setBounds(0, 261, 388, 326);
		sideMenu.add(body);
		body.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("  Thống kê hóa đơn");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(0, 11, 388, 52);
		body.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("  Đặt nguyên liệu");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(0, 74, 388, 52);
		body.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("  Tài khoản nhân viên");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(Color.GRAY);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(0, 137, 388, 52);
		body.add(lblNewLabel_4);
		
		JPanel foot = new JPanel();
		foot.setBorder(null);
		foot.setBackground(Color.DARK_GRAY);
		foot.setBounds(0, 587, 388, 88);
		sideMenu.add(foot);
		foot.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("  Đăng xuất");
		lblNewLabel_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Login.main(null);
			}
		});
		lblNewLabel_7.setForeground(Color.BLACK);
		lblNewLabel_7.setOpaque(true);
		lblNewLabel_7.setBackground(Color.GRAY);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_7.setBounds(0, 11, 388, 66);
		foot.add(lblNewLabel_7);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, -19, 388, 21);
		foot.add(separator);
		separator.setOpaque(true);
		separator.setBackground(Color.BLACK);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 368, 239);
		sideMenu.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(imageIcon);
		lblNewLabel.setBounds(0, 0, 368, 239);
		panel_2.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 1646, 69);
		panel_1.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Quán cà phê abc");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblNewLabel_8.setForeground(Color.BLACK);
		lblNewLabel_8.setBounds(10, 11, 1626, 45);
		panel.add(lblNewLabel_8);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(398, 80, 1021, 273);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 1021, 273);
		panel_3.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblNewLabel_1 = new JLabel("Mã hóa đơn :");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(398, 388, 128, 51);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Mã nhân viên :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(872, 388, 164, 51);
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tên nhân viên :");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(872, 450, 164, 51);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Tổng tiền :");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_3.setBounds(398, 450, 128, 51);
		panel_1.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Ngày bán :");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_4.setBounds(398, 512, 128, 51);
		panel_1.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Giảm giá (%) :");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1_5.setBounds(872, 512, 164, 51);
		panel_1.add(lblNewLabel_1_5);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setEditable(false);
		textField.setBounds(536, 396, 253, 40);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(1046, 396, 253, 40);
		panel_1.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(536, 458, 253, 40);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_3.setColumns(10);
		textField_3.setBounds(1046, 458, 253, 40);
		panel_1.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(536, 520, 253, 40);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(1046, 520, 253, 40);
		panel_1.add(textField_5);
		
		JButton TKNgayBan = new JButton("Thống kê theo ngày bán");
		TKNgayBan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TKNgayBan.setBounds(451, 604, 233, 51);
		panel_1.add(TKNgayBan);
		
		JButton TKMaHD = new JButton("Thống kê theo mã hóa đơn");
		TKMaHD.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TKMaHD.setBounds(764, 604, 233, 51);
		panel_1.add(TKMaHD);
		
		JButton TKMaNV = new JButton("Thống kê theo mã nhân viên");
		TKMaNV.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TKMaNV.setBounds(1066, 604, 233, 51);
		panel_1.add(TKMaNV);
		
		JButton TKTongTien = new JButton("Thống kê theo tổng tiền");
		TKTongTien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TKTongTien.setBounds(451, 676, 233, 51);
		panel_1.add(TKTongTien);
		
		JButton tangGiam = new JButton("Tăng dần/Giảm dần");
		tangGiam.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tangGiam.setBounds(764, 676, 233, 51);
		panel_1.add(tangGiam);
		
		JButton tim = new JButton("Tìm");
		tim.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tim.setBounds(1066, 676, 233, 51);
		panel_1.add(tim);
	}
}
