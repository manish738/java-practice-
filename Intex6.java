/*Thread Priority setPriority() and getPriority() method in java multithreading*/

class Intex extends Thread    
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
class Intex6
{
    public static void main(String args[])
	{
	Intex t1 = new Intex();
	Intex t2 = new Intex();
	Intex t3 = new Intex();

	t1.setName("t1 thread");
	t2.setName("t2 thread");
	t3.setName("t3 thread");

	t1.setPriority(2);
	t2.setPriority(6);
	t3.setPriority(7);   //if give value upto 10 it gives illegal exception

	t1.start();
	t2.start();
	t3.start();
	
	
	}
}