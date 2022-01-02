package demo;

import java.util.HashSet;

//java program to find longest substring  without repetition
//''abcdab''
//''abcd''


//longestTillnow=abcd
//longestOverall=abcd

//longestTillnow=ab
//longestOverall=abcd
public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="abcdab";
		System.out.println(Longest(str));

	}
	public static String Longest(String str) {
		HashSet<Character> set = new HashSet<>();
		
		String longestOverall="";
		String longestTillnow="";
		
		for(int i=0;i<str.length();i++) {
			char c= str.charAt(i);
			if(set.contains(c)) 
			{
				longestTillnow="";
				set.clear();
			}
			
			set.add(c);
			longestTillnow+=c;
			
			if(longestTillnow.length()>longestOverall.length()) {
				longestOverall=longestTillnow;
			}
		}
		
		return longestOverall;
	}
}
