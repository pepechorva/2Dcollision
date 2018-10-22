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
	}
}
