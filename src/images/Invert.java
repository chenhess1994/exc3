
package images;

/**
 * The color at the point is the opposite of the color in the original image.
 *
 * @author idan
 *
 */
public class Invert extends ImageDecorator {

	/**
	 * Invert Constructor
	 *
	 * @param base
	 *            : Image
	 */
	public Invert(Image base) {
		super(base.getWidth(), base.getHeight(), base);
	}

	/**
	 * using RGB.invert method to invert a pixel
	 */
	@Override
	public RGB get(int x, int y) {
		return this.base.get(x, y).invert();
	}
}
