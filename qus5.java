interface Shape {
	String info();
}


class Square implements Shape {

	private Integer length;
	private Integer breadth;

	public Square(Integer length, Integer breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public Integer getBreadth() {
		return breadth;
	}

	public void setBreadth(Integer breadth) {
		this.breadth = breadth;
	}

	@Override
	public String info() {
		return "A square with length : " + length + " breadth : " + breadth;
	}
}
class Triangle implements Shape {

	private Integer side1;
	private Integer side2;
	private Integer base;

	public Triangle(Integer side1, Integer side2, Integer base) {
		this.side1 = side1;
		this.side2 = side2;
		this.base = base;
	}

	public Integer getSide1() {
		return side1;
	}

	public void setSide1(Integer side1) {
		this.side1 = side1;
	}

	public Integer getSide2() {
		return side2;
	}

	public void setSide2(Integer side2) {
		this.side2 = side2;
	}
	public Integer getBase() {
		return base;
	}

	public void setBase(Integer base) {
		this.base = base;
	}

	@Override
	public String info() {
		return "A triangle with side1 : " + side1 + "  side2 : " + side2 + "  base : " +base;
	}
}
class ColoredShape implements Shape {
	private Shape shape;
	private String color;

	public ColoredShape(Shape shape, String color) {
		this.shape = shape;
		this.color = color;
	}

	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String info() {
		return shape.info() + " with color : " + color;
	}
}

class Decorator {

	public static void main(String[] args) {



		ColoredShape coloredShape = new ColoredShape(
				new Square(5,5),
				"BlueSquare");

		System.out.println(coloredShape.info());

		ColoredShape coloredShape1 = new ColoredShape(
				new Square(3,3),
				"RedSquare");

		System.out.println(coloredShape1.info());

		ColoredShape coloredShape2 = new ColoredShape(
				new Triangle(3,4,6),
				"PinkTriangle");

		System.out.println(coloredShape2.info());



	}
}
