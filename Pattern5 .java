package recursion;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//decrement(1,1);
		decCall(1,1);
		incCall(1,1);

	}
	public static void decCall(int i,int j)
	{
		if(i<=5)
		{
			decrement(i,j);
			System.out.println();
			decCall(i+1,j);
			}
		}
	public static void incCall(int i,int j)
	{
		if(i<=5)
		{
			increment(i,j);
			System.out.println();
			incCall(i+1,j);
			}
		}


	public static void decrement(int i,int j)
	{
		if(5>=i&&5>=j)
		{
			System.out.print(j);
			decrement(i+1,j+1);
			
		}
	}
	public static void increment(int i,int j)
	{
		if(i>=1&&5>=j)
		{
			System.out.print(j);
			increment(i-1,j+1);
		}
	}
}
