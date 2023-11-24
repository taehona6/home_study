package repository;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.BoardVO;
import orm.DatabaseBuilder;

public class BoardDAOimpl implements BoardDAO {

	private static final Logger log = LoggerFactory.getLogger(BoardDAOimpl.class);
	
	
	//DB연결
	private SqlSession sql;
	
	public BoardDAOimpl() {
		new DatabaseBuilder();
		sql = DatabaseBuilder.getFactory().openSession();
	}

	@Override
	public int insert(BoardVO bvo) {
		// TODO Auto-generated method stub
		log.info(">>> insert check 3");
		int isOk = sql.insert("BoardMapper.add",bvo);
		if(isOk>0) {
			sql.commit();
		}
		return isOk;
	}
	
	//메서드 구현
}
