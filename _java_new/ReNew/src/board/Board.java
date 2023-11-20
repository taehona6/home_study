package board;

import java.util.Calendar;

public class Board {

	private int num;
	private String subject;
	private String content;
	private String writer;
	private String date;

	public Board(String s, String c, String w){
		int month = Calendar.getInstance().get(Calendar.MONTH)+1;
		int day = Calendar.getInstance().get(Calendar.DATE);
		
		int min = Calendar.getInstance().get(Calendar.MINUTE);
		int sec = Calendar.getInstance().get(Calendar.SECOND);
		
		this.num = Counter.getInstace().countMethod();
		this.date = month+"��"+day+"��"+min+"��"+sec+"��";
		this.subject = s;
		this.content = c;
		this.writer = w;
	}
	


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}



	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�Խù���ȣ:"+num+"| ����:"+subject+"| ����: "+content+"|�ۼ���: "+writer+"| �ð�: " +date;
	}
	
	

}

class Counter{
	//�̱��� ��ü�� ����
	private static Counter instance;
	private int count; 
	
	private Counter() {}
	
	public static Counter getInstace() {
		if(instance == null) {
			instance = new Counter();
		}
		return instance;
	}
	
	public int countMethod() {
		count++;
		return count;
	}
}
