package collision;

import collision.Vector2D.VectorMath;

public class Driver {

	public static void main(String[] args) {

		Vector2D a = new Vector2D(1, 1);
		Vector2D b = new Vector2D(2, 2);

		Vector2D add = VectorMath.add(a, b);
		Vector2D subtract = VectorMath.subtract(a, b);
		Vector2D negate = VectorMath.negate(a);
		Vector2D multiply = VectorMath.multiply(a, 10f);
		Vector2D divide = VectorMath.divide(b, 2f);
		Vector2D rotate = VectorMath.rotate(a, 90);
		float dot = VectorMath.dotProduct(a, b);

		System.out.println("Vector A");
		System.out.println("X: " + a.x + " Y: " + a.y);

		System.out.println("Vector B");
		System.out.println("X: " + b.x + " Y: " + b.y);

		System.out.println("Add a + b");
		System.out.println("X: " + add.x + " Y: " + add.y);

		System.out.println("Subtract a + b");
		System.out.println("X: " + subtract.x + " Y: " + subtract.y);

		System.out.println("Negate A");
		System.out.println("X: " + negate.x + " Y: " + negate.y);

		System.out.println("Assert Vector");
		VectorMath.assertEqualVectors(a, b);

		System.out.println("Multiply Vector A by scalar 10");
		System.out.println("X: " + multiply.x + " Y: " + multiply.y);

		System.out.println("Divide Vector B by scalar 2");
		System.out.println("X: " + divide.x + " Y: " + divide.y);

		System.out.println("Length of Vector B");
		System.out.println(VectorMath.length(b));

		System.out.println("Rotate Vector");
		System.out.println("X: " + rotate.x + "Y: " + rotate.y);

		System.out.println("Dot Product of Vector a and b");
		System.out.println(dot);

	}

}
