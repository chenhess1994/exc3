package images;
/**
 * Linear Gradient creator
 * @param start : RGB start
 * @param end : RGB end
 *
 * @author Idan Abergel & Hen Hess
 */
public class Gradient extends BaseImage {

	private RGB start, end; // Gradient between two colors


	public Gradient(int width, int height, RGB start, RGB end) {
		super(width,height);
		this.start = start; // new?????
		this.end = end; // new?????
	}
	/**
	 * <b>get</b> a pixel / point of linear gradient image
	 *
	 * @param x : int x
	 * @param y : int y
	 * @return RGB one pixel
	 */
	public RGB get(int x, int y) {
		return RGB.mix(end,start,(double)x/width);
	}

}
