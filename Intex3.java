class Intex1 extends Thread
{
	public void fun()
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
class Intex3
{
	public static void main(String args[]) throws InterruptedException
	{
		Intex1 t = new Intex1();
		t.fun();
		for(int i=1;i<=5;i++)
			{
				System.out.println("Pathak");
				Thread.sleep(1000);
			}	
	}

}
// by extending thread class
/*Using fun(); method  thread use only main thread output take only 10 seconds */