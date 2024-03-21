package DynamicArray;
public class Queue extends DynArray
{
	public Queue()
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
	public void que(double value)
	{
		super.insert(value);
	}
	public double deQue()
	{
		if(!this.isEmpty())
		{
			return super.removeAt(0);
		}
		else
		{
			return Double.NaN;
		}
	}
	public void queueDump()
	{
		for(int x = 0; x <= this.size() - 1 ;++x)
		{
			System.out.println("array.at(" + x + ") = " + this.at(x));
		}
	}
}
