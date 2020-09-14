import java.util.Scanner;
/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   // create a Scanner for user input
  Scanner input = new Scanner(System.in);
    
    // initialize 2 points using 4 lines to find the slope

    // declare a variable for x1
    int x1 = 3;

    // declare a variable for x2
    int x2= 8;

    // declare a variable for y1
    int y1 = 6;

    // declare a variable for y2
    int y2 = 16;

    // declare and initialize the slope of the line
     System.out.println("The slope is " + (y2 -y1)/(x2 - x1));
  }
}
