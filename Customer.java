class Bus implements Runnable      /*Mulithreading problem solve with method level Synchronization*/
{
	int available=2,passenger;     //2  
	Bus(int passenger)
	{
		this.passenger=passenger;    //passenger = 1
	}
		public synchronized void run()             // t1 t2 t3 run   //method level synchronized t1 or t2 or t3
		{
			String name=Thread.currentThread().getName();
			if(available >= passenger)    // 1 >= 1    // 2 >= 2  // 0 >= 2 
			{
				System.out.println(name+" got seat.");
				available=available-passenger;   // 1-1=0   // 2-2=0
			}
			else
			{
				System.out.println(name+" Sorry seat not availble.");
			}
		}	
}
class Customer
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Bus br= new Bus(1);      //2
		
		Thread t1= new Thread (br);
		Thread t2= new Thread (br);
		Thread t3= new Thread (br);
		
		t1.setName("Ram");
		t2.setName("Aasavari");
		t3.setName("Manish");
		
		t1.start();
		t2.start();
		t3.start();
	}
	
}
