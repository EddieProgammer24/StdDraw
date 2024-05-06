import javax.swing.*;
import java.awt.*;
import java.io.*;

public class LoadDrawing {
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        String filename = "C:\\Users\\EDDIE LUNDU\\IdeaProjects\\StdDraw\\src\\drawing.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 7) {
                    String objectType = parts[0].trim();
                    int r = Integer.parseInt(parts[1].trim());
                    int g = Integer.parseInt(parts[2].trim());
                    int b = Integer.parseInt(parts[3].trim());
                    double x = Double.parseDouble(parts[4].trim());
                    double y = Double.parseDouble(parts[5].trim());
                    double size = Double.parseDouble(parts[6].trim());

                    StdDraw.setPenColor(new Color(r, g, b));
                    if (objectType.equals("circle")) {
                        StdDraw.filledCircle(x, y, size);
                    } else if (objectType.equals("square")) {
                        StdDraw.filledSquare(x, y, size);
                    }
                } else {
                    System.out.println("Invalid line: " + line);
                }
            }
            br.close();
            StdDraw.show();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
