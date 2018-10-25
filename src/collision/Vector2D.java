package collision;

import java.text.DecimalFormat;

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
		
		public static float Length(Vector2D v)
		{
			return (float)Math.sqrt(v.x*v.x + v.y*v.y);
		}
		
		public static Vector2D UnitVector(Vector2D v) 
		{
			float length = Length(v);
			if(0<length)
			{
				return Divide(v,length);
			}
			return v;
		}
		
		public static float DegreesToRadians(float degrees)
		{
			return (float) Math.toRadians(degrees);
		}
		
		public static Vector2D Rotate(Vector2D v, float degrees)
		{
			float radian = DegreesToRadians(degrees);
			float sine = (float) Math.sin(radian);
			float cosine = (float)Math.cos(radian);
			
			Vector2D r = new Vector2D();
			
			r.x = v.x * cosine - v.y * sine;
			r.y = v.x * sine + v.y * cosine;
			return r;
		}
		
		private static float RadianToDegrees(float radian) 
		{
			return (float) Math.toDegrees(radian);
		}
		
		public static float DotProduct(Vector2D a, Vector2D b)
		{
			return a.x * b.x + a.y * b.y;
		}
		
		public static float EnclosedAngle(Vector2D a, Vector2D b)
		{
			Vector2D ua = UnitVector(a);
			Vector2D ub = UnitVector(b);
			float dp = DotProduct(ua, ub);
			return RadianToDegrees((float) Math.acos(dp));
		}

		public static Vector2D ProjectVector(Vector2D project, Vector2D onto)
		{
			float d = DotProduct(onto, onto);
			if(0 < d)
			{
				float dp = DotProduct(project, onto);
				return Multiply(onto, dp/d);
			}
			return onto;
		}
		
		
	}
}
