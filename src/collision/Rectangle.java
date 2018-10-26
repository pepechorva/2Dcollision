package collision;

public class Rectangle {
	Vector2D origin;
	Vector2D size;

	public Rectangle() {
	}

	public Rectangle(Vector2D origin, Vector2D size) {
		this.origin = origin;
		this.size = size;
	}

	public static boolean overlapping(float minA, float maxA, float minB, float maxB) {
		return minB <= maxA && minA <= maxB;
	}

	public static boolean rectanglesCollide(Rectangle a, Rectangle b) {
		float aLeft = a.origin.x;
		float aRight = aLeft + a.size.x;
		float bLeft = b.origin.x;
		float bRight = bLeft + b.size.x;
		
		float aBottom = a.origin.y;
		float aTop = aBottom + a.size.y;
		float bBottom = b.origin.y;
		float bTop = bBottom + b.size.y;
		
		return overlapping(aLeft, aRight, bLeft, bRight) && overlapping(aBottom, aTop, bBottom, bTop);
	}
}
