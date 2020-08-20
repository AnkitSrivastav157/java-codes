public class runner {

	public static void main(String [] args)
	{
	
	LinkedList list = new LinkedList();
	list.insert(5);
	list.insert(21);
	list.insert(30);
	list.show();
	list.insertAt(0,401);
	list.insert(41);
	list.show();
	list.deleteAt(3);
	list.show();
}

}