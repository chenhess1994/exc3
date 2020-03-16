package circuits;
/**
 * Defining AND gate with only Two inputs
 * @author Idan & Chen
 */
public class And2Gate extends AndGate{
/**
 *
 * @param gate1 : Gate
 * @param gate2 : Gate
 */
	public And2Gate(Gate gate1, Gate gate2) {
		super(new Gate [] {gate1,gate2});
	}
}
