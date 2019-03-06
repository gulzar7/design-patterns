interface Shape1 {
	void draw();
}
class Regular implements Shape1 {

	@Override
	public void draw() {
		System.out.println("Inside Regular Polygon::draw() method.");
	}
}
class Irregular implements Shape1 {

	@Override
	public void draw() {
		System.out.println("Inside Irreguar Square::draw() method.");
	}
}
class Quadrilateral implements Shape1 {

	@Override
	public void draw() {
		System.out.println("Inside Quadrilateral Square::draw() method.");
	}
}
class Pentagon implements Shape1 {

	@Override
	public void draw() {
		System.out.println("Inside Pentagon Square::draw() method.");
	}
}
class ShapeFactory {

	//use getShape method to get object of type shape
	public Shape1 getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("Regular")) {
			return new Regular();

		} else if (shapeType.equalsIgnoreCase("Irregular")) {
			return new Irregular();
		} else if (shapeType.equalsIgnoreCase("Quadrilateral")) {
			return new Quadrilateral();
		} else if (shapeType.equalsIgnoreCase("Pentagon")) {
			return new Pentagon();

		}
		return null;
	}
}
class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		//get an object of Regular Polygon and call its draw method.
		Shape1 shape1 = shapeFactory.getShape("Regular");

		//call draw method of Regular
		shape1.draw();

		//get an object of Irregular Polygon and call its draw method.
		Shape1 shape2 = shapeFactory.getShape("Irregular");

		//call draw method of Irregular
		shape2.draw();

		//get an object of Quadrilateral Polygon and call its draw method.
		Shape1 shape3 = shapeFactory.getShape("Quadrilateral");

		//call draw method of Quadrilateral
		shape3.draw();

		//get an object of Pentagon Polygon and call its draw method.
		Shape1 shape4 = shapeFactory.getShape("Pentagon");

		//call draw method of Pentagon
		shape4.draw();

	}
}