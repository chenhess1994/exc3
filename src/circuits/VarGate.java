package circuits;

public class VarGate extends Gate {

	private String name;
	private Boolean value;

	/**
	 * A constructor that defines the name of the variable.
	 *
	 * @param name
	 *            : String : the name of the gate
	 */
	public VarGate(String name) {
		super(null);
		this.name = name;
	}

	/**
	 * return the value of this gate. if value is not defined throwing
	 * CircuitException exception
	 *
	 */
	@Override
	protected boolean func(boolean[] inValues) throws CircuitException {

		if (value == null)
			throw new CircuitException();

		return value;

	}

	/**
	 * Returns the name with the letter V prefix
	 */
	@Override
	public String getName() {

		return "V" + name;
	}

	/**
	 * @param value
	 *            : set the boolean value of the gate
	 */
	public void setVal(Boolean value) {
		this.value = value;

	}
	/**
	 * simplifying the gate value.
	 * if 'value' of the gate is true return instance of true gate.
	 * false otherwise.
	 */
	@Override
	public Gate simplify() {
		if (value == null)
			return this;
		else if (value.equals(true)) {
			return TrueGate.instance();
		}
		return FalseGate.instance();

	}

}
