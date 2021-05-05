package recursion;
/*
 * 1 2 3 4 5
   1 2 3 4 
   1 2 3
   1 2
   1
 */

public class Numberpattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numberpattern4 n = new Numberpattern4();
		n.pattern(1,1);
		//n.line(5);

	}

	public void pattern(int i,int j) {
		// TODO Auto-generated method stub
		if(i<=5)
		{
			line(i,j);
			System.out.println();
			pattern(i+1,j);
			
		}
		
		
	}
	public void line(int i,int j)
	{
		if(5>=i&&5>=j)
		{
			System.out.print(j);
			line(i+1,j+1);
		}
	}

}
