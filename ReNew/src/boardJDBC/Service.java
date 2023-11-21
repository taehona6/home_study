package boardJDBC;

import java.util.List;

public interface Service {

	int write(BoardVO b);

	int modify(BoardVO b);

	int remove(int bno);

	List<BoardVO> list();

	BoardVO read(int bno);

}
