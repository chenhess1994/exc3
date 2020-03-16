package images;
/**
 * abstract class ImageDecorator extends BaseImage implements Image
 * this class will help us to define an image based
 * directly on one other image with the same dimensions
 * @author Idan & Chen
 *
 */
public abstract class ImageDecorator extends BaseImage implements Image {
	protected Image base;

	public ImageDecorator(int width, int height, Image base) {
		super(width, height);
		this.base = base;
	}

}
