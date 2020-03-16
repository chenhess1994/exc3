package images;
/**
 * BinaryImageDecorator  extends BaseImage implements Image
 *
 * @author Idan Abergel & Hen Hess
 */
public class BinaryImageDecorator  extends BaseImage implements Image{
	/**
	 * BinaryImageDecorator Contractor
	 * @param width : int width
	 * @param height : int height
	 */
	public BinaryImageDecorator(int width, int height){
	super(width, height);
	}

	@Override
	public  RGB get(int x, int y) {
		return null;
	}


}
