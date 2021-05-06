package recursion;
/*
11111
11122
11333
14444
55555
*/

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callFn(5,1,5,1);
		//two(5,5);

	}
	public static void callFn(int i ,int j,int k,int n)
	{
		if(i>=1&&k>=1&&n<=5)
		{
			one(i,j);
			two(k,n);
			System.out.println();
			callFn(i-1,j,k-1,n+1);
		}
	}
	public static void one(int i,int j)
	{
		if(i>1)
		{
			System.out.print(j);
			one(i-1,j);
		}
	}
		public static void two(int i,int j)
		{
			if(5>=i&&j<=5)
			{
				System.out.print(j);
				two(i+1,j);
			}
			
	}

}
