package collision;

public class Vector2D {
	public float x;
	public float y;

	public Vector2D(){}
	
	public Vector2D(float x,float y) 
	{
		this.x = x;
		this.y = y;
	}
	
	public static class VectorMath
	{
		public static Vector2D Add(Vector2D a, Vector2D b)
		{
			Vector2D r = new Vector2D();
			r.x = a.x + b.x;
			r.y = a.y + b.y;
			return r;
		}
		
		public static Vector2D Subtract(Vector2D a, Vector2D b)
		{
			Vector2D r = new Vector2D();
			r.x = a.x - b.x;
			r.y = a.y - b.y;
			return r;
		}
		
		public static Vector2D Negate(Vector2D v)
		{
			Vector2D n = new Vector2D();
			n.x = -v.x;
			n.y = -v.y;
			return n;
		}
		
		public static boolean EqualFloats(float a, float b)
		{
			float threshold = 1.0f/8192.0f;
			return Math.abs(a-b) < threshold;
		}
		
		public static void AssertEqualVectors(Vector2D a, Vector2D b)
		{
			assert(EqualFloats(a.x,b.x));
			assert(EqualFloats(a.y,b.y));
			
		}
		
		public static Vector2D Multiply(Vector2D v, float scalar)
		{
			Vector2D r = new Vector2D();
			r.x = v.x * scalar;
			r.y = v.y * scalar;
			return r;
		}
		
		public static Vector2D Divide(Vector2D v, float divisor)
		{
			Vector2D r = new Vector2D();
			r.x = v.x/divisor;
			r.y = v.y/divisor;
			return r;
		}
	}
}
