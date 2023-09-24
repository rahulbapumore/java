import java.util.*;
class StackImplementation
{
	public static void main(String args[])
	{
		Stack stk = new Stack();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("What would you like to do? Enter 1,2 or 3 accordingly");	
			System.out.println("Enter 1 for Push");	
			System.out.println("Enter 2 for pop");	
			System.out.println("Enter 3 for getting top element");	
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1: System.out.println("Enter number to push in stack");	
					stk.push(sc.nextInt());
					break;
				case 2: System.out.println("Element to be popped is "+stk.pop());
					break;
				case 3: System.out.println("Element at top is "+ stk.peek());
					break;
				default: System.out.println("Wrong choice!");
					break;			
					
			}
			
		}
	}
}
