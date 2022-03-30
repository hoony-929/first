package class14_jdbc_jsp.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import class14_jdbc_jsp.dao.StudentDao;
import class14_jdbc_jsp.jdbc.ConnectionPool;
import class14_jdbc_jsp.model.Student;

public class StudentService {

	private static StudentService instance = new StudentService();

	private StudentDao dao = StudentDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();

	private StudentService() {

	}

	public static StudentService getInstance() {
		if (instance == null) {
			instance = new StudentService();
		}

		return instance;
	}

	// 회원목록 조회(select)
	public ArrayList<Student> stuList() {
		Connection conn = cp.getConnection();

		try {
			return dao.stuList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}

		return new ArrayList<Student>();
	}

	// 회원 추가(insert)
	public int insertStu(Student student) {
		Connection conn = cp.getConnection();

		try {
			return dao.insertStu(conn, student);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}

		return 0;
	}

	// 학생 삭제(delete)
	public int deleteStu(Student student) {
		Connection conn = cp.getConnection();

		try {
			return dao.insertStu(conn, student);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}

		return 0;
	}
	
	// 학생 전체
	public int deleteAll() {
		Connection conn = cp.getConnection();

		try {
			return dao.deleteAll(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}

		return 0;
	}
	
	// 학생 업데이트
	public int updateStu(Student student) {
		Connection conn = cp.getConnection();

		try {
			return dao.updateStu(conn, student);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}

		return 0;
	}
	
	
}
