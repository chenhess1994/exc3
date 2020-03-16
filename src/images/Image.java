package images;

/**
 * interface Image public int getWidth() <br>
 * public int getHeight() <br>
 * public RGB get(int x, int y)
 */
public interface Image {
	public int getWidth();

	public int getHeight();

	public RGB get(int x, int y);

}
