package images;
/**
 * BaseImage implements Image
 * @param width : int width
 * @param height : int height
 * @author Idan Abergel & Hen Hess
 */
public abstract class BaseImage implements Image{


	int width, height; // Image sizes

	/**
	 * BaseImage Contractor
	 * @param width : int width
	 * @param height : int height
	 */
	public BaseImage(int width, int height) {
		this.width = width;
		this.height = height;
	}



	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}
}
