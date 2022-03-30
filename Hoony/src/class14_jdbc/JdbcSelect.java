package class14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {

	public static void main(String[] args) {
		// 변수 정의
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// 1. 드라이버 로딩 (프로젝트에서 딱 한번만 로딩해주면 된다)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 등록 실패");
			System.exit(0); // 프로그램 종료
		}

		try {
			// 2. 데이터베이스 서버와 연결(Connection) 한다.
			// ip주소 (ifconfig 주소(찐), localhost = 127.0.0.1)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "jdbc";
			String pw = "jdbc";

			conn = DriverManager.getConnection(url, id, pw);

			// 3. 쿼리문 객체를 생성한다.
			stmt = conn.createStatement();

			// 4. 쿼리문 실행과 동시에 결과를 객체에 담는다.
			StringBuffer query = new StringBuffer();
			query.append("select						");
			query.append("	   stu_id		as id	");
			query.append("	 , stu_name	as nm	");	
			query.append("	 , stu_score	as sc	");	
			query.append("from						");
			query.append("	   students			");
			
			
			rs = stmt.executeQuery(query.toString());
			
			// 5. 실행결과(rs) 처리
			// 다음 행이 있으면 true를 반환하며, 
			// 커서가 한칸 내려간다.
			while(rs.next()) { 
//				int stuId = rs.getInt("stu_id");
				int stuId = rs.getInt("id");
//				String stuName = rs.getString("stu_name");
				String stuName = rs.getString("nm");
//				int stuScore = rs.getInt("stu_score");
				int stuScore = rs.getInt("sc");
				
				System.out.println("id: " + stuId + ", stuName: " + stuName + ", stuScore: " + stuScore);								
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 6. 자원 정리(close)
			if(rs != null) try {rs.close();}catch(SQLException e) {}
			if(stmt != null) try {stmt.close();}catch(SQLException e) {}
			
			// Connection 객체를 나중에 닫고, 꼳 닫아야 된다.
			if(conn != null) try {conn.close();}catch(SQLException e) {}
			
			
		}

	}

}
