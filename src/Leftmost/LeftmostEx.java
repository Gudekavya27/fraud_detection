package Leftmost;

public class LeftmostEx {
static int leftmost(String str) {
	for(int i=0;i<str.length();i++) {
		for(int j=i+1;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j))
				return i;
		}
	}
	
	return -1;
}
public static void main(String[] args) {
	String s="habbbabsccc";
	System.out.println(leftmost(s));
}
}
