class Intex implements Runnable
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("My child Thread");
		}
	}
}
class Intex4
{
	public static void main(String args[])	 //1 thread
	{
		Intex r = new Intex();	 //1 thread
		
		Thread t = new Thread(r);   //1 thread
		t.start();  //2 thread main and new start t thread

		for(int i=1;i<=5;i++)
		{
			System.out.println("Main Thread");
		}
	}

}