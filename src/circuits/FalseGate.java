package circuits;
/**
 * FalseGate defining one instance of the Gate
 *
 * @author Idan & Chen
 *
 */
public class FalseGate extends Gate {
	private static Gate f; // Singleton
	/**
	 * FalseGate Constructor
	 *
	 * @param inGates
	 */
	public FalseGate(Gate[]inGates) {
		super(inGates);
	}
	/**
	 *  FalseGate always FALSE
	 *  @return FALSE
	 */
	@Override
	protected boolean func(boolean[] inValues) {
		return false;
	}

	@Override
	public String getName() {
		return "F";
	}

	@Override
	public Gate simplify() {
		return this;
	}
	/**
	 * Singleton implementation
	 * @return FalseGate
	 */
	public static Gate instance() {
		return (f == null) ? f = new FalseGate(new Gate[] {}): f;
	}

}
