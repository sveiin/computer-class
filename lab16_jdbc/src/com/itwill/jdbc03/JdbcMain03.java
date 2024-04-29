package com.itwill.jdbc03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

import static com.itwill.jdbc.OracleJdbc.*;

public class JdbcMain03 {

	public static void main(String[] args) throws SQLException {
		// update 문장 실행 & 결과 처리
		
		// 오라클 드라이버를 등록
		DriverManager.registerDriver(new OracleDriver());
		
		// 오라클 DB 접속
		Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
		
		// Statement 객체 생성
		final String sql = "update blogs "
				+ "set title = ?, content = ?, modified_time = systimestamp "
				+ "where id = ?";
		PreparedStatement stmt = conn.prepareStatement(sql);

		// PreparedStatement에서 ? 부분을 실제 값으로 대체
		stmt.setString(1, "update");
		stmt.setString(2, "update 테스트");
		stmt.setInt(3, 30); // 세번째 ? 부분을 두번째 argument 값으로 채움
		
		// SQL 문장을 실행 & 결과 처리
		int result = stmt.executeUpdate();
		System.out.println(result + "개 행이 업데이트됨");
		
		// 사용했던 DB 리소스 해제
		stmt.close();
		conn.close();
		
	}

}
