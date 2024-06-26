package app;

import java.awt.Color;
import java.awt.Component;
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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Arrays;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;

public class HoaDon_app extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Container sideMenu;
	private JTextField textField;
	private JTextField textField_1;
	private JComboBox day;
	private JComboBox month;
	private JComboBox year;
	private JButton btnNewButton;
	private JPanel panel_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HoaDon_app frame = new HoaDon_app();
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
	public HoaDon_app() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1662, 907);
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
		sideMenu.setBounds(0, 69, 388, 799);
		panel_1.add(sideMenu);
		sideMenu.setLayout(null);
		
		JPanel body = new JPanel();
		body.setBorder(null);
		body.setBackground(Color.DARK_GRAY);
		body.setBounds(0, 261, 388, 326);
		sideMenu.add(body);
		body.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("  Bán hàng");
		lblNewLabel_2.setForeground(Color.BLACK);
		lblNewLabel_2.setOpaque(true);
		lblNewLabel_2.setBackground(Color.GRAY);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(0, 11, 388, 52);
		body.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("  Thêm nước");
		lblNewLabel_3.setForeground(Color.BLACK);
		lblNewLabel_3.setOpaque(true);
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(0, 74, 388, 52);
		body.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("  Hóa đơn");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setOpaque(true);
		lblNewLabel_4.setBackground(Color.GRAY);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(0, 137, 388, 52);
		body.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("  Khách hàng");
		lblNewLabel_5.setForeground(Color.BLACK);
		lblNewLabel_5.setOpaque(true);
		lblNewLabel_5.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(0, 200, 388, 52);
		body.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("  Nguyên liệu");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setOpaque(true);
		lblNewLabel_6.setBackground(Color.GRAY);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_6.setBounds(0, 263, 388, 52);
		body.add(lblNewLabel_6);
		
		JPanel foot = new JPanel();
		foot.setBorder(null);
		foot.setBackground(Color.DARK_GRAY);
		foot.setBounds(0, 587, 388, 215);
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
		lblNewLabel_7.setBounds(0, 152, 388, 52);
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
		
		panel_2 = new JPanel();
		panel_2.setBounds(388, 69, 289, 799);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Mã hóa đơn :");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_10.setBounds(10, 11, 269, 25);
		panel_2.add(lblNewLabel_10);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(10, 47, 269, 25);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Tổng tiền :");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_11.setBounds(10, 83, 269, 25);
		panel_2.add(lblNewLabel_11);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 119, 269, 25);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Ngày bán :");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_12.setBounds(10, 155, 269, 25);
		panel_2.add(lblNewLabel_12);
		
		day = new JComboBox();
		day.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		day.setBounds(10, 191, 81, 25);
		panel_2.add(day);
		
		month = new JComboBox();
		month.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkCalender();
			}
		});
		month.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		month.setBounds(101, 191, 81, 25);
		panel_2.add(month);
		
		year = new JComboBox();
		year.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkCalender();
			}
		});
		year.setModel(new DefaultComboBoxModel(new String[] {"2023", "2024"}));
		year.setBounds(192, 191, 87, 25);
		panel_2.add(year);
		
		JLabel lblNewLabel_13 = new JLabel("Mã giảm giá :");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_13.setBounds(10, 227, 269, 25);
		panel_2.add(lblNewLabel_13);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 263, 269, 25);
		panel_2.add(comboBox);
		
		JLabel lblNewLabel_14 = new JLabel("Nhân viên :");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_14.setBounds(10, 299, 269, 25);
		panel_2.add(lblNewLabel_14);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(10, 335, 269, 25);
		panel_2.add(comboBox_1);
		
		btnNewButton = new JButton("Xem chi tiết");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setOpaque(true);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(10, 710, 269, 78);
		panel_2.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(687, 80, 949, 777);
		panel_1.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
	}
	
	//phương thức đóng menu
	protected void closeMenuBar() {
		int width = 228;
		int height = 763;
		for (Component component : panel_2.getComponents()) {
	        component.setEnabled(true);
		}
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i = width;i>0;i--) {
					sideMenu.setSize(i,height);
					try {
						Thread.sleep(2);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
		}).start();
		
	}
	
	void checkCalender() {
		String[] monthsHave30 = {"4", "6", "9", "11"};
		String[] monthsHave31 = {"1", "3", "5", "7","8","10","12"};
		if(year.getSelectedItem().toString().equals("2024") && month.getSelectedItem().toString().equals("2")) {
			String index = day.getSelectedItem().toString();
			day.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29"}));
			day.setSelectedItem(index);
		} else if (year.getSelectedItem().toString().equals("2023") && month.getSelectedItem().toString().equals("2")) {
			String index = day.getSelectedItem().toString();
			day.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"}));
			day.setSelectedItem(index);
		} else if (Arrays.asList(monthsHave30).contains(month.getSelectedItem().toString())) {
			String index = day.getSelectedItem().toString();
			day.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30"}));
			day.setSelectedItem(index);
		} else if (Arrays.asList(monthsHave31).contains(month.getSelectedItem().toString())) {
			String index = day.getSelectedItem().toString();
			day.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28","29","30","31"}));
			day.setSelectedItem(index);
		}
	}
}
