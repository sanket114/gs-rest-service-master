package entity;

public class Word {
private String word;
private boolean palindrom;
private boolean anagramofpalindrom;
public String getWord() {
	return word;
}
public void setWord(String word) {
	this.word = word;
}
public boolean isPalindrom() {
	return palindrom;
}
public void setPalindrom(boolean palindrom) {
	this.palindrom = palindrom;
}
public boolean isAnagramofpalindrom() {
	return anagramofpalindrom;
}
public void setAnagramofpalindrom(boolean anagramofpalindrom) {
	this.anagramofpalindrom = anagramofpalindrom;
}
public Word(String word, boolean palindrom, boolean anagramofpalindrom) {
	super();
	this.word = word;
	this.palindrom = palindrom;
	this.anagramofpalindrom = anagramofpalindrom;
}
public Word() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Word [word=" + word + ", palindrom=" + palindrom + ", anagramofpalindrom=" + anagramofpalindrom + "]";
}



}
