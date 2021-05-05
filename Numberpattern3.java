package recursion;
/*
7
7 6 
7 6 5
7 6 5 4
7 6 5 4 3
7 6 5 4 3 2 
7 6 5 4 3 2 1*/

public class Numberpattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numberpattern3 n = new Numberpattern3();
		n.row(7,7);
		}
	public void row(int i,int j)
	{
		if(i>=1&&j>=1)
		{
			column(i,j);
			System.out.println();
			row(i-1,j);
		}
	}
	public void column(int i,int j)
	{
		if(i<=7&&j>=1)
		{
			System.out.print(j);
			column(i+1,j-1);
		}
	}
}
