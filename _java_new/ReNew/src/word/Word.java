package word;

public class Word {

private String word;
private String mean;


public String getWord() {
	return word;
}
public void setWord(String word) {
	this.word = word;
}
public String getMean() {
	return mean;
}
public void setMean(String mean) {
	this.mean = mean;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return this.word + " : " + this.mean;
}



}
