package class14_jdbc_jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import class14_jdbc_jsp.model.Student;

public class StudentDao {

	private static StudentDao instance = new StudentDao();

	private StudentDao() {

	}

	public static StudentDao getInstance() {
		if (instance == null) {
			instance = new StudentDao();
		}
		return instance;
	}

	// 회원 목록 조회 (select)

	public ArrayList<Student> stuList(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();

		query.append("select						");
		query.append("	   stu_id		as id	");
		query.append("	 , stu_name	as nm	");
		query.append("	 , stu_score	as sc	");
		query.append("from						");
		query.append("	   students			");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		ResultSet rs = ps.executeQuery();

		ArrayList<Student> result = new ArrayList<Student>();

		while (rs.next()) {
			Student temp = new Student();

			temp.setStuId(rs.getInt("id"));
			temp.setStuName(rs.getString("nm"));
			temp.setStuScore(rs.getInt("sc"));

			result.add(temp);

		}
		if (ps != null)
			ps.close();
		if (rs != null)
			rs.close();

		return result;

	}

	// 회원 추가(insert)
	public int insertStu(Connection conn, Student student) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("insert into					");
		query.append("			students			");
		query.append("values	(						");
		query.append("			stu_seq.nextVal	");
		query.append("		 , ?				 	");
		query.append("		 , ?					");
		query.append("		)						");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		int idx = 1;

		ps.setString(idx++, student.getStuName());
		ps.setInt(idx++, student.getStuScore());

		int cnt = ps.executeUpdate();

		if (ps != null)
			ps.close();

		return cnt;
	}

	// 학생 삭제(delete)
	public int deleteStu(Connection conn, Student student) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("delete 			");
		query.append("		students	");
		query.append("where 1 = 1		");
		query.append("and stu_id = ?	");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		int idx = 1;

		ps.setInt(idx++, student.getStuId());

		int cnt = ps.executeUpdate();

		if (ps != null)
			ps.close();

		return cnt;
	}

	// 학 전체 삭제
	public int deleteAll(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("delete 			");
		query.append("		students	");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		int cnt = ps.executeUpdate();

		if (ps != null)
			ps.close();

		return cnt;

	}

	// 학생 정보
	public int updateStu(Connection conn, Student student) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("update							");
		query.append("			 students			");
		query.append("set stu_name = ?			");
		query.append("  , stu_score = ?			");
		query.append("where 		 1 = 1				");
		query.append("and 	    stu_id = ?		");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		int idx = 1;

		ps.setString(idx++, student.getStuName());
		ps.setInt(idx++, student.getStuScore());
		ps.setInt(idx++, student.getStuId());

		int cnt = ps.executeUpdate();

		if (ps != null)
			ps.close();

		return cnt;

	}

}
