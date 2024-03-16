package Program06;

public class DynArray 
{
	private double[] array;
	private int size;
	private int nextIndex;
	public DynArray()
	{
		this.array  =  new double[1];
		this.size = 1;
		this.nextIndex = 0;
	}  
	public int arraySize()
	{
		return this.size;
	}
	public int elements()
	{
		return this.nextIndex;
	}
	public double at(int index)
	{
		if(0 <= index && index < this.elements())
		{
			return this.array[index];
		}
		else
		{
			return Double.NaN;
		}
	}
	private void grow()
	{
		this.size = this.elements() * 2;
		double[] newarray = new double[this.arraySize()];
		double[] temp = this.array;
		this.array = newarray;
		for(int x = 0; x < this.elements(); ++x )
		{
			this.array[x] = temp[x];
		}
	}
	private void shrink()
	{
		int newSize = this.arraySize() / 2;
		this.size = newSize;
		double[] newArray = new double[newSize];
		double[] temp = this.array;
		this.array = newArray;
		for(int x = 0; x < newSize; ++x)
		{
			this.array[x] = temp[x];
		}
	}
	public void insertAt(int index, double value)
	{
		if(0 <= index && index <= this.elements())
		{
			if(this.arraySize() <= this.elements())
			{
				this.grow();
			}
			if(index == this.elements())
			{
				this.array[index] = value;
				++this.nextIndex;
			}
			else
			{
				int shiftElements = this.elements();
				for(int x = index; x < this.elements(); ++x)
				{
					this.array[shiftElements] = this.array[shiftElements - 1];
					--shiftElements;
				}
				this.array[index] = value;
				++this.nextIndex;
			}
		}
	}
	public void insert(double value)
	{
		this.insertAt(this.elements(), value);
	}
	public double removeAt(int index)
	{
		if(0 <= index && index < this.elements())
		{
			double value;
			if(index == this.elements() - 1)
			{
				value = this.at(index);
				this.array[index] = 0.0;
				--this.nextIndex;
			}
			else
			{
				value = this.at(index);
				for(int x = index;x < this.elements() - 1;++x )
				{
					this.array[index] = this.array[index + 1];
					++index;
				}
				--this.nextIndex;
			}
			if(this.arraySize() > (this.elements() * 2))
			{
				this.shrink();
			}
			return value;
		}
		else
		{
			return Double.NaN;
		}
	}
	public double remove()
	{
		return this.removeAt(this.elements() - 1);
	}
	public void printArray()
	{
		System.out.print("[");
		for(int x = 0; x <= this.elements() - 1;++x)
		{
			System.out.print(this.at(x));
			if(x == this.elements() - 1)
			{
				break;
			}
			for(int y = 0; y < 1; ++y)
			{
				System.out.print("," + " ");
			}
		}
		System.out.print("]");
	}
}
