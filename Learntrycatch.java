class Learntrycatch
{
	public static void main(String args[])
	{
		System.out.println("Main method started");
		int a=10,b=0,c;
		try{
		c=a/b;    //c=10/0
		System.out.println(c);
		}
		catch(Exception e)
		{
		System.out.println("can't divided by zero");
		}
		System.out.println("Main method ended");
	}
}