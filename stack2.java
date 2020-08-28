
public class stack2 {

	int stack2[] = new int[200];
	int top =0;
	public void push(int data)
	{
		stack2[top] = data;
		top = top+1;
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

}
