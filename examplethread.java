class A extends Thread
{
	public void run()
	{
	
		int i;
		for (i=0;i<=5;i++)
		{
			System.out.println("thread 1 : "+i);
		}
	}
}
class B extends Thread
{
	public void run()
	{
	
		int i;
		for (i=0;i<=5;i++)
		{
			System.out.println("thread 2 : "+i);
		}
	}
}
public class examplethread {

	public static void main (String [] args) {
		
		A o1 = new A();
		B o2 = new B();
		o1.start();
		o2.start();
		
		


	}

}
