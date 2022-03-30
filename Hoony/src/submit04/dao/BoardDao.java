package submit04.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import submit04.model.BoardVO;
import submit04.model.MemberVO;

public class BoardDao {

	private static BoardDao instance = new BoardDao();

	private BoardDao() {
	}

	public static BoardDao getInstance() {
		if (instance == null) {
			instance = new BoardDao();
		}

		return instance;
	}

	// 1. 회원가입
	public int registMem(Connection conn, String id, String name, String pw) throws SQLException {

		StringBuffer query = new StringBuffer();
		query.append("insert into					");
		query.append("			board_member		");
		query.append("values (						");
		query.append("	       ?					");
		query.append("         , ?					");
		query.append("         , ?					");
		query.append("         		)				");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		MemberVO temp = new MemberVO(id, name, pw);

		int idx = 1;
		ps.setString(idx++, temp.getMemId());
		ps.setString(idx++, temp.getMemName());
		ps.setString(idx++, temp.getMemPw());

		int cnt = ps.executeUpdate();

		if (ps != null)
			ps.close();

		return cnt;
	}

	// 2. 회원가입 시, 입력한 아이디 중복체크
	// 로그인 시, 입력한 아이디에 대한 패스워드 검사
	// 로그인 성공, 이전에 입력한 아이디에 대한 board_member 데이터 가져오기
	public MemberVO getMem(Connection conn, String id) throws SQLException {
		StringBuffer query = new StringBuffer();

		query.append("select					");
		query.append("	   mem_id			");
		query.append("    , mem_name		");
		query.append("	 , mem_pw			");
		query.append("from					");
		query.append("	  board_member	");
		query.append("where 1 = 1			");
		query.append("and mem_id = ?		");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		ps.setString(1, id);

		ResultSet rs = ps.executeQuery();

		ArrayList<MemberVO> result = new ArrayList<MemberVO>();

		MemberVO temp = new MemberVO();

		while (rs.next()) {

			temp.setMemId(rs.getString("mem_id"));
			temp.setMemName(rs.getString("mem_name"));
			temp.setMemPw(rs.getString("mem_pw"));

		}
		if (ps != null)
			ps.close();
		if (rs != null)
			rs.close();

		return temp;
	}

	// 3. 게시글 등록
	public int registBoard(Connection conn, String author, String title, String contents) throws SQLException {
		StringBuffer query = new StringBuffer();

		query.append("insert into					");
		query.append("			board				");
		query.append("values		(					");
		query.append("		  board_seq.nextval	");
		query.append("		, ?						");
		query.append("		, ?						");
		query.append("		, ?						");
		query.append("		, ?						");
		query.append("				)				");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		BoardVO temp = new BoardVO(author, title, contents);

		int idx = 1;
		
		ps.setString(idx++, temp.getBoardAuthor());
		ps.setString(idx++, temp.getBoardTitle());
		ps.setString(idx++, temp.getBoardContents());
		ps.setString(idx++, temp.getBoardDate());
		
		
				
		int cnt = ps.executeUpdate();

		if (ps != null)
			ps.close();

		return cnt;

	}

	// 게시글 조회
	public ArrayList<BoardVO> boardList(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();

		query.append("select						");
		query.append("	   board_num			");
		query.append("	 , board_author		");
		query.append("	 , board_title		");
		query.append("	 , board_contents		");
		query.append("	 , board_date			");
		query.append("from						");
		query.append("	   board				");
		query.append("order by 1					");


		PreparedStatement ps = conn.prepareStatement(query.toString());
		

		ResultSet rs = ps.executeQuery();

		ArrayList<BoardVO> result = new ArrayList<BoardVO>();


		while (rs.next()) {
			BoardVO temp = new BoardVO();
			
			temp.setBoardNum(rs.getInt("board_num"));
			temp.setBoardAuthor(rs.getString("board_author"));
			temp.setBoardTitle(rs.getString("board_title"));
			temp.setBoardContents(rs.getString("board_contents"));
			temp.setBoardDate(rs.getString("board_date"));
			
			result.add(temp);

		}
		if (ps != null)
			ps.close();
		if (rs != null)
			rs.close();

		return result;

	}
	
	// 게시글 불러오기?
	public ArrayList<BoardVO> getBoardList(Connection conn, int no) throws SQLException{
		StringBuffer query = new StringBuffer();
		
		query.append("SELECT						");
		query.append("		board_num.nextval	");
		query.append("	  , board_author		");
		query.append("	  , board_title		");
		query.append("	  , board_contents	");
		query.append("	  , board_date   		");
		query.append("FROM						");
		query.append("		board				");
		query.append("WHERE 1=1					");
		query.append("	AND	board_num = ?		");
		query.append("	order by 1				");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ps.setInt(1, no);
		
		ResultSet rs = ps.executeQuery();
		
		ArrayList<BoardVO> result = new ArrayList<BoardVO>();
		
		while(rs.next()) {
			BoardVO temp = new BoardVO();
			temp.setBoardNum(rs.getInt("board_num.nextval"));
			temp.setBoardTitle(rs.getString("board_title"));
			temp.setBoardAuthor(rs.getString("board_author"));
			temp.setBoardDate(rs.getString("board_date"));
			result.add(temp);
		}
		
		if(ps!=null)ps.close();
		if(rs!=null)rs.close();
		
		return result;
	}

}
