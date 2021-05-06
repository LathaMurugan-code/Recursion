package recursion;
/*
12345
2345
345
45
5
*/

public class Pattern8 {
	public static void main (String [] args)
	{
		Pattern8 p = new Pattern8();
		p.row(1);
	}
	public void row(int i)
	{
		if(i<=5)
		{
			col(i);
			System.out.println();
			row(i+1);
		}
	}
	public void col(int i)
	{
		if(5>=i)
		{
			System.out.print(i);
			col(i+1);
		}
	}

}
