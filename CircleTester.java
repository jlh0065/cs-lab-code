import java.awt.Color;


public class CircleTester {

	public static void main(String[] args) {
		Circle circleOne = new Circle();
		Circle circleTwo = new Circle(1, 1, 0.5f, Color.YELLOW);
		
		StdDraw.setXscale(-4, 4);
		StdDraw.setYscale(-4, 4);
		
		float x = 0;
		float y = 0;
		float delta = 0.01f;
		
		while (true){
		StdDraw.clear();	
			
		circleOne.draw();
		circleTwo.draw();
		
		x += delta;
		y += delta;
		
		circleOne.move(x, y);
		
		StdDraw.show(20);
		}
	}

}
