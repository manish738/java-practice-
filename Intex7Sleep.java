class Intex1 extends Thread
{	//thread Sleep()
	//@override
	public void run()
	{
		String n = Thread.currentThread().getName(); 
		try
		{
			for(int i=1;i<=3;i++)
			{
				System.out.println(n);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException i)
		{
		}
	}
}
class Intex7Sleep
{
	public static void main(String args[]) 
	{
	Intex t1 = new Intex();
	Intex t2 = new Intex();
	Intex t3 = new Intex();

	t1.setName(" thread 1");
	t2.setName(" thread 2");
	t3.setName(" thread 3");

	t1.start();
	t2.start();
	t3.start();
			
	}

}
  