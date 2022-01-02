package demo;

public class StringConverter {
	
	public static String convert(String str) {
		StringBuffer sb= new StringBuffer(str);
		
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)<48 || sb.charAt(i)>57) {
				sb.deleteCharAt(i);
				i--;
			}
		}
		return sb.toString(); //to convert into string as mismatch type found
	}
   public static void main(String[] args) {
	   String str="987b_68a667";
	   str=convert(str);
	   System.out.println(str);
   }
}
