package class14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.management.Query;

public class JdbcPsFinal {
	/**
	 * 한번 실행(run) 할때마다 김사장은 정대리에게 웕브 250만원을 송금한다. (김사장 계좌 - 250만원 = > 정대리의 계좌 +
	 * 250만원) 만약 김사장의 계좌의 잔액이 0원 이하가 된다면 없었던 일로 하고 되돌린다.(RollBack) = 트랜잭션
	 */
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null; // 연달아 쿼리문 실행하기 위해

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 등록 실패");
			System.exit(0); // 프로그램 종료
		}

		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "jdbc";
			String pw = "jdbc";
			conn = DriverManager.getConnection(url, id, pw);

			// 트랜잭션(Transaction) 설정
			// 자동 커밋 되는 것을 막은 다음 모든 DB작업이 안전하게 종료되는 시점에
			// 수동적으로 커밋을 하며, 도중 에러 발생 시 롤백 하도록 하는 것
			conn.setAutoCommit(false);

			// 민우씨 계좌에서 250만원 빼기
			StringBuffer query = new StringBuffer();
			query.append("update											");
			query.append("		bank									");
			query.append("set bank_account = bank_account - ?		");
			query.append("where 		 1 = 1								");
			query.append("and bank_name = ?								");

			ps = conn.prepareStatement(query.toString());

			int idx = 1;
			ps.setInt(idx++, 2500000);
			ps.setString(idx++, "민우");

			int cnt = ps.executeUpdate();

			if (cnt > 0) {
				System.out.println("민우씨 계좌에서 250만원이 인출되었습니다.");

				ps.close();
				ps = conn.prepareStatement("select * from bank where bank_name = '민우'");

				rs = ps.executeQuery();

				int minwooAc = 0;
				while (rs.next()) {
					String name = rs.getString("bank_name");
					minwooAc = rs.getInt("bank_account");
					System.out.println(name + "씨의 잔액: " + minwooAc);
				}
				if (minwooAc <= 0) {
					System.out.println("이번달 월급은 없었던 일로 합니다..");
					// 롤백
					conn.rollback();
				} else {
					ps.close();

					StringBuffer sql = new StringBuffer();
					sql.append("update										");
					sql.append("		bank									");
					sql.append("set bank_account = bank_account + ?		");
					sql.append("where 		 1 = 1							");
					sql.append("and bank_name = ?							");

					ps = conn.prepareStatement(sql.toString());

					int index = 1;
					ps.setInt(index++, 2500000);
					ps.setString(index++, "재훈");

					int count = ps.executeUpdate();

					if (count > 0) {
						System.out.println("계좌에 월급이 들어왔습니다.");
						// 커밋
						conn.commit();

						ps.close();
						ps = conn.prepareStatement("select * from bank");

						rs.close();
						rs = ps.executeQuery();

						while (rs.next()) {
							System.out.println(rs.getString("bank_name") + ", " + rs.getString("bank_account"));
						}

					}
				}

			} else {
				System.out.println("월급 지급이 정상적으로 이루어지지 않았습니다.");
				conn.rollback();
			}

		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException s) {
			}
			;
		} finally {
			if (ps != null)
				try {
					ps.close();
				} catch (SQLException e) {
				}
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
				}
		}

	}

}
