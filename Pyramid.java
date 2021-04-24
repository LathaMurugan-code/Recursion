package recursion;

public class Pyramid {
	
		 public static void main(String[] args) {
		  // TODO Auto-generated method stub
		Pyramid rp = new Pyramid();
		rp.printcall(5);
		 }
		public  void printcall(int j)
		{
		if(j>=1)
		{
		 printSpace(j);
		 printStar(j);
		 System.out.println();
		 printcall(j-1);
		}
		}
		public void printSpace(int i)
		 {
		if(i>=1 )
		{
		 System.out.print(" ");
		 printSpace(i-1);
		}
		 }
		public void printStar(int k)
		{
		if(k<=5)
		{
		 System.out.print("* ");
		 printStar(k+1); 
		}
		}
		

}
