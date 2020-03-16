package circuits;

/**
 * TrueGate defining one instance of the Gate
 *
 * @author Idan & Chen
 *
 */
public class TrueGate extends Gate {
	private static Gate t;

	/**
	 * TrueGate Constructor
	 *
	 * @param inGates
	 */
	public TrueGate(Gate[] inGates) {
		super(inGates);
	}

	/**
	 *  TrueGate always TRUE
	 *  @return TRUE
	 */
	@Override
	protected boolean func(boolean[] inValues) {
		return true;
	}

	@Override
	public String getName() {
		return "T";
	}

	@Override
	public Gate simplify() {
		return this;
	}
	/**
	 * Singleton implementation
	 * @return TrueGate
	 */
	public static Gate instance() {
		return (t == null) ? t = new TrueGate(new Gate[] {}) : t;
	}
}