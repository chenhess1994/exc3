package images;
/**
 * "Image over image" connection.
 * And it has the same behavior except at points where
 * both points are defined. The name of the new color
 * is according to the RGB mix method, where alpha is
 * given in the constructor
 *
 * @author Idan
 *
 */
public class Mix extends BinaryImageDecorator {
	private Image base1, base2;
	double alpha;

	/**
	 * Mix Constructor
	 * @param base1 : Image
	 * @param base2 : Image
	 * @param alpha : double -> gradient mixing parameter
	 */
	public Mix(Image base1, Image base2, double alpha) {
		super(base1.getWidth() > base2.getWidth() ? base1.getWidth() : base2.getWidth(),
				base1.getHeight() > base2.getHeight() ? base1.getHeight() : base2.getHeight());
		this.base1 = base1;
		this.base2 = base2;
		this.alpha = alpha;
	}
	/**
	 * calculating the pixel of the mix between the
	 * pictures by dividing the picture to 4 zones;
	 * <br>1. common
	 * <br>2. base 1 only
	 * <br>3. base 2 only
	 * <br>4. non of them - > black
	 */
	@Override
	public RGB get(int x, int y) {

		// ZONE 1
		if( x <= base1.getWidth() && y<=base1.getHeight() &&
				x <= base2.getWidth() && y<=base2.getHeight())
			return RGB.mix(base1.get(x, y), base2.get(x, y), alpha);

		// ZONE 2
		if( x <= base1.getWidth() && y<=base1.getHeight())
			return RGB.mix(base1.get(x, y), base1.get(x, y), alpha);

		// ZONE 3
	if( x <= base2.getWidth() && y<=base2.getHeight())
			return RGB.mix(base2.get(x, y), base2.get(x, y),alpha);
		// ZONE 4
		return RGB.BLACK;
	}

}
