package assignments;

import java.util.ArrayList;
import java.util.List;

public class WordLenth {

	public static void main(String[] args) {

		//Example 1	
		String str = "Hello World";
		String[] word = str.split(" ");
		String lastword = word[word.length-1];
		System.out.print("The last word is " + lastword);
		List<String> lastwordsze = new ArrayList<String>();
		int length = lastword.length();
		System.out.println(" with length " + length);

        //Example 2
		String str2 = "fly me   to   the moon";
	    String[] word2 = str2.split(" ");
	    String lastword2 = word2[word2.length-1];
        System.out.print("The last word is " + lastword2);
        List<String> lastwordsze1 = new ArrayList<String>();
        int length2 = lastword2.length();
        System.out.println(" with length " + length2);
        
        //Example 3
        String str3 = "luffy is still joyboy";
        String[] word3 = str3.split(" ");
        String lastword3 = word3[word3.length-1];
        System.out.print("The last word is " + lastword3);
        List<String> lastwordsze2 = new ArrayList<String>();
        int length3 = lastword3.length();
        System.out.println(" with length " + length3);

	}

}
