package collision;

import collision.Vector2D.VectorMath;

public class Circle {
	Vector2D center;
	float radius;

	public Circle() {
	}

	public Circle(Vector2D center, float radius) {
		this.center = center;
		this.radius = radius;
	}
	
	public static boolean circlesCollide(Circle a, Circle b)
	{
		float radiusSum = a.radius + b.radius;
		Vector2D distance = VectorMath.subtract(a.center, b.center);
		return VectorMath.length(distance)<=radiusSum;
	}
}
