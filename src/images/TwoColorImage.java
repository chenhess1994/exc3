package images;
/**
 * Allows producing an image based on two colors.
 * This is done by using a function given to it in the constructor.
 * @author Idan
 *
 */
public class TwoColorImage extends BaseImage {

	private RGB zero,one;
	private TwoDFunc func;
	/**
	 *
	 * @param width : int
	 * @param height : int
	 * @param zero : RGB
	 * @param one  : RGB
	 * @param func < by Strategy method
	 */
	public TwoColorImage(int width, int height, RGB zero, RGB one, TwoDFunc func) {
		super(width, height);
		this.zero = zero;
		this.one = one;
		this.func = func;
	}
	/**
	 * using the given 'func' in the constructor to calculate the mix value
	 * mix value cannot be greater than one the smaller than 0
	 */
	@Override
	public RGB get(int x, int y) {
		double c = func.f((double) x / getWidth(), (double) y / getHeight());

		if (c > 1)
			return RGB.mix(one, zero, 1);

		if (c < 0)
			return RGB.mix(one, zero, 0);

		return RGB.mix(one, zero, c);

	}
}
