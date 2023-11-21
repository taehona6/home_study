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
		System.out.println("단어 입력");
		String myWord = sc.next();
		System.out.println("뜻 입력");
		String myMean = sc.next();
		
		Word w = new Word();
		w.setWord(myWord);
		w.setMean(myMean);
		this.wordList.add(w);
	}

	void search() {
		Scanner sc = new Scanner(System.in);
		System.out.println("[1] 단어 검색 / [2] 뜻 검색 ");
		int tmp = sc.nextInt();
		if (tmp == 1) {
			System.out.println("검색할 단어 입력 : ");
			String myWord = sc.next();
			for (Word w : this.wordList) {
				if (w.getWord().equals(myWord)) {
					System.out.println(w.toString());
					return;
				}

			}
		}
		if (tmp == 2) {
			System.out.println("검색할 뜻 입력 : ");
			String myWord = sc.next();
			for (Word w : this.wordList) {
				if (w.getMean().equals(myWord)) {
					System.out.println(w.toString());
					return;
				}
			}
		}else {System.out.println("잘못된 입력");}
	}
	
	
	void edit(){
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 단어 입력 : ");
		String myWord = sc.next();
		for (Word w : this.wordList) {
			if (w.getWord().equals(myWord)) {
				System.out.println("수정할 뜻 입력");
				w.setMean(sc.next());
				break;
			}else {System.out.println("해당 단어가 존재하지 않음");}
		}
		System.out.println("수정 완료");
	}
	
	void delete() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 단어 입력 : ");
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
