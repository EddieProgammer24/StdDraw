import edu.princeton.StdDraw;

public class RobotTest{
   public static void main( String[] args ){
      StdDraw.enableDoubleBuffering();
      while( !StdDraw.mousePressed() ){
         StdDraw.clear();
         Robot.badDrawRobot(StdDraw.mouseX(), StdDraw.mouseY());
         StdDraw.show();
         StdDraw.pause(40);
      }
      while( StdDraw.mousePressed() );
      
      while( true ){
         StdDraw.clear();
         Robot.drawRobot(StdDraw.mouseX(), StdDraw.mouseY());
         StdDraw.show();
         StdDraw.pause(40);
      }      
   }
}