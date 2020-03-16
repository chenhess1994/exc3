package circuits;
/**
 * OR Gate is kind of Gate
 * @author Idan & Chen
 *
 */
public class OrGate extends Gate {

	public OrGate(Gate[] inGates) {
		super(inGates);
	}
	/**
	 * calculating the value of the inputs connected to the gate.
	 * if one of the inputs is true, return TRUE
	 * otherwise, return false.
	 */
	@Override
	protected boolean func(boolean[] inValues) {
		for (boolean g : inValues)
			if (g)
				return true;
		return false;
	}

	@Override
	public String getName() {
		return "OR";
	}

	@Override
	public Gate simplify() {
		int count = 0, index = 0;
		Gate[] res = new Gate[inGates.length];
		for (int i = 0; i < inGates.length; i++) {
			res[i] = inGates[i].simplify();
		}
		for (int i = 0; i < inGates.length; i++) {
			if (res[i] instanceof TrueGate)
				return TrueGate.instance();
			if (!(res[i] instanceof FalseGate)) {
				count++;
			}
		}

		if (count == 0) {
			return FalseGate.instance();

		} else {
			Gate[] Temp = new Gate[count];
			for (int i = 0; i < inGates.length; i++) {
				if (!(res[i] instanceof FalseGate))
					Temp[index] = res[i];
			}
		}
		if (count == 0) {
			return FalseGate.instance();
		} else {
			Gate[] Temp1 = new Gate[count];
			for (int i = 0; i < inGates.length; i++) {
				if (!(res[i] instanceof FalseGate)) {
					Temp1[index] = res[i];
					index++;
				}

			}
			if (count == 1) {
				return Temp1[0];
			} else {
				return new OrGate(Temp1);
			}

		}
	}

}
