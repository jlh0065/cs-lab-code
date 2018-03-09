import java.awt.Color;

public class Circle {
	private float radius;
	private float x;
	private float y;
	private Color color;
	
	public Circle(){
		x= 0;
		y= 0;
		radius = 1;
		color = Color.BLUE;
	}
	
	public Circle (float x, float y, float radius, Color color){
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.color = color;
	}
	
	public void move(float newX, float newY){
		x = newX;
		y = newY;
	}
	
	public void draw(){
		StdDraw.setPenColor(color);
		StdDraw.filledCircle(x, y, radius);
	}
}
