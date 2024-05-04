package app;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class DatNguyenLieu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Container sideMenu;
	private JTextField nhapSL;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatNguyenLieu frame = new DatNguyenLieu();
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
	public DatNguyenLieu() {
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
		panel_3.setBounds(388, 69, 228, 675);
		panel_1.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nguyên liệu :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 11, 140, 37);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Số lượng");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(10, 103, 140, 37);
		panel_3.add(lblNewLabel_1_1);
		
		nhapSL = new JTextField();
		nhapSL.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nhapSL.setColumns(10);
		nhapSL.setBounds(10, 151, 202, 33);
		panel_3.add(nhapSL);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setBounds(10, 59, 202, 33);
		panel_3.add(comboBox);
		
		JButton dat = new JButton("Đặt");
		dat.setForeground(Color.WHITE);
		dat.setFont(new Font("Tahoma", Font.BOLD, 20));
		dat.setBackground(Color.RED);
		dat.setBounds(10, 586, 202, 78);
		panel_3.add(dat);
		
		JLabel lblNewLabel_5 = new JLabel("Tìm kiếm theo tên :");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 510, 121, 14);
		panel_3.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(10, 535, 155, 20);
		panel_3.add(textField);
		textField.setColumns(10);
	}
}
