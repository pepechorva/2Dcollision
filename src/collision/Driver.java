package collision;

import collision.Vector2D.VectorMath;

public class Driver {

	public static void main(String[] args) {
	
		Vector2D a = new Vector2D(1,1);
		Vector2D b = new Vector2D(2,2);
		
		Vector2D add = VectorMath.Add(a, b);
		Vector2D subtract = VectorMath.Subtract(a, b);
		Vector2D negate = VectorMath.Negate(a);
		
		System.out.println("Vector A");
		System.out.println("X: " +a.x + " Y: " + a.y);
		
		System.out.println("Vector B");
		System.out.println("X: " +b.x + " Y: " + b.y);
		
		System.out.println("Add a + b");
		System.out.println("X: " +add.x + " Y: " + add.y);
		
		System.out.println("Subtract a + b");
		System.out.println("X: " +subtract.x + " Y: " + subtract.y);
		
		System.out.println("Negate A");
		System.out.println("X: " +negate.x + " Y: " + negate.y);
		
		System.out.println("Assert Vector");
		VectorMath.AssertEqualVectors(a,b);
		
	}

}
