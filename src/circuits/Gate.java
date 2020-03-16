package circuits;
/**
 * Is an abstract class that describes a general logical gate.
 * Its sub-classes will have specific logical gates.
 * @author idan & chen
 *
 */
public abstract class Gate {
	protected Gate[] inGates;

	/**
	 * Gate Constructor
	 *
	 * @param inGates
	 *            : Gate
	 */
	public Gate(Gate[] inGates) {
		this.inGates = inGates;
	}

	/**
	 * Calculates the boolean value of the gate. If you can not do this because
	 * not all the variables in the circle have a value set, throwing out the
	 * CircuitException exception.
	 *
	 * @return boolean value of the gate
	 * @throws CircuitException
	 */
	public boolean calc() throws CircuitException {
		if (inGates == null) {
			return func(null);
		}
		boolean values[] = new boolean[inGates.length];
		for (int i = 0; i < inGates.length; i++)
			values[i] = inGates[i].calc();
		return func(values);
	}

	/**
	 * An abstract method that calculates what the gate is supposed to calculate
	 * given a set of Boolean inputs.
	 *
	 * @param inValues
	 *            : boolean[]
	 * @throws CircuitException
	 */
	protected abstract boolean func(boolean[] inValues) throws CircuitException;

	/**
	 * Returns the gate name (abstract)
	 * @return gate name : String
	 */
	public abstract String getName();

	/**
	 * each gate has his simplify function
	 * @return simplified gate : Gate
	 */
	public abstract Gate simplify();

	/**
	 * Returns a representation as a string of the gateway.
	 * If the gate has no entrances, then write only his name.
	 * If it does, write its name,
	 * then square brackets the toString of each of its entry gates,
	 * with commas between them.
	 */
	public String toString() {

		if (inGates == null)
			return this.getName();
		StringBuilder s = new StringBuilder(getName());
		if (inGates.length >= 1) {
			s.append('[');
			for (int i = 0; i < inGates.length; i++) {
				if (inGates[i] != null)
					s.append(inGates[i].toString() + ", ");
			}
			s.deleteCharAt(s.length() - 1);
			s.deleteCharAt(s.length() - 1);
			s.append(']');
		}
		return s.toString();
	}

}
