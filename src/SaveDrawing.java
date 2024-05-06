import javax.swing.*;
import java.io.*;

public class SaveDrawing {
    public static void main(String[] args) throws FileNotFoundException {

        // Create a PrintWriter named pw, specifying a file or output stream
        PrintWriter pw = new PrintWriter("drawingOutput.txt");

        StdDraw.enableDoubleBuffering();

        String objectType = "Circle";

        while (true) {
            while (!StdDraw.mousePressed() && !StdDraw.hasNextKeyTyped()) {
                StdDraw.clear();
                double x = StdDraw.mouseX();
                double y = StdDraw.mouseY();
                if (objectType.equals("Circle")) {
                    StdDraw.setPenColor(StdDraw.BLACK); // Set color to black
                    StdDraw.filledCircle(x, y, 0.1);
                }
                if (objectType.equals("Square")) {
                    StdDraw.setPenColor(StdDraw.BLACK); // Set color to black
                    StdDraw.filledSquare(x, y, 0.1);
                }
                StdDraw.show();
                StdDraw.pause(40);
            }
            if (StdDraw.hasNextKeyTyped()) {
                char keyPressed = StdDraw.nextKeyTyped();
                if (keyPressed == 'c') {
                    objectType = "Circle";
                }
                if (keyPressed == 's') {
                    objectType = "Square";
                }
                if (keyPressed == 'q') {
                    pw.close();
                    System.exit(0);
                }
            }
            if (StdDraw.mousePressed()) {
                double x = StdDraw.mouseX();
                double y = StdDraw.mouseY();
                // Corrected the PrintWriter.println() statement
                pw.println(objectType + "," + x + "," + y + ",0.1");
            }

        }
    }
}
