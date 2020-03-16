package circuits;

/**
 * NotGate is a kind of Gate
 * @author Idan & Chen
 *
 */
public class NotGate extends Gate {

	/**
	 * NotGate constructor
	 * @param in : Gate
	 */
	public NotGate(Gate in) {
		super(new Gate[] {in}); // create new Gate with only one variable
	}

	/**
	 * NotGate func:
	 * if one of the input gates is true, return false.
	 * otherwise return true
	 */
	@Override
	protected boolean func(boolean[] inValues) {
		for (boolean g : inValues)
			if (g)
				return false;
		return true;
	}


	@Override
	public String getName() {
		return "NOT";
	}

	/**
	 *  simplifying NotGate
	 */
	@Override
	public Gate simplify() {
		Gate temp;
		temp = inGates[0].simplify();
		if (temp instanceof TrueGate) {
			return FalseGate.instance();
		}
		if (temp instanceof FalseGate) {
			return TrueGate.instance();
		}
		if (inGates[0] instanceof NotGate) {
			return inGates[0].inGates[0].simplify();
		}
		return this;
	}


}
