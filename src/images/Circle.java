package images;
/**
 * BaseImage implements Image
 * @param centerX : int centerX
 * @param centerY : int centerY
 * @param center : RGB center
 * @param outside : RGB outside
 *
 *
 * @author Idan Abergel & Hen Hess
 */
public class Circle extends BaseImage{
	private int centerX,centerY,radius;
	private RGB center, outside;
	/**
	 * Circle Constructor
	 * Create Circle Gradient for an asymmetrical image
	 * @param width : int width
	 * @param height : int height
	 * @param centerX : int centerX
	 * @param centerY : int centerY
	 * @param center : RGB center
	 * @param outside : RGB outside
	 */
	public Circle(int width, int height, int centerX,
			int centerY, int radius, RGB center, RGB outside) {
		super(width,height);

		this.centerX=centerX;
		this.centerY=centerY;
		this.radius=radius;

		this.center=center;
		this.outside=outside;
	}
	/**
	 * Circle Constructor
	 * Create Circle Gradient for a <U>symmetrical</U> image
	 * @param size : int size
	 * @param radius : int radius
	 * @param center : RGB center
	 * @param outside : RGB outside
	 */
	public Circle(int size, int radius, RGB center, RGB outside) {
		super(size,size);

		this.centerX=size/2;
		this.centerY=size/2;
		this.radius=radius;

		this.center=center;
		this.outside=outside;
	}

	/**
	 * <b>get</b> a pixel / point of circle gradient image
	 *
	 * @param x : int x
	 * @param y : int y
	 * @return RGB one pixel
	 */
	@Override
	public RGB get(int x, int y) {
		double dx,dy,d;
		dx = Math.pow((double)(x-centerX),2.0);
		dy = Math.pow((double)(y-centerY),2.0);
		d= Math.sqrt(dx+dy);

		if(d< this.radius)
			return RGB.mix(outside,center, d/this.radius);

			else  return  outside;
	}
}
