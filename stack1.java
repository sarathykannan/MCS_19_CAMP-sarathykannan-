import java.util.*;

class stack1
{
	private int arr[];
	private int top;
	private int capacity;

	// Constructor to initialize stack
	stack1(int size)
	{
		arr = new int[size];
		capacity = size;
		top = -1;
	}

	// Utility function to add an element x in the stack
	public void push(int x)
	{
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated\n");
			System.exit(1);
		}

		System.out.println("Inserting " + x);
		arr[++top] = x;
	}

	// Utility function to pop top element from the stack
	public int pop()
	{
		// check for stack underflow
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Removing " + peek());

		// decrease stack size by 1 and (optionally) return the popped element
		return arr[top--];
	}

	// Utility function to return top element in a stack
	public int peek()
	{
		if (!isEmpty())
			return arr[top];
		else
			System.exit(1);

		return -1;
	}

	// Utility function to return the size of the stack
	public int size()
	{
		return top + 1;
	}

	// Utility function to check if the stack is empty or not
	public Boolean isEmpty()
	{
		return top == -1;	// or return size() == 0;
	}

	// Utility function to check if the stack is full or not
	public Boolean isFull()
	{
		return top == capacity - 1;	// or return size() == capacity;
	}

	public static void main (String[] args)
	{ int size;
		
                Scanner sc =new Scanner(System.in);
      
        System.out.println("enter the stack capacity");
        size=sc.nextInt();
        stack1 stack = new stack1(size);
      
        int ch,x;
        do{
            System.out.println("enter your choice \n1.push\n2.pop\n3.stacktop,4.exit");
        
                ch=sc.nextInt();
                 switch(ch)
                 {
                     case 1:System.out.println("enter the value ");
                     x=sc.nextInt();stack.push(x);break;
                     case 2:stack.pop();break;
                     case 3:stack.peek();break;
                     case 4:System.exit(1);
                 }
        }while(ch<=3);

		

		System.out.println("Top element is: " + stack.peek());
		System.out.println("Stack size is " + stack.size());

		if (stack.isEmpty())
			System.out.println("Stack Is Empty");
		else
			System.out.println("Stack Is Not Empty");
	}
}