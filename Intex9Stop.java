				/* stop() method */
class A extends Thread		
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
class Intex9Stop
{
	public static void main (String args[])
	{
	A t1 = new A();
	A t2 = new A();
	A t3 = new A();

	t1.setName("t1 ram thread");
	t2.setName("t2 shela thread");
	t3.setName("t3 manish thread");

	t1.start();

	t2.start();

	t3.start();
	
	t2.stop();
	}

}