package circuits;
/**
 * AND Gate is kind of Gate
 * @author Idan & Chen
 *
 */
public class AndGate extends Gate {

	public AndGate(Gate[] inGates) {
		super(inGates);
	}
	/**
	 * calculating the value of the inputs connected to the gate.
	 * if all the inputs are TRUE it will return TRUE
	 * otherwise, return false.
	 */
	@Override
	protected boolean func(boolean[] inValues) {

		for (boolean g : inValues)
			if (!g)
				return false;
		return true;

	}

	@Override
	public String getName() {
		return "AND";
	}

	@Override
	public Gate simplify() {
		int count = 0, index = 0;
		Gate[] res = new Gate[inGates.length];
		for (int i = 0; i < inGates.length; i++)
			res[i] = inGates[i].simplify();
		for (int i = 0; i < inGates.length; i++) {
			if (res[i] instanceof FalseGate)
				return FalseGate.instance();

			if (!(res[i] instanceof TrueGate))
				count++;
		}
		if (count == 0) {
			return TrueGate.instance();

		} else {
			Gate[] Temp = new Gate[count];
			for (int i = 0; i < inGates.length; i++) {
				if (!(res[i] instanceof TrueGate)) {
					Temp[index] = res[i];
					index++;
				}
			}
			if (count == 1) {
				return Temp[0];
			} else {
				return new AndGate(Temp);
			}
		}

	}


}
