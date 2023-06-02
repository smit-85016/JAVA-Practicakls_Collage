class thread_exmp extends Thread
{
	int count=1;
	static int Max=20;
	thread_exmp(String str){super(str);}
	synchronized public void odd_num()
	{
		while(count<=Max)
		{
			if(count%2==1)
			{
				System.out.println(Thread.currentThread().getName()+":OddNUmber:"+count);
			}
			count++;
		}
	}
	synchronized public void even_num()
	{
		while(count<=Max)
		{
			if(count%2==0)
			{
				System.out.println(Thread.currentThread().getName()+":EvenNUmber:"+count);
			}
			count++;
		}
	}
	public void run()
	{
		try
		{
			if(Thread.currentThread().getName()=="Thread1") 
			{
				odd_num();
			}
			else
			{
				even_num();
			}
		}
		catch(Exception e) 
		{
               e.printStackTrace();
        }
	}
}
class Practical_25
{
	public static void main(String args[])
	{
        System.out.println("216090307039");
		thread_exmp t1=new thread_exmp("Thread1");
		thread_exmp t2=new thread_exmp("Thread2");
		t1.start();
		t2.start();
	}
}