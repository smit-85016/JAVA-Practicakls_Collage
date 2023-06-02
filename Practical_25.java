class Thread_exp extends Thread
{
	Thread_exp(String name)
	{
		super(name);
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
		System.out.println(Thread.currentThread().getName());
		try
		{
			if(Thread.currentThread().getName()=="Thread1")
			{
				Thread.sleep(1000);
			}
			else
			{
				Thread.sleep(2000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}
}
class Practical_25
{
	public static void main(String args[])
	
        System.out.println("216090307039");
		Thread_exp t1=new Thread_exp("Thread1");
		Thread_exp t2=new Thread_exp("Thread2");
		t1.start();
		t2.start();
	}
}