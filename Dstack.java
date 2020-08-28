
public class Dstack {

	int capacity = 2;
	int stack2[] = new int[capacity];
	int top =0;
	public void push(int data)
	{
		if(size() == capacity)
		{
			expand();
		}
		stack2[top] = data;
		top = top+1;
	}
	private void expand()
	{
		int length = size();
		int newstack [] = new int[capacity*2];
		for(int i=0;i<top;i++)
		{
			newstack[i] = stack2[i];
		}
		stack2 = newstack;
		capacity = capacity*2;
		
	}
	public int pop()
	{
		int data;
		top = top - 1;
		data = stack2[top];
		stack2[top] = 0;
		return data;
	}
	public void show()
	{
		for(int i=0;i<top;i++)
		{
			System.out.println(stack2[i] + " ");
		}
	}
	public int size()
	{
		return top;
	}


}
