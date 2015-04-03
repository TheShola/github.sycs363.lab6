package lab5;


/**
 * @author shola
 *
 */
public class IntegerArrayList {
	//Declare an array in the class IntegerArrayList
	private int[] array_name;
	//Data member that represents the size of the array
	private int array_end;
	//Constructor when the user doesn't specify the size of the array
	public IntegerArrayList()
	{
		array_end = 0;
		array_name = new int[10];
	}
	//Constructor when the user enters a specified size of the array
	/**
	 * @param entered_size
	 */
	public IntegerArrayList(int entered_size)
	{
		
		array_end = 0;
		array_name = new int[entered_size];
	}
	//Adds entered value to the end of the array
	/**
	 * @param value
	 */
	public void add(int value)
	{
		array_name[array_end] = value;
		array_end++;
	}
	//Returns entered value to entered index of the array
	/**
	 * @param value, index
	 */
	public void add(int value, int index)
	{
		if (index >= array_end)
		{
			array_end = index+1;
			array_name = new int[array_end];
			array_name[index] = value;
			array_end++;
		}
		else
		{
			array_name[index] = value;
			array_end++;
		}
		
	}
	//Returns integer value at specified index
	/**
	 * @param index
	 */
	public int get(int index)
	{
		return array_name[index];
	}
	//Returns index of the value entered and -1 if not found 
	/**
	 * @param value
	 */
	public int indexOf(int value)
	{
		for (int i = 0; i < array_end; i++)
		{
			if (array_name[i] == value)
			{
				return i;
			}
		}
		return -1;
	}
	//Returns true if array is empty
	public boolean isEmpty()
	{
		return (array_end == 0);
	}
	//Returns and removes the value in the specified index of the array
	/**
	 * @param index
	 */
	public int remove(int index)
	{
		int removed_value = array_name[index];
		for (int i = index; i < array_end; i++)
		{
			array_name[i] = array_name[i++];
		}
		array_end--;
		return removed_value;
	}
	public int end()
	{
		return array_end;
	}

}
