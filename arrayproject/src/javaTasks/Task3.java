package javaTasks;

public class Task3 {

	public static void main(String[] args) {
		String s="hi hello welcome to your home town";
		char find='h'; int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==find) {
				count++;
			}
		}
		System.out.println(count);
	}

}
