package collision;

public class OrientedRectangle {
	Vector2D center;
	Vector2D halfExtend;
	float rotation;

	public OrientedRectangle() {
	}

	public OrientedRectangle(Vector2D center, Vector2D halfExtend, float rotation) {
		this.center = center;
		this.halfExtend = halfExtend;
		this.rotation = rotation;
	}
}
