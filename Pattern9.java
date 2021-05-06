package recursion;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern9 p = new Pattern9();
		 p.row(1);

	}
	public void row(int i)
	{
		if(i<=8)
		{
			col(i);
			System.out.println();
			row(i+1);
		}
	}
	public void col(int i)
	{
		if(i>=1)
		{
			System.out.print(i+" ");
			col(i-1);
		}
	}


}
