package board;

public class BoardMain {

	public static void main(String[] args) {
		// 게시판 데이터 처리 클래스
		// CRUD create read update delete
		// Board class(게시글번호, 제목, 내용, 작성자, 작성일)
		// 번호는 자동으로 카운트되게 설정
		// 작성일은 현재 날짜 시간으로 드가게 자동설정
		BoardManager bm = new BoardManager();
		bm.addBoard();
		bm.addBoard();
		bm.addBoard();
		bm.addBoard();
		bm.printBoard();

	}

}
