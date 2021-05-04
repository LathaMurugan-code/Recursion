package recursion;

public class PatternRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PatternRecursion p= new PatternRecursion();
		p.row(1);
		//p.colStar(4);

	}
	public void row(int n)
	{
	    if(n<=4) {
		colStar(n);
		System.out.println();
		row(n+1);
	    }
	    
	}
	public void colStar(int m) {
		// TODO Auto-generated method stub
		if(1<=m)
		{
			System.out.print("* ");
			colStar(m-1);
		}
		
		
	}

}
