package javaTasks;

public class Task5 {

	public static void main(String[] args) {
		int n=1234321; int r=0;
		for(;n!=0;n=n/10) {
			int d=n%10;
			r=r*10+d;
		}
		System.out.println(r);
		
	}

}
