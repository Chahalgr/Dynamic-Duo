package Program06;

public class Stack extends DynArray
{
	public Stack()
	{
		super();
	}
	public int size()
	{
		return super.elements();
	}
	public boolean isEmpty()
	{
		return this.size() == 0;
	}
	public void push(double value)
	{
		super.insert(value);
	}
	public double pop()
	{
		if(!this.isEmpty())
		{
			return super.remove();
		}
		else
		{
			return Double.NaN;
		}
	}
	public void stackDump()
	{
		for(int x = this.size() - 1; x >= 0 ;--x)
		{
			System.out.println("Pop = " + super.at(x));
		}
	}
}
