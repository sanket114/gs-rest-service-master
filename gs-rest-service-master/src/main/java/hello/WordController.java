package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Word;

@RestController
public class WordController {
    // TODO Implement the /words/{word} endpoint
@RequestMapping(value="/words/{word}")
public Word show(@PathVariable(value = "word" )String s ) {
	
System.out.println(s);
	Word w=new Word();
	w.setWord(s);
	w.setPalindrom(palindrom(s));
	w.setAnagramofpalindrom(anagramofpalindrom(s));
	return w;
	
}

public boolean palindrom(String s)  {
    String original, reverse = ""; // Objects of String class
    int length = s.length();
   
    for (int i = length - 1; i >= 0; i--)
       reverse = reverse + s.charAt(i);
       
    if (s.equals(reverse))
    	return true;
    else
    	return false;
       
 }
private boolean anagramofpalindrom(String s) {
	// TODO Auto-generated method stub
	 int [] count = new int[26];
     for( int i = 0; i < s.length(); i++ )
     {
         char ch = s.charAt(i);
         count[ch-'a']++;
     }
     int oddOccur = 0;
     for( int cnt:count )
     {
         if( oddOccur > 1) // more than 1 char should have odd frequency
             return false;
         if( cnt%2 == 1 )
             oddOccur++;
     }
     return true;
}

}
