package recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries f = new FibonacciSeries();
		f.fibonacci(-1, 1);

	}
	public void fibonacci(int first, int second)
	{   
		if((first+second)<30) 
			//if (first<30)
			//if(second<30)
		{
		int third =first+second;
		System.out.print(third+" ");
		//System.out.print((first+second)+" ");
		//fibonacci(second,(first+second));
		//without using third variable
		}
		else
			return;
		
	}

}
