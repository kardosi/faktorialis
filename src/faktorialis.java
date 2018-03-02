
public class faktorialis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fakt=faktorialis(10);
		System.out.println();

	}
	public static int faktorialis(int limit)
	{
		int fakt=1;
		for(int i=1; i<=limit;i++)
		{
			fakt*=i;
			System.out.println(fakt);
		}
		return(fakt);
	}

}
