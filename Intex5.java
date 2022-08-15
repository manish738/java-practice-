class Intex extends Thread    /*Thread Schedular*/
{
	public void run()
	{
		String n = Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(n);
		}
	}
}
class Intex5
{
    public static void main(String args[])
	{
	Intex t1 = new Intex();
	Intex t2 = new Intex();
	Intex t3 = new Intex();

	t1.setName("thread 1");
	t2.setName("thread 2");
	t3.setName("thread 3");

	t1.start();
	t2.start();
	t3.start();
	
	String n = Thread.currentThread().getName();
		for(int i=1;i<=3;i++)
		{
			System.out.println(n);
		}
	}
}