class Intex8JoinMethod extends Thread
{    
	public void run()
	{ 
String name=Thread.currentThread().getName();   
		for(int i=1;i<=3;i++)
		{    
   		try
		{    	
    			Thread.sleep(500);    
   		}
		catch(Exception e)
		{	
			System.out.println(e);
		}    
  		System.out.println(name);    
  		}    
 	}    

public static void main(String args[])
	{    
 	Intex8JoinMethod t1=new Intex8JoinMethod();    
 	Intex8JoinMethod t2=new Intex8JoinMethod();    
 	Intex8JoinMethod t3=new Intex8JoinMethod();    
 
t1.setName("Thread 1");
t2.setName("Thread 2");	
t3.setName("Thread 3");
	
	t2.start();    
 	try
	{    
  		t1.join();    
 	}	
	catch(Exception e)
	{
		System.out.println(e);
	}    
    
 	t1.start();    
 	t3.start();    
 }    
}    