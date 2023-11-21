package boardJDBC;

import java.util.List;

public interface DAO {

	int insert(BoardVO b);

	int update(BoardVO b);

	int delete(int bno);

	List<BoardVO> selectList();

	BoardVO selectOne(int bno);

}
