package com.itwill.ver05.view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.itwill.ver05.controller.ContactDao;
import com.itwill.ver05.controller.ContactDaoImpl;
import com.itwill.ver05.model.Contact;

public class ContactUpdateFrame extends JFrame {
	
	public interface UpdateNotify {
		void notifyContactUpdated();
	}

	private UpdateNotify app; // 메인 쓰레드 주소를 저장하기 위한 객체
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel contentPanel;
	private JPanel buttonPanel;
	private JButton btnSave;
	private JButton btnCancel;
	private JLabel lblName;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	private JLabel lblPhone;
	private JLabel lblEmail;
	
	private Component parentComponent; // 부모 컴포넌트를 저장하기 위해서
	private int index; // 업데이트할 연락처의 (리스트) 인덱스를 저장하기 위해서
	
	private ContactDao dao = ContactDaoImpl.getInstance();

	/**
	 * Launch the application
	 */
	public static void showContactUpdateFrame(Component parentComponent, int index, UpdateNotify app) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactUpdateFrame frame = new ContactUpdateFrame(parentComponent, index, app);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame
	 */
	public ContactUpdateFrame(Component parentComponent, int index, UpdateNotify app) {
		this.parentComponent = parentComponent;
		this.index = index;
		this.app = app;
		
		initialize();
		initializeTextFields();
	}
	
	private void initializeTextFields() {
		// 3개의 텍스트 필드에 해당 인덱스의 연락처 정보를 채움
		Contact contact = dao.read(index);
		
		textName.setText(contact.getName());
		textPhone.setText(contact.getPhone());
		textEmail.setText(contact.getEmail());
	}
	
	public void initialize() {
		setTitle("연락처 업데이트");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		int x = 0;
		int y = 0;
		if(parentComponent != null) {
			x = parentComponent.getX();
			y = parentComponent.getY();
			setBounds(x, y, 326, 238);
		} else {
			setLocationRelativeTo(null);
		}
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		contentPanel = new JPanel();
		contentPane.add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		lblName = new JLabel("이름");
		lblName.setBounds(12, 10, 57, 31);
		contentPanel.add(lblName);
		
		textName = new JTextField();
		textName.setBounds(68, 7, 220, 34);
		contentPanel.add(textName);
		textName.setColumns(10);
		
		lblPhone = new JLabel("전화번호");
		lblPhone.setBounds(12, 54, 57, 31);
		contentPanel.add(lblPhone);
		
		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(68, 51, 220, 34);
		contentPanel.add(textPhone);
		
		lblEmail = new JLabel("이메일");
		lblEmail.setBounds(12, 98, 57, 31);
		contentPanel.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(68, 95, 220, 34);
		contentPanel.add(textEmail);
		
		buttonPanel = new JPanel();
		contentPane.add(buttonPanel, BorderLayout.SOUTH);
		
		btnSave = new JButton("저장");
		btnSave.addActionListener((e) -> updateContact());
		buttonPanel.add(btnSave);
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener((e) -> dispose());
		buttonPanel.add(btnCancel);
		
	}
	
	private void updateContact() {
		// 업데이트할 내용을 읽음
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();
		
		Contact contact = new Contact(0, name, phone, email);
		
		int result = dao.update(index, contact);
		if(result == 1) {
			// 메인 쓰레드에게 업데이트 성공을 알려줌
			app.notifyContactUpdated();
			// 현재 창 닫기
			dispose();
		} else {
			// 업데이트 실패 메시지 보여주기
		}
	}

}
