package images;
/**
 * Filter extends ImageDecorator
 *	@param filter : RGB color value
 * @author Idan Abergel & Hen Hess
 */
public class Filter extends ImageDecorator{

	private RGB filter;

	public Filter(Image base, RGB filter){
		super(base.getWidth(),base.getHeight(),base);
		this.filter = filter;
	}
	/**
	 * <b>get</b> a pixel / point of filtered image
	 *
	 * @param x : int x
	 * @param y : int y
	 * @return RGB one pixel
	 */
	@Override
	public RGB get(int x, int y) {

		return this.base.get(x,y).filter(filter);
	}
}
