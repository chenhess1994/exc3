package iterator;
/**
 *
 * @author idan
 *
 */
public class Fibonacci implements Iterator {
	private int upperBound;
	private int a = 1, b = 1;
	private int i = 0;
/**
 * Fibonacci constructor
 * @param upperBound : int to define the top bound of the series.
 */
	public Fibonacci(int upperBound) {
		this.upperBound = upperBound;
	}
/**
 *  check if there is next Fibonacci number in the
 *  series lower than the upperBound
 */
	@Override
	public boolean hasNext() {
		return (a + b) < upperBound;
	}
	/**
	 * @return int : the next number in Fibonacci series
	 * */
	@Override
	public int next() {
		if (!hasNext()) {
		//	if(upperBound < 3) return 1;
			return b;
		}
		if(i==0) {i++; return a;}
		if(i==1) {i++; return b;}
		i++;
		int t = a;
		a = b;
		b = t + b;
		return b;

	}

}
