package entity;

public class Word {
private String word;
private boolean palindrome;
private boolean anagramOfPalindrome;
public String getWord() {
	return word;
}
public void setWord(String word) {
	this.word = word;
}
public boolean isPalindrome() {
	return palindrome;
}
public void setPalindrome(boolean palindrome) {
	this.palindrome = palindrome;
}
public boolean isanagramOfPalindrome() {
	return anagramOfPalindrome;
}
public void setAnagramOfPalindrome(boolean anagramOfPalindrome) {
	this.anagramOfPalindrome = anagramOfPalindrome;
}
public Word(String word, boolean palindrome, boolean anagramOfPalindrome) {
	super();
	this.word = word;
	this.palindrome = palindrome;
	this.anagramOfPalindrome = anagramOfPalindrome;
}
public Word() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Word [word=" + word + ", palindrome=" + palindrome + ", anagramOfPalindrome=" + anagramOfPalindrome + "]";
}



}
