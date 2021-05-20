package recursion;

public class BasicProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicProgram b = new BasicProgram();
		b.printNos(1);

	}
	public void printNos(int i)
	{
		if(i<=10)
		{
	    System.out.print(i+" ");
		printNos(i+1);
		
		}
		
	}

}
/*
 * printNos(10);
 * printNos(9);
 * printNos(8);
 * printNos(7);
 * printNos(6);
 * printNos(5);
 * printNos(4);
 * printNos(3);
 * printNos(2);
 * printNos(1);
*/
