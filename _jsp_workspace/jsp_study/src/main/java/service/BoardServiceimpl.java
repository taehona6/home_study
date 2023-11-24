package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import repository.BoardDAO;
import repository.BoardDAOimpl;

public class BoardServiceimpl implements BoardService {
	
	private static final Logger log = LoggerFactory.getLogger(BoardServiceimpl.class);
	
	private BoardDAO bdao; // interface로 생성.
	
	public BoardServiceimpl() {
		bdao = new BoardDAOimpl();
	}

	@Override
	public int register(BoardVO bvo) {
		// TODO Auto-generated method stub
		return bdao.insert(bvo);
	}
}
