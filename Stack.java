
public class Stack
{
	private int arr[];
	private	int top = -1;
	public Stack()
	{
		arr = new int[1000];
	}
	public int peek()
	{
		if(top == -1)
		{
			System.out.println("stack is empty");
			return -1;
		}
		else
		{
			return arr[top];
		}
	}

	public boolean push(int element)
	{

		if(top == 999)
		{
			System.out.println("Stack overflow");
			return false;
		}
		else
		{
			arr[++top] = element;
			return true;
		}	
	}

	public int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		else
		{
			
			return arr[top--];
		}
	}
	
	
}
