package recursion;

public class NumberPatternRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPatternRecursion n = new NumberPatternRecursion();
		n.callNo(7);
		//n.number(1,1);
	}
	public void callNo(int n)
	{
		if(n>=1)
		{
			number(n,1);
			System.out.println();
			callNo(n-1);
		}
		
		}
	public void number(int v,int n)
	{  
		if(7>=v) {
		System.out.print(n+" ");
		number(v+1,n+1);
		}
	}

}
