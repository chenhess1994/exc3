package iterator;
/**
 * Receives an iterator and returns a string containing
 * all the numbers it generates until hasNext returns false
 * @author Idan & Chen
 *
 */
public class IteratorToString {
	public static String toString(Iterator it) {
		StringBuilder str = new StringBuilder("[");
		while(it.hasNext()) {
			str.append(it.next()+" ");
		}
		str.deleteCharAt(str.length()-1); // remove the last space
		str.append("]");
		return str.toString();
	}
}
