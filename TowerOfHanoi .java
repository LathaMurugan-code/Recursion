package recursion;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tower(3,'A','C','B');

	}
	public static void tower(int n,char from,char to,char mid)
	{
		if(n==1)
		{
			System.out.println("Move from disk 1 "+from+"to"+to);
			return;
		}
		tower(n-1,from,mid,to);
		System.out.println("Move from disk "+from+"to"+to);
		tower(n-1,mid,to,from);
	}

}
