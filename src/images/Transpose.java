package images;

/**
 * Creates a mirror image of the original image when the main diagonal is the
 * axis. Simply put: x becomes y, and y becomes x.
 *
 * @author idan
 *
 */
public class Transpose extends ImageDecorator {
	/**
	 *
	 * @param base
	 *            Image to be Transposed
	 */
	public Transpose(Image base) {
		super(base.getHeight(), base.getWidth(), base);
	}

	@Override
	public RGB get(int x, int y) {

		return this.base.get(y, x);
	}
}
