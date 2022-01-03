package arrayproject;

public class primefun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=1; int num=0;
for(; i<=25;i++)
{
	int count=0;
	for(num=i;num>=1;num--)
	{
		if(i%num==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		System.out.println(i);
	}
}
}
}
