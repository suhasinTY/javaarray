package javaTasks;

public class Task2 {

	public static void main(String[] args) {
		String s="My name is suhas";
		System.out.println(s);
		String[] ar= s.split(" ");
		for(int i=ar.length-1;i>=0; i--) {
			System.out.print(ar[i]+" ");
		}
	}
}
