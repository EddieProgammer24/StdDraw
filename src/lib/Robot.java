import edu.princeton.StdDraw;

public class Robot{
   public static void badDrawRobot( double x, double y ){
      StdDraw.setPenColor( StdDraw.BLUE );
      StdDraw.filledCircle( x, y, 0.25 );
   }
   
   public static void drawRobot( double x, double y ){
      StdDraw.setPenColor( StdDraw.RED );
      StdDraw.filledCircle( x, y, 0.25 );
   }
}