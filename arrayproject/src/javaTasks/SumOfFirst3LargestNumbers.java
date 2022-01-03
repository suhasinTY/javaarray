package javaTasks;

public class SumOfFirst3LargestNumbers {

	public static void main(String[] args) {
		int[] arr= {28,45,36,87,66,55,99};
		int n=arr.length;
		for(int j=1;j<n;j++) {
			for(int i=1;i<n;i++) {
				if(arr[i-1]>arr[i]) {
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int k=0;k<n;k++) {
			System.out.println(arr[k]);
	}
		int sum=arr[arr.length-1]+arr[arr.length-2]+arr[arr.length-3];
		System.out.println(sum);
	}

	}