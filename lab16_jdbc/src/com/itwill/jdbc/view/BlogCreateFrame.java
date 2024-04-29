package com.itwill.jdbc.view;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.itwill.jdbc.controller.BlogDao;
import com.itwill.jdbc.model.Blog;

public class BlogCreateFrame extends JFrame {

	public interface CreateNotify {
		void notifyCreateSuccess();
	}
	
	private static final long serialVersionUID = 1L;
	
	private BlogDao dao = BlogDao.getInstance();
	private CreateNotify app;
	
	private JPanel contentPane;

	private Component parent;
	
	private JLabel lblTitle;
	private JTextField textTitle;
	private JLabel lblContent;
	private JScrollPane scrollPane;
	private JTextArea textContent;
	private JLabel lblWriter;
	private JTextField textWriter;
	private JButton btnSave;
	private JButton btnCancel;
	
	/**
	 * Launch the application
	 */
	public static void showBlogCreateFrame(Component parent, CreateNotify app) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BlogCreateFrame frame = new BlogCreateFrame(parent, app);
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
	private BlogCreateFrame(Component parent, CreateNotify app) {
		this.parent = parent;
		this.app = app;
		
		initialize();
	}
	
 	public void initialize() {
 		setTitle("새 블로그 작성");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		int x = 0;
		int y = 0;
		if(parent != null) {
			x = parent.getX(); // 부모 컴포넌트의 x 좌표
			y = parent.getY(); // 부모 컴포넌트의 y 좌표
			setBounds(x, y, 310, 410);
		} else {
			setLocationRelativeTo(null); // 화면 중앙에 JFrame을 띄움
		}
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitle = new JLabel("제목");
		lblTitle.setBounds(12, 10, 54, 22);
		contentPane.add(lblTitle);
		
		textTitle = new JTextField();
		textTitle.setBounds(12, 36, 269, 29);
		contentPane.add(textTitle);
		textTitle.setColumns(10);
		
		lblContent = new JLabel("내용");
		lblContent.setBounds(12, 75, 54, 22);
		contentPane.add(lblContent);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 102, 269, 155);
		contentPane.add(scrollPane);
		
		textContent = new JTextArea();
		scrollPane.setViewportView(textContent);
		
		lblWriter = new JLabel("작성자");
		lblWriter.setBounds(12, 267, 54, 22);
		contentPane.add(lblWriter);
		
		textWriter = new JTextField();
		textWriter.setColumns(10);
		textWriter.setBounds(12, 293, 269, 29);
		contentPane.add(textWriter);
		
		btnSave = new JButton("작성 완료");
		btnSave.addActionListener((e) -> createNewBlog());
		btnSave.setBounds(12, 332, 120, 22);
		contentPane.add(btnSave);
		
		btnCancel = new JButton("취소");
		btnCancel.addActionListener((e) -> dispose());
		btnCancel.setBounds(160, 332, 120, 22);
		contentPane.add(btnCancel);
	}
 	
 	private void createNewBlog() {
 		// 제목, 내용, 작성자에 입력된 내용을 Blog 객체로 만들어서
 		// DAO 메서드를 사용해서 DB 테이블에 insert
 		String title = textTitle.getText();
 		String content = textContent.getText();
 		String writer = textWriter.getText();
 		if(title.equals("") || content.equals("") || writer.equals("")) {
 			JOptionPane.showMessageDialog(
 					BlogCreateFrame.this,
 					"제목, 내용, 작성자는 반드시 입력하세요",
 					"경고",
 					JOptionPane.WARNING_MESSAGE);
 			return;
 		}
 		
 		Blog blog = new Blog(0, title, content, writer, null, null);
 		int result = dao.create(blog);
 		if(result == 1) {
 			// BlogMain 프레임에게 테이블 삽입 성공을 알려줌
 			app.notifyCreateSuccess();
 			dispose(); // 현재 창 닫기
 		} else {
 			JOptionPane.showMessageDialog(
 					BlogCreateFrame.this,
 					"insert 실패");
 		}
 		
 	}
}
