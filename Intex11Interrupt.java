			/* Interrupt() method */
class A extends Thread
{	
	//thread Sleep()
	//@override
	public void run()
	{ 
		try
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println("t1 thread running");
				Thread.sleep(1000);	// waiting
			}
		}
		catch(InterruptedException i)
		{
			System.out.println("t1 thread terminated");
		}
	}
}
class Intex11Interrupt
{
	public static void main(String args[]) 
	{
	A t1 = new A();
 
 	t1.start();
	t1.interrupt();
	}
}