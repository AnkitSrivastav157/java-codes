
public class LinkedList 
{

	Node head;
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head==null)
		{
			head= node;
			
		}
		else
		{
			Node n = head;
			while(n.next != null)
			{
				n = n.next;
			}
			n.next = node;
	     }		
		
	}	
	


public void show()
{
	Node node = head;
	while(node.next != null)
	{
		System.out.println(node.data);
		node = node.next;
	}
	System.out.println(node.data);
}
public void insertAtstart(int data)
{
	 Node n = new Node();
	 n.data = data;
	 n.next = null;
	 n.next = head;
	 head = n;
	 
	 
}
public void insertAt(int index, int data)
{

	Node n = new Node();
	n.data = data;
	n.next = null;
	Node node = head;
	int i;
	if(index == 0)
	{
		insertAtstart(data);
	}
	else 
	{
	for(i=0;i<index-1;i++)
	{
		node = node.next;
	}
	n.next = node.next;
	node.next= n;
	
	
}

}
public void deleteAt(int position)
{
	Node node = new Node();
	if(position == 0)
	{
		head = head.next;
	}
	else
	{
		Node n = null;
		Node n1 = null;
		n = head;
		int i;
		for(i=0;i<position-1;i++)
		{
			n= n.next;
		}
		n1 = n.next;
		n.next = n1.next;
	}
	
	
	
	
	
	
	
	
	
}
}














