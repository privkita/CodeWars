package stage5kyu;

import java.awt.Point;

public class SatNav {

	public static Point satNav(final String[] directions) {

		Point actualPoint = new Point(0, 0);
		int direction = changeDirection(0, directions[0].substring(5));
		int distance;

		for (int i = 1; i < directions.length; i++) {

			if (directions[i].contains("Take")) {
				if (directions[i].contains("NEXT")) 
					actualPoint = take(10, actualPoint, direction);
				
				if (directions[i].contains("2nd")) 
					actualPoint = take(20, actualPoint, direction);
				
				if (directions[i].contains("3rd")) 
					actualPoint = take(30, actualPoint, direction);
				
				if (directions[i].contains("4th")) 
					actualPoint = take(40, actualPoint, direction);
					
				if (directions[i].contains("5th")) 
					actualPoint = take(50, actualPoint, direction);
			}
			
			if (directions[i].contains("LEFT"))
				direction = changeDirection(direction, "LEFT");
			
			if (directions[i].contains("RIGHT"))
				direction = changeDirection(direction, "RIGHT");
				
			if (directions[i].contains("Go straight")) {
				distance = setDistance(directions[i].substring(19));
				actualPoint = go(direction, distance, actualPoint);
			}
			
			if (directions[i].contains("Turn around!")) {
				direction = changeDirection(direction, "Turn around!");
			}

		}

		return actualPoint;
	}
	public static Point take(int distance, Point actualPoint, int actualDirection) {
		
		switch(actualDirection) {
		case 0:
			if ((actualPoint.y % 10) != 0) {
				if (actualPoint.y >= 0)
					return new Point(actualPoint.x, actualPoint.y - (actualPoint.y % 10) + distance);
				if (actualPoint.y < 0)
					return new Point(actualPoint.x, actualPoint.y - (actualPoint.y % 10 + 10) + distance);
			} else 
				return new Point(actualPoint.x, actualPoint.y + distance);
			
		case 1: 
			if ((actualPoint.x % 10) != 0) {
				if (actualPoint.x >= 0)
					return new Point(actualPoint.x - (actualPoint.x % 10) + distance, actualPoint.y);
				if (actualPoint.x < 0)
					return new Point(actualPoint.x - (actualPoint.x % 10 + 10) + distance, actualPoint.y);
			} else
				return new Point(actualPoint.x + distance, actualPoint.y);
			
		case 2: 
			if ((actualPoint.y % 10) != 0) {
				if (actualPoint.y >= 0)
					return new Point(actualPoint.x, actualPoint.y  - (actualPoint.y % 10 - 10) - distance);
				if (actualPoint.y < 0)
					return new Point(actualPoint.x, actualPoint.y  - (actualPoint.y % 10) - distance);
			} else
				return new Point(actualPoint.x, actualPoint.y - distance);
			
		case 3: 
			if ((actualPoint.x % 10) != 0) {
				if (actualPoint.x >= 0)
					return new Point(actualPoint.x - (actualPoint.x % 10 - 10) - distance, actualPoint.y);
				if (actualPoint.x < 0)
					return new Point(actualPoint.x - (actualPoint.x % 10) - distance, actualPoint.y);
			} else
				return new Point(actualPoint.x - distance, actualPoint.y);
	
		default: 
			return new Point();
		}
	}
	public static Point go(int actualDirection, int distance, Point actualPoint) {
		
		switch (actualDirection) {
		case 0 : return new Point(actualPoint.x, actualPoint.y + distance);
		case 1 : return new Point(actualPoint.x + distance, actualPoint.y);
		case 2 : return new Point(actualPoint.x, actualPoint.y - distance);
		case 3 : return new Point(actualPoint.x - distance, actualPoint.y);
		default: return new Point(actualPoint.x, actualPoint.y);
		}
	}

	public static int changeDirection(int actualDirection, String direct) {

		switch (direct) {
		case "NORTH": return 0;
		case "EAST": return 1;
		case "SOUTH": return 2;
		case "WEST": return 3;
		case "LEFT": actualDirection -= 1;
			if (actualDirection == -1)
				return 3;
			else
				return actualDirection % 4;
		case "RIGHT": return (actualDirection + 1) % 4;
		case "Turn around!": return (actualDirection + 2) % 4;
		default: return actualDirection;
		}
		
	}
	
	public static int setDistance(String distance) {
		
		if (distance.contains("km"))
			return (int) (Double.parseDouble(distance.substring(0, distance.length()-2))*10);
		else
			return (int) (Double.parseDouble(distance.substring(0, distance.length()-1))/100);

	}

	public static void main(String[] args) {
		
		final String[] directions = new String[] {
				"Head EAST",
			      "Take the 2nd LEFT",
			      "Take the NEXT LEFT",
			      "Take the NEXT LEFT",
			      "Go straight on for 1.5km",
			      "Take the NEXT RIGHT",
			      "Take the 2nd RIGHT",
			      "Go straight on for 1.7km",
			      "Turn around!",
			      "Take the NEXT LEFT",
			      "Go straight on for 1.0km",
			      "You have reached your destination!"
			    };
		System.out.println(satNav(directions));

	}

}
