package recursion;

public class FiboSing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			  FiboSing fb =new FiboSing();
			  fb.fibonacci(10,-1,1);
			}
			public void fibonacci(int count,int f1,int s1)
			{
				if(count>0)
				{
			int t1=f1+s1;
			System.out.println(t1);
			fibonacci(count-1,s1,t1);
			}
			
						
			}
		

	}


