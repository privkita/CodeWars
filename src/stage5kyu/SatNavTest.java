package stage5kyu;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

public class SatNavTest {

	  @Test
	  public void ex1() {
	    final Point expected = new Point(0,0);
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
//	    Preloaded.display(directions);
	    assertEquals(new Point(0,0), SatNav.satNav(directions));
	  }
	  
	  @Test
	  public void ex2() {
	    final Point expected = new Point(0,0);
	    final String[] directions = new String[] {
	      "Head NORTH",
	      "Take the 2nd LEFT",
	      "Take the 2nd LEFT",      
	      "Take the NEXT LEFT",      
	      "Go straight on for 3.5km",
	      "Take the NEXT RIGHT",
	      "Go straight on for 2.3km",      
	      "Take the NEXT RIGHT",
	      "Take the NEXT RIGHT",
	      "Take the NEXT LEFT",
	      "Take the NEXT RIGHT",      
	      "Go straight on for 900m",
	      "You have reached your destination!"
	    };
//	    Preloaded.display(directions);
	    assertEquals(new Point(0,-1), SatNav.satNav(directions));
	  }

}
