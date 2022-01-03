package javaTasks;

public class Task18 {

	public static void main(String[] args) {
		int[] s= {28,45,36,87,66,55,99};
		int smallest=s[0];
		for(int no:s) {
			if(no<smallest) {
				smallest=no;
				
			}
			
		}
		System.out.println(smallest);
		int a=smallest;
		int sum=smallest+a;
		System.out.println(sum);
	}


	}


