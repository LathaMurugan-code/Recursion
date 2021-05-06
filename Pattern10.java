package recursion;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern10 p = new Pattern10();
		p.row(1);
		p.row2(4);

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
	public void row2(int i)
	{
		if(i>=1)
		{
			col2(i);
			System.out.println();
			row(i-1);
		}
	}
	public void col(int i)
	{
		if(i>=1)
		{
			System.out.print("* ");
			col(i-1);
		}
	}
   public void col2(int i)
   {
	   if(i>=1)
	   {
		   System.out.print("* ");
		   col2(i-1);
	   }
	   
   }

}
