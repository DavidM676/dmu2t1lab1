import org.w3c.dom.css.Rect;

public class RectangleRunner {
    public static void main(String args[]) {


        Rectangle plot1 = new Rectangle(150, 200);
        Rectangle plot2 = new Rectangle(125);
        Rectangle plot3 = new Rectangle();

        Rectangle[] x = {plot1, plot2, plot3};
        int total = 0;

        for (int i = 0; i < 3; i++) {

            x[i].setLength(75);
            x[i].setWidth(75);


            total += x[i].calculateArea();
        }
        System.out.println("These three plots requires " + total + " square feed of seed");




    }
}
