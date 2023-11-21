package boardJDBC;

import java.util.List;

public class BoardServiceImpl implements Service {

	
	private DAO dao;
	public BoardServiceImpl() {
		dao = new BoardDAOImpl();
	}
	@Override
	public int write(BoardVO b) {
		// TODO Auto-generated method stub
		return dao.insert(b);
	}
	@Override
	public int modify(BoardVO b) {
		// TODO Auto-generated method stub
		return dao.update(b);
	}
	@Override
	public int remove(int bno) {
		// TODO Auto-generated method stub
		return dao.delete(bno);
	}
	@Override
	public List<BoardVO> list() {
		// TODO Auto-generated method stub
		return dao.selectList();
	}
	@Override
	public BoardVO read(int bno) {
		// TODO Auto-generated method stub
		return dao.selectOne(bno);
	}
}
