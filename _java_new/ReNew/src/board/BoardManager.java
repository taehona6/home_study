package board;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardManager implements BoardInterface {

	ArrayList<Board> boardList = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	
	@Override
	public void printMenu() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBoard() {
		System.out.println("����>");
		String su = sc.next();
		System.out.println("����>");
		String co = sc.next();
		System.out.println("�ۼ���>");
		String wr = sc.next();
		
		Board b = new Board(su,co,wr);
		boardList.add(b);
		
	}

	@Override
	public void searchBoard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifiBoard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBoard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printBoard() {
		// TODO Auto-generated method stub
		for(Board b : boardList) {
			System.out.println(b.toString());
		}
	}

}
