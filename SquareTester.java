import java.awt.Color;
import java.util.Scanner;


public class SquareTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		float x = 0;
		float y = 0;
		float side = 0;
		
			
		// Continue assignment 4 here		
		Square squareOne = new Square(x, y, side);
		Square squareTwo = new Square(x, y, side);
		
		System.out.println("What are the x coordinate, y coordinate, and side for the first square?");
		x = input.nextFloat();
		y = input.nextFloat();
		side = input.nextFloat();
		squareOne = new Square(x, y, side);
		
		StdDraw.setXscale(-10, 10);
		StdDraw.setYscale(-10, 10);
		squareOne.draw();
		
		System.out.println("What are the x coordinate, y coordinate, and side for the second square?");
		x = input.nextFloat();
		y = input.nextFloat();
		side = input.nextFloat();
		squareTwo = new Square(x, y, side);
		squareTwo.draw();
		squareTwo.setColor(Color.MAGENTA);
		squareTwo.draw();
		
		System.out.println("What are the new x and y coordinates for the first square?");
		x = input.nextFloat();
		y = input.nextFloat();
		squareOne.move(x, y);
		squareOne.draw();
		
		if (squareOne.side > squareTwo.side){
			System.out.println("Square One has the larger area");
			squareOne.setColor(Color.RED);
			squareOne.draw();
		}
		else if (squareTwo.side > squareOne.side){
			System.out.println("Square Two has the larger area");
			squareTwo.setColor(Color.RED);
			squareTwo.draw();
		}
		else{
			System.out.println("Both squares have the same area.");
		}
	}

}