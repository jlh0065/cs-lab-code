import java.awt.Color;

public class Square {

	float x;
	float y;
	float side;
	Color color;
	
	public Square() {
		x = 0;
		y = 0;
		side = 1;
		color = Color.BLACK;
	}
	
	public Square(float x, float y) {
		this.x = x;
		this.y = y;
		side = 1;
		color = Color.BLACK;
	}
	
	public Square(float x, float y, float side) {
		this.x = x;
		this.y = y;
		this.side = side;
		color = Color.BLACK;
	}
	
	public void draw(){
		StdDraw.setPenColor(color);
		StdDraw.filledSquare(x, y, side);
	}
	
	public void setColor(Color newColor){
		color = newColor;
	}
	
	public void move(float newX, float newY){
		x = newX;
		y = newY;
	}
}