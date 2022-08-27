				/* yield method */
class Thread1 extends Thread		
{
	public void run()
	{
	String name=Thread.currentThread().getName();		
		for(int i=1;i<=3;i++)
		{
			System.out.println(name);
			Thread.yield();  //yield() method
		}
	}
}
class Thread2 extends Thread		
{
	public void run()
	{
	String name=Thread.currentThread().getName();		
		for(int i=1;i<=3;i++)
		{
			System.out.println(name);

		}
	}
}
class Intex8Yield
{
	public static void main (String args[])
	{
	Thread1 t1 = new Thread1();
	Thread2 t2 = new Thread2();

	t1.start();

	t2.start();
	}

}