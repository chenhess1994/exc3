package iterator;
/**
 * Array implements Iterator
 * Every call to the next next, to the last.
 * Continue reading to Next is throwing an exception to
 * IndexOutOfBoundsException
 *
 * @author Idan & Chen
 *
 */
public class Array implements Iterator{

	private int[] array;
	private int i = 0;
	/**
	 * Array constructor
	 * @param array : array of int
	 */
	public Array(int[] array) { // Constructor
		this.array = array;
	}
	/**
	 * check if there is more number in the series
	 * @return True if yes, False otherwise.
	 */
	@Override
	public boolean hasNext() {
		return i < array.length;
	}
	/**
	 * @return int : the next number in the series.
	 */
	@Override
	public int next() {
		if (!hasNext())
			throw new IndexOutOfBoundsException();
		return array[i++];
	}

}
