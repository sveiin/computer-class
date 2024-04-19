package com.itwill.swing07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.itwill.swing07.MyFrame.Notifiable;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppMain07 implements Notifiable{

	private JFrame frame;
	private JButton btnMsgDlg;
	private JButton btnConfirmDlg;
	private JButton btnInputDlg;
	private JButton btnCustomDlg;
	private JButton btnMyFrame;
	
	@Override
	public void notifyMessage(String message) {
		btnMyFrame.setText(message);
	}
	
	/**
	 * Launch the application
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppMain07 window = new AppMain07();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application
	 */
	public AppMain07() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnMsgDlg = new JButton("Message Dialog");
		btnMsgDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 메시지 다이얼로그 보여주기
//				JOptionPane.showMessageDialog(frame, "안녕하세요");
				JOptionPane.showMessageDialog(
						frame,	// 부모 컴포넌트 
						"안녕하세요, Swing!", // 다이얼로그 메시지
						"메시지", // 다이얼로그 타이틀(제목)
						JOptionPane.PLAIN_MESSAGE); // 메시지 타입 -> 메시지 아이콘
			}
		});
		btnMsgDlg.setFont(new Font("굴림", Font.PLAIN, 15));
		btnMsgDlg.setBounds(26, 21, 376, 41);
		frame.getContentPane().add(btnMsgDlg);
		
		btnConfirmDlg = new JButton("Confirm Dialog");
		btnConfirmDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Confirm(확인) 다이얼로그 보여주기
//				int result = JOptionPane.showConfirmDialog(frame, "정말 삭제할까요?");
				int result = JOptionPane.showConfirmDialog(
						frame, // 부모 컴포넌트
						"정말 삭제할까요?", // 메시지
						"삭제 확인", // 타이틀
						JOptionPane.OK_CANCEL_OPTION, // 옵션 타입(버튼 종류, 개수)
						JOptionPane.QUESTION_MESSAGE); // 메시지 타입
			}
		});
		btnConfirmDlg.setFont(new Font("굴림", Font.PLAIN, 15));
		btnConfirmDlg.setBounds(26, 72, 376, 41);
		frame.getContentPane().add(btnConfirmDlg);
		
		btnInputDlg = new JButton("Input Dialog");
		btnInputDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 입력 다이얼로그 보여주기
//				JOptionPane.showInputDialog(frame, "검색어 입력");
				
				final String[] selections = {"인스타", "페이스북", "트위터", "유튜브"};
				JOptionPane.showInputDialog(
						frame, // 부모 컴포넌트
						"검색어 입력", // 메시지
						"검색어", // 타이틀
						JOptionPane.PLAIN_MESSAGE, // 메시지 타입 - 메시지 기본 아이콘
						null, // 아이콘
						selections, // 선택할 값들
						selections[2] // 초기 선택값
				);
			}
		});
		btnInputDlg.setFont(new Font("굴림", Font.PLAIN, 15));
		btnInputDlg.setBounds(26, 123, 376, 41);
		frame.getContentPane().add(btnInputDlg);
		
		btnCustomDlg = new JButton("Custom Dialog");
		btnCustomDlg.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 내가 만든 다이얼로그 보여주기
				MyDialog.showMyDialog(frame);
			}
		});
		btnCustomDlg.setFont(new Font("굴림", Font.PLAIN, 15));
		btnCustomDlg.setBounds(26, 174, 376, 41);
		frame.getContentPane().add(btnCustomDlg);
		
		btnMyFrame = new JButton("Custom Frame");
		btnMyFrame.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// JFrame을 상속받는 객체 보여주기
				MyFrame.showMyFrame(frame, AppMain07.this);
				// -> 아규먼트 frame: MyFrame 클래스가 부모 컴포넌트(JFrame) 정보를 사용할 수 있도록
				// -> 아규먼트 AppMain07.this: AppMain07 타입으로 생성된 객체(의 주소). 현재 객체
				// MyFrame 클래스에서 AppMain07 객체의 public 메서드를 호출할 수 있도록
			}
		});
		btnMyFrame.setFont(new Font("굴림", Font.PLAIN, 15));
		btnMyFrame.setBounds(26, 225, 376, 41);
		frame.getContentPane().add(btnMyFrame);
	}
}
