package Anagram;

import java.util.Arrays;

public class EffiecientApproach {
static final int CHAR=256;
	static boolean isAnagram(String str1,String str2) {
		if(str1.length()!=str2.length())
		return false;
		
//		char[] count=str1.toCharArray();
//		Arrays.sort(count);
//		str1=new String(count);
		int[] count=new int[CHAR];
		for(int i=0;i<str1.length();i++) {
		count[str1.charAt(i)]++;	
		count[str2.charAt(i)]--;
		}
		for(int i=0;i<CHAR;i++) {
			if(count[i]!=0)
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
	String a="abcbaa";
	String b="cbbaa";
	if(isAnagram(a,b))
System.out.println("both are anagram to each other");
	else
		System.out.println("both are not anagram");
	}

}
