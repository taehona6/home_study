package boardJDBC;

import java.util.List;
import java.util.Scanner;

public class BoardController {
	
	private Scanner scan ;
	private Service svc;
	private boolean flag;
	
	
	public BoardController(){
		scan = new Scanner(System.in);
		svc = new BoardServiceImpl();
		flag = true;
		printMenu();
	}
	
	private void printMenu() {
		//flag가 true라는건 종료하지 않았다는것
		while(flag) {
			System.out.println("--게시판--");
			System.out.println("1.글작성|2.글수정|3.글삭제");
			System.out.println("4.글목록|5.글읽기|6.종료");
			System.out.println("menu >> ");
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1: write(); break;
			case 2: modify(); break;
			case 3: remove(); break;
			case 4: list(); break;
			case 5: read(); break;
			default :
				flag = false;
				break;
			}
		}
		
	}

	private void write() {
		// TODO Auto-generated method stub
		System.out.println("제목 : ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.println("내용 : ");
		String content = scan.nextLine();
		System.out.println("작성자 : ");
		String writer = scan.nextLine();
		BoardVO b = new BoardVO(title,writer,content);
		int is = svc.write(b);
		System.out.println("글작성 "+ (is>0 ? "성공":"실패"));
		
	}

	private void modify() {
		// TODO Auto-generated method stub
		System.out.println("수정할 글 번호");
		int bno = scan.nextInt();
		System.out.println("수정할 제목");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.println("수정할 내용");
		String content = scan.nextLine();
		BoardVO b = new BoardVO(bno,title,content);
		
		int is = svc.modify(b);
		System.out.println("글수정 "+ (is>0 ? "성공":"실패"));
		
		
	}

	private void remove() {
		// TODO Auto-generated method stub
		System.out.println("삭제할 글 번호");
		int bno = scan.nextInt();
		
		int is = svc.remove(bno);
		System.out.println("글삭제 "+ (is>0 ? "성공":"실패"));
	}

	private void list() {
		// TODO Auto-generated method stub
		List<BoardVO> list = svc.list();
		
		for(BoardVO b : list) {
			System.out.println(b);
		}
	}

	private void read() {
		// TODO Auto-generated method stub
		System.out.println("글번호");
		int bno = scan.nextInt();
		BoardVO b = svc.read(bno);
		b.printDetail();
	}
	
}
