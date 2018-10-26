package collision;

public class Vector2D {
	public float x;
	public float y;

	public Vector2D() {
	}

	public Vector2D(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public String toString() {
		return "Creating vectors is fun!";
	}

	public static class VectorMath {
		public static Vector2D add(Vector2D a, Vector2D b) {
			Vector2D r = new Vector2D();
			r.x = a.x + b.x;
			r.y = a.y + b.y;
			return r;
		}

		public static Vector2D subtract(Vector2D a, Vector2D b) {
			Vector2D r = new Vector2D();
			r.x = a.x - b.x;
			r.y = a.y - b.y;
			return r;
		}

		public static Vector2D negate(Vector2D v) {
			Vector2D n = new Vector2D();
			n.x = -v.x;
			n.y = -v.y;
			return n;
		}

		public static boolean equalFloats(float a, float b) {
			float threshold = 1.0f / 8192.0f;
			return Math.abs(a - b) < threshold;
		}

		public static void assertEqualVectors(Vector2D a, Vector2D b) {
			assert (equalFloats(a.x, b.x));
			assert (equalFloats(a.y, b.y));

		}

		public static Vector2D multiply(Vector2D v, float scalar) {
			Vector2D r = new Vector2D();
			r.x = v.x * scalar;
			r.y = v.y * scalar;
			return r;
		}

		public static Vector2D divide(Vector2D v, float divisor) {
			Vector2D r = new Vector2D();
			r.x = v.x / divisor;
			r.y = v.y / divisor;
			return r;
		}

		public static float length(Vector2D v) {
			return (float) Math.sqrt(v.x * v.x + v.y * v.y);
		}

		public static Vector2D unitVector(Vector2D v) {
			float length = length(v);
			if (0 < length) {
				return divide(v, length);
			}
			return v;
		}

		public static float degreesToRadians(float degrees) {
			return (float) Math.toRadians(degrees);
		}

		public static Vector2D rotate(Vector2D v, float degrees) {
			float radian = degreesToRadians(degrees);
			float sine = (float) Math.sin(radian);
			float cosine = (float) Math.cos(radian);

			Vector2D r = new Vector2D();

			r.x = v.x * cosine - v.y * sine;
			r.y = v.x * sine + v.y * cosine;
			return r;
		}

		private static float radianToDegrees(float radian) {
			return (float) Math.toDegrees(radian);
		}

		public static float dotProduct(Vector2D a, Vector2D b) {
			return a.x * b.x + a.y * b.y;
		}

		public static float enclosedAngle(Vector2D a, Vector2D b) {
			Vector2D ua = unitVector(a);
			Vector2D ub = unitVector(b);
			float dp = dotProduct(ua, ub);
			return radianToDegrees((float) Math.acos(dp));
		}

		public static Vector2D projectVector(Vector2D project, Vector2D onto) {
			float d = dotProduct(onto, onto);
			if (0 < d) {
				float dp = dotProduct(project, onto);
				return multiply(onto, dp / d);
			}
			return onto;
		}

	}
}
