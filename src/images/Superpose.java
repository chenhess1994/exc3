package images;
/**
 * The image is based on two base images.
 * The width of the image is the maximum of their widths,
 * and its height is the maximum height.
 * @author Idan
 *
 */
public class Superpose extends BinaryImageDecorator{

	private Image base1, base2 ;
	/**
	 * Superpose Constructor
	 * @param base1 : Image
	 * @param base2 : Image
	 */
	public Superpose(Image base1, Image base2) {
		super(base1.getWidth()>base2.getWidth()? base1.getWidth() : base2.getWidth(),
				base1.getHeight()>base2.getHeight()? base1.getHeight() : base2.getHeight());
		this.base1 = base1;
		this.base2 = base2;
	}
	/**
	*At each point the color is:
	* If both images are set at this point, the color is by the RGB superpose method.
	* If only one, then the color is 'one' color.
	* If no one is defined at a point, then the color is black.
	 */
	@Override
	public RGB get(int x, int y) {
		if( x <= base1.getWidth() && y<=base1.getHeight() &&
			x <= base2.getWidth() && y<=base2.getHeight())
				return RGB.superpose(base1.get(x,y),base2.get(x,y));

		if( x <= base1.getWidth() && y<=base1.getHeight())
			return base1.get(x,y);
		if( x <= base2.getWidth() && y<=base2.getHeight())
			return base2.get(x,y);

		return RGB.BLACK;
	}



}
