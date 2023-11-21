package word;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordManager {

	private ArrayList<Word> wordList;

	public WordManager() {

		wordList = new ArrayList<Word>();
	}

	void add() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ܾ� �Է�");
		String myWord = sc.next();
		System.out.println("�� �Է�");
		String myMean = sc.next();
		
		Word w = new Word();
		w.setWord(myWord);
		w.setMean(myMean);
		this.wordList.add(w);
	}

	void search() {
		Scanner sc = new Scanner(System.in);
		System.out.println("[1] �ܾ� �˻� / [2] �� �˻� ");
		int tmp = sc.nextInt();
		if (tmp == 1) {
			System.out.println("�˻��� �ܾ� �Է� : ");
			String myWord = sc.next();
			for (Word w : this.wordList) {
				if (w.getWord().equals(myWord)) {
					System.out.println(w.toString());
					return;
				}

			}
		}
		if (tmp == 2) {
			System.out.println("�˻��� �� �Է� : ");
			String myWord = sc.next();
			for (Word w : this.wordList) {
				if (w.getMean().equals(myWord)) {
					System.out.println(w.toString());
					return;
				}
			}
		}else {System.out.println("�߸��� �Է�");}
	}
	
	
	void edit(){
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ܾ� �Է� : ");
		String myWord = sc.next();
		for (Word w : this.wordList) {
			if (w.getWord().equals(myWord)) {
				System.out.println("������ �� �Է�");
				w.setMean(sc.next());
				break;
			}else {System.out.println("�ش� �ܾ �������� ����");}
		}
		System.out.println("���� �Ϸ�");
	}
	
	void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �ܾ� �Է� : ");
		String myWord = sc.next();
		
		for (Word w : this.wordList) {
			if (w.getWord().equals(myWord)) {
				wordList.remove(w);
				return;
			}
		}
		
	}
	
	void printAll() {
		for(Word w : this.wordList) {
			System.out.println(w.toString());
		}
	}
	
	void makeFile() throws IOException {
		FileWriter fw = new FileWriter("file.txt");
		for(Word w : this.wordList) {
			fw.write(w.toString()+"\r\n");
		}
		fw.close();
	}
}
