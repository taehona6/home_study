package board;

public class BoardMain {

	public static void main(String[] args) {
		// �Խ��� ������ ó�� Ŭ����
		// CRUD create read update delete
		// Board class(�Խñ۹�ȣ, ����, ����, �ۼ���, �ۼ���)
		// ��ȣ�� �ڵ����� ī��Ʈ�ǰ� ����
		// �ۼ����� ���� ��¥ �ð����� �尡�� �ڵ�����
		BoardManager bm = new BoardManager();
		bm.addBoard();
		bm.addBoard();
		bm.addBoard();
		bm.addBoard();
		bm.printBoard();

	}

}
