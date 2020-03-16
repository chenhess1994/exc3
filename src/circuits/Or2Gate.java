package circuits;
/**
 * Defining OR gate with only Two inputs
 * @author Idan & Chen
 */
public class Or2Gate extends OrGate {

	public Or2Gate(Gate gate1, Gate gate2) {
		super(new Gate[] { gate1, gate2 });
	}

}
