package boardJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements DAO {

	private Connection conn;
	private PreparedStatement pst;
	private String query = "";

	public BoardDAOImpl() {
		DatabaseConnection dbc = DatabaseConnection.getInstance();
		conn = dbc.getConnection();
	}

	@Override
	public int insert(BoardVO b) {
		// TODO Auto-generated method stub
		query = "insert into board(title,content,writer) values (?,?,?)";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, b.getTitle());
			pst.setString(2, b.getContent());
			pst.setString(3, b.getWriter());

			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("insert error");
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int update(BoardVO b) {
		// TODO Auto-generated method stub

		query = "update board set title=?,content=?,moddate=now() where bno=?";
		try {
			pst = conn.prepareStatement(query);
			pst.setString(1, b.getTitle());
			pst.setString(2, b.getContent());
			pst.setInt(3, b.getBno());
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("update error");
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int delete(int bno) {
		// TODO Auto-generated method stub
		query = "delete from board where bno = ?";
		try {
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			return pst.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("delete error");
			e.printStackTrace();
		}
		
		
		return 0;
	}

	@Override
	public List<BoardVO> selectList() {
		// TODO Auto-generated method stub
		query = "select * from board order by bno desc";
		List<BoardVO> list = new ArrayList<BoardVO>();
		try {
			pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				int bno = rs.getInt("bno");
				String title = rs.getString("title");
				String writer = rs.getString("writer");
				String date = rs.getString("moddate");
				int readCount = rs.getInt("readCount");
				list.add(new BoardVO(bno,title,writer,date,readCount));
			}
			return list;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("List error");
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public BoardVO selectOne(int bno) {
		// TODO Auto-generated method stub
		String readCount = "update board set readCount = readCount+1 where bno = ? ";
		query = "select * from board where bno = ?";
		
		try {
			pst = conn.prepareStatement(readCount);
			pst.setInt(1, bno);
			pst.executeUpdate();
			pst = conn.prepareStatement(query);
			pst.setInt(1, bno);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				return new BoardVO(rs.getInt("bno"),rs.getString("title"),rs.getString("writer"),rs.getString("content"),rs.getString("regdate"),rs.getString("moddate"),rs.getInt("readCount"));
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("detail error");
			e.printStackTrace();
		}
		
		
		return null;
	}

}
