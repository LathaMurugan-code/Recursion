package recursion;
/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
6 6 6 6 6 6
7 7 7 7 7 7 7*/

public class Numberpattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Numberpattern2 n = new Numberpattern2();
		n.row(1);

	}
	public void row(int i)
	{
		if(i<=7) {
			column(i,i);
			System.out.println();
			row(i+1);
		}
		
	}
	public void column(int i,int j) {
		if(i>=1)
		{
			System.out.print(j);
			column(i-1,j);
		}
	}

}
