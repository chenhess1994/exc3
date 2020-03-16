package images;

public class RGB {

	private double r,g,b;

	public static final RGB BLACK = new RGB(0);
	public static final RGB WHITE = new RGB(1);
	public static final RGB RED = new RGB(1,0,0);
	public static final RGB GREEN = new RGB(0,1,0);
	public static final RGB BLUE = new RGB(0,0,1);

	public RGB(double red, double green, double blue) {
		r=red;
		g=green;
		b=blue;
	}

	public RGB(double grey) {
		r=grey;
		g=grey;
		b=grey;
	}

	public double getRed() {
		return r;
	}

	public double getBlue() {
		return b;
	}

	public double getGreen() {
		return g;
	}

	public RGB invert() {
		return new RGB(	1-this.r,
						1-this.g,
						1-this.b);
	}

	public RGB filter(RGB filter) {
		return new RGB(	filter.r*this.r,
						filter.g*this.g,
						filter.b*this.b);
	}

	public static RGB superpose(RGB rgb1, RGB rgb2) {
		return new RGB(		(rgb1.r + rgb2.r) >=1 ? 1 :(rgb1.r + rgb2.r),
							(rgb1.g + rgb2.g) >=1 ? 1 :(rgb1.g + rgb2.g),
							(rgb1.b + rgb2.b) >=1 ? 1 :(rgb1.b + rgb2.b));
	}

	public static RGB mix(RGB rgb1, RGB rgb2, double alpha) { // alpha * color1 + (1-alpha) * color2
		RGB a = new RGB(rgb1.r*(alpha),rgb1.g*(alpha),rgb1.b*(alpha));
		RGB b = new RGB(rgb2.r*(1-alpha),rgb2.g*(1-alpha),rgb2.b*(1-alpha));
		//System.out.println(superpose(a,b));
		return superpose(a,b);
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("<");
		str.append(String.format("%.4f", r));
		str.append(", ");
		str.append(String.format("%.4f", g));
		str.append(", ");
		str.append(String.format("%.4f", b));
		str.append(">");
		return str.toString();
	}

}
