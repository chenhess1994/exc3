package circuits;

public class CircuitException extends Exception {

	/**
	 * CircuitException return by default "error" message
	 */
	private static final long serialVersionUID = 4081258731210654545L;

	public CircuitException() {
		super("error");
	}
}