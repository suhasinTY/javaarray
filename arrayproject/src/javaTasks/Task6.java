package javaTasks;

public class Task6 {

	public static void main(String[] args) {
		String s="my name is mohan and i am from mangalore";
		char[] c=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(c[i]==c[j]) {
					System.out.println(c[j]);
					break;
				}
			}
		}
	}

}
