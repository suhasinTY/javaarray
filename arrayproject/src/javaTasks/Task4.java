package javaTasks;

public class Task4 {

	public static void main(String[] args) {
		String s="ELF2021SELENIUM";
		char[] c=s.toCharArray();
		int j=c.length-1;
		for(int i=0;i<j;i++,j--) {
			char temp;
			temp=c[i];
			c[i]=c[j];
			c[j]=temp;
		}
		System.out.println(c);
	}

}
