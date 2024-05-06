import edu.princeton.StdDraw;

public class Robot{
   public static void badDrawRobot( double x, double y ){
      double bodyWidth = 0.5;
      double bodyHeight = 0.5;
      double headSize = 0.2;
      double armLength = 0.4;

      //Draw Body
      StdDraw.setPenColor( StdDraw.BLUE );
      StdDraw.filledRectangle( x, y, bodyWidth / 2, bodyHeight / 2 );

      //Draw Head
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.filledCircle(x,y + (bodyHeight / 2) + headSize, headSize);

      //Draw Arms
      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.line(x - (bodyWidth / 2), y, x - (bodyWidth / 2) - armLength, y);
      StdDraw.line(x + (bodyWidth / 2), y,x + (bodyWidth / 2) + armLength, y);

      // Draw legs
      StdDraw.line(x - (bodyWidth / 4), y - (bodyHeight / 2), x - (bodyWidth / 4), y - (bodyHeight / 2) - 0.4);
      StdDraw.line(x + (bodyWidth / 4), y - (bodyHeight / 2), x + (bodyWidth / 4), y - (bodyHeight / 2) - 0.4);
   }
   
   public static void drawRobot( double x, double y ){
      double bodyWidth = 0.5;
      double bodyHeight = 0.5;
      double headSize = 0.2;
      double eyeSize = 0.05;
      double eyebrowLength = 0.1;

      // Draw body
      StdDraw.setPenColor(StdDraw.RED);
      StdDraw.filledRectangle(x, y, bodyWidth / 2, bodyHeight / 2);

      // Draw head
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.filledCircle(x, y + (bodyHeight / 2) + headSize, headSize);

      // Draw eyes
      StdDraw.setPenColor(StdDraw.WHITE);
      StdDraw.filledCircle(x - (headSize / 3), y + (bodyHeight / 2) + (headSize / 3), eyeSize); // Left eye
      StdDraw.filledCircle(x + (headSize / 3), y + (bodyHeight / 2) + (headSize / 3), eyeSize); // Right eye

      // Draw eyebrows
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.line(x - (headSize / 2), y + (bodyHeight / 2) + (headSize / 3) + (eyeSize / 2),
              x - (headSize / 2) - eyebrowLength, y + (bodyHeight / 2) + (headSize / 3) + (eyeSize / 2)); // Left eyebrow
      StdDraw.line(x + (headSize / 2) + eyebrowLength, y + (bodyHeight / 2) + (headSize / 3) + (eyeSize / 2),
              x + (headSize / 2), y + (bodyHeight / 2) + (headSize / 3) + (eyeSize / 2)); // Right eyebrow

      // Draw mouth
      double mouthWidth = 0.1;
      double mouthHeight = 0.03;
      StdDraw.filledRectangle(x, y + (bodyHeight / 2) + (headSize / 3) - (headSize / 4), mouthWidth / 2, mouthHeight / 2); // Mouth
   }
}