package javaTasks;

public class ReplaceMwithW {

	public static void main(String[] args) {
		String s="this is suhas 14/01/1998";
		String find="this is suhas";
		char r=null;
		int count=0;
		for(int i=0;i<s.length();i++) {
			s.replaceAll(s, r); 
			
		System.out.println(s.replaceAll(s,r));
	}
	}
}
