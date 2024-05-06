import edu.princeton.StdDraw;
import java.util.ArrayList;
import java.util.List;

public class Question6RevisionXXX {
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        
        // Creating a list of integers
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println("List created: " + myList); // Print out the list

        // Another section of code to create and print the list
        List<Integer> anotherList = new ArrayList<>();
        for (int i = 4; i <= 6; i++) {
            anotherList.add(i);
        }
        System.out.println("Another list created: " + anotherList);
        
        while (!StdDraw.mousePressed()) {
            StdDraw.clear();
            Robot.badDrawRobot(StdDraw.mouseX(), StdDraw.mouseY());
            StdDraw.show();
            StdDraw.pause(40);
        }
        
        while (StdDraw.mousePressed());
        
        while (true) {
            StdDraw.clear();
            Robot.drawRobot(StdDraw.mouseX(), StdDraw.mouseY());
            StdDraw.show();
            StdDraw.pause(40);
        }
    }
}
