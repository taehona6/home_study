package domain;

public class BoardVO {
	private int bno;
	private String title;
	private String writer;
	private String content;
	private String regdate;
	private String moddate;
	private int readCount;

	// default
	public BoardVO() {
	}

	// for insert
	public BoardVO(String t, String w, String c) {
		this.title = t;
		this.writer = w;
		this.content = c;
	}

	// for list
	public BoardVO(int n, String t, String w, String r, int rc) {
		this.bno = n;
		this.title = t;
		this.writer = w;
		this.regdate = r;
		this.readCount = rc;
	}

	// for update
	public BoardVO(int n, String t, String c) {
		this.bno = n;
		this.title = t;
		this.content = c;
	}

	// for detail
	public BoardVO(int n, String t, String w, String c, String r, String m, int rc) {
		this.bno = n;
		this.title = t;
		this.writer = w;
		this.content = c;
		this.regdate = r;
		this.moddate = m;
		this.readCount = rc;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getModdate() {
		return moddate;
	}

	public void setModdate(String moddate) {
		this.moddate = moddate;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regdate="
				+ regdate + ", moddate=" + moddate + ", readCount=" + readCount + "]";
	}
	
}
