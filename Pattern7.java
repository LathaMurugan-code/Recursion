package recursion;
/*
 *  55555
	44444
	33333
	22222
	11111

 */

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		row(5);

	}
	public static void row(int i)
	{
		if(i>=1)
		{
			col(5,i);
			System.out.println();
			row(i-1);
		}
	}
	public static void col(int i,int j)
	{
		if(i>=1)
		{
			System.out.print(j);
			col(i-1,j);
		}
	}

}
