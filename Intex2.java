class Intex1 extends Thread
{
	//@override
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("Manish");
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException i)
		{
		}
	}
}
class Intex2
{
	public static void main(String args[]) throws InterruptedException
	{
		Intex1 t = new Intex1();
		t.start();
		
		for(int i=1;i<=5;i++)
			{
				System.out.println("Pathak");
				Thread.sleep(1000);
			}	
	}

}
// by extending thread class
/*Using run(); method  and  t thread using multithreading output take only 5 seconds */